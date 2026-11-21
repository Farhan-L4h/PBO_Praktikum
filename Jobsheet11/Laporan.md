# Laporan Praktikum PBO — Pertemuan 11
## SOLID Principle dan Collections

## Identitas

| Keterangan | Data |
| --- | --- |
| **Nama** | Muhammad Farhan |
| **NIM** | 264107023002 |
| **No** | 14 |
| **Kelas** | TI 2G |



---

## Laporan Hasil Pengerjaan Praktikum dan Tugas

### Langkah 1–2: Kelas Dasar, Subclass, dan Interface

Berkas yang dibuat: `Customer.java`, `InsufficientBalanceException.java`, `Account.java` (abstract), `InterestBearing.java` (interface), `SavingsAccount.java`, `CheckingAccount.java`.

Hasil compile: **berhasil tanpa error**. Belum ada output program karena `Main` belum dibuat (sesuai checkpoint jobsheet).

### Langkah 3: Bank Berbasis Array dan Program Utama (Baseline)

Berkas yang dibuat: `Bank.java` (penyimpanan `Account[]` dengan penghitung `count`), `Main.java`.

Hasil compile: **berhasil tanpa error**. Output program (7 baris, sama persis dengan jobsheet):

```
Withdrawal failed: A003: insufficient balance for a withdrawal of 70000.0
Withdrawal succeeded, new balance: 70000.0
A001 interest applied, new balance: 505000.0
A001 monthly fee: 0.0
A002 monthly fee: 15000.0
A003 interest applied, new balance: 71400.0
A003 monthly fee: 0.0
```

Checkpoint: **tercapai** — penarikan 70000 ditolak (saldo minimum Rp 50.000 terjaga), penarikan 30000 berhasil, bunga hanya untuk SavingsAccount (A001: 500000 → 505000, A003: 70000 → 71400).

<!-- Tambahkan screenshot output Langkah 3 di sini, mis. ![Output Langkah 3](./img/langkah3.png) -->

### Langkah 4: Bank Beralih dari Array ke Map

Perubahan: `Bank.java` sekarang memakai `Map<String, Account> accounts = new LinkedHashMap<>()`; `addAccount()` menolak nomor rekening duplikat lewat `containsKey()`, `findAccount()` langsung memakai `accounts.get()`, dan semua loop menjadi `for (Account acc : accounts.values())`. `Main.java`: `new Bank(10)` → `new Bank()`.

Hasil compile: **berhasil tanpa error**. Output program **identik dengan Langkah 3** (7 baris yang sama):

```
Withdrawal failed: A003: insufficient balance for a withdrawal of 70000.0
Withdrawal succeeded, new balance: 70000.0
A001 interest applied, new balance: 505000.0
A001 monthly fee: 0.0
A002 monthly fee: 15000.0
A003 interest applied, new balance: 71400.0
A003 monthly fee: 0.0
```

Checkpoint: **tercapai** — yang berubah hanya cara penyimpanan, bukan perilaku. `LinkedHashMap` menjaga urutan penambahan sehingga A001, A002, A003 tetap berurutan.

### Langkah 5: Transaction — Single Responsibility Principle

Berkas baru: `TransactionType.java` (enum `DEPOSIT, WITHDRAW`), `Transaction.java` (satu kelas hanya mewakili satu transaksi). Perubahan: `Account.java` menyimpan `List<Transaction> history` dan mencatat transaksi hanya setelah `deposit()`/`withdraw()` berhasil; `Bank.java` mendapat `printHistory(String accountNumber)`; `Main.java` memanggil `bank.printHistory("A003")`.

Hasil compile: **berhasil tanpa error**. Output program (7 baris sebelumnya + 2 baris riwayat):

```
Withdrawal failed: A003: insufficient balance for a withdrawal of 70000.0
Withdrawal succeeded, new balance: 70000.0
A001 interest applied, new balance: 505000.0
A001 monthly fee: 0.0
A002 monthly fee: 15000.0
A003 interest applied, new balance: 71400.0
A003 monthly fee: 0.0
A003 WITHDRAW 30000.0
A003 DEPOSIT 1400.0
```

Checkpoint: **tercapai** — penarikan 70000 yang gagal tidak tercatat; penarikan 30000 tercatat sebagai `WITHDRAW`; bunga A003 (2% × 70000 = 1400) tercatat sebagai `DEPOSIT` karena `applyInterest()` menyetor lewat `deposit()`.

### Langkah 6: AccountRepository — Dependency Inversion Principle

Berkas baru: `AccountRepository.java` (interface: `save`, `findByNumber`, `findAll`), `InMemoryAccountRepository.java` (implementasi dengan `LinkedHashMap`). Perubahan: `Bank.java` tidak lagi memegang Map sendiri, melainkan bergantung pada interface lewat constructor `Bank(AccountRepository repository)`; `Main.java` memakai `new Bank(new InMemoryAccountRepository())`.

Hasil compile: **berhasil tanpa error**. Output program **sama persis dengan Langkah 5**:

```
Withdrawal failed: A003: insufficient balance for a withdrawal of 70000.0
Withdrawal succeeded, new balance: 70000.0
A001 interest applied, new balance: 505000.0
A001 monthly fee: 0.0
A002 monthly fee: 15000.0
A003 interest applied, new balance: 71400.0
A003 monthly fee: 0.0
A003 WITHDRAW 30000.0
A003 DEPOSIT 1400.0
```

Checkpoint: **tercapai** — Bank tidak tahu bahwa penyimpanannya berupa Map; ia hanya memanggil method milik `AccountRepository`. Pemilihan implementasi dilakukan oleh `Main`.

<!-- Tambahkan screenshot output Langkah 6 di sini, mis. ![Output Langkah 6](./img/langkah6.png) -->

### Langkah 7: Menelusuri OCP, LSP, dan ISP (tanpa kode baru)

**7a. Open/Closed Principle.** Pencarian kata `SavingsAccount` dan `CheckingAccount` di `Account.java` dan `Bank.java` menghasilkan **0 kemunculan**. Aturan penarikan yang berbeda (saldo minimum vs overdraft) ditulis lewat override `canWithdraw()` di subclass, tanpa mengubah Account dan Bank.

**7b. Liskov Substitution Principle.** Satu baris polimorfik `acc.monthlyFee()` di `processMonthEnd()` menghasilkan biaya berbeda per jenis rekening:

```
A001 monthly fee: 0.0
A002 monthly fee: 15000.0
A003 monthly fee: 0.0
```

Tidak ada cabang `if/else` per jenis rekening; kedua subclass menggantikan `Account` tanpa membuat program salah.

**7c. Interface Segregation Principle.** Kata `InterestBearing` ditemukan di `SavingsAccount.java` (baris `implements InterestBearing`) dan **tidak muncul sama sekali** di `CheckingAccount.java`. CheckingAccount tidak dipaksa mengimplementasikan `applyInterest()` yang tidak relevan baginya.

Checkpoint: **ketiganya tercapai**.

---

## Tugas Mandiri

### 1. BusinessAccount — membuktikan OCP, LSP, dan ISP lewat kode baru

Berkas baru `BusinessAccount.java` (rekening bisnis, saldo minimum Rp 1.000.000, tidak berbunga). Mengikuti pola SavingsAccount dan CheckingAccount: hanya menulis hal yang berbeda lewat override, sisanya diwarisi dari Account.

```java
package id.ac.polinema;

public class BusinessAccount extends Account {
    private static final double MINIMUM_BALANCE = 1000000;

    public BusinessAccount(String accountNumber, Customer owner, double balance) {
        super(accountNumber, owner, balance);
    }

    @Override
    protected boolean canWithdraw(double amount) {
        return amount > 0 && (getBalance() - amount) >= MINIMUM_BALANCE;
    }

    @Override
    public double monthlyFee() {
        return 0;
    }

    @Override
    public void printInfo() {
        super.printInfo();
        System.out.println("Account type: Business");
    }
}
```

Penjelasan singkat:

- `canWithdraw()` menahan saldo minimum Rp 1.000.000 (pola sama dengan SavingsAccount, hanya konstanta yang berbeda).
- `monthlyFee()` mengembalikan 0 — rekening bisnis tidak dikenai biaya bulanan.
- `printInfo()` memanggil `super.printInfo()` lalu menambah baris jenis rekening.
- BusinessAccount **tidak** meng-implement `InterestBearing`, karena rekening bisnis tidak berbunga.

Perubahan `Main.java` (sesuai Figure 30 jobsheet): menambah nasabah Budi dan rekening A004, mendaftarkannya ke Bank, lalu memanggil `processMonthEnd()` dan `printAllAccounts()`.

```java
Customer customer4 = new Customer("Budi", "0812-0000-0004");
BusinessAccount business = new BusinessAccount("A004", customer4, 2000000);

Bank bank = new Bank(new InMemoryAccountRepository());
bank.addAccount(acc1);
bank.addAccount(acc2);
bank.addAccount(savings);
bank.addAccount(business);
bank.processMonthEnd();
bank.printAllAccounts();
```

Hasil compile: **berhasil tanpa error**. Output program lengkap setelah tugas mandiri:

```
Withdrawal failed: A003: insufficient balance for a withdrawal of 70000.0
Withdrawal succeeded, new balance: 70000.0
A001 interest applied, new balance: 505000.0
A001 monthly fee: 0.0
A002 monthly fee: 15000.0
A003 interest applied, new balance: 71400.0
A003 monthly fee: 0.0
A004 monthly fee: 0.0
A001 - Nadia - balance: 505000.0
Account type: Savings, interest rate: 0.01
A002 - Sari - balance: 200000.0
Account type: Checking, overdraft limit: 50000.0
A003 - Rian - balance: 71400.0
Account type: Savings, interest rate: 0.02
A004 - Budi - balance: 2000000.0
Account type: Business
A003 WITHDRAW 30000.0
A003 DEPOSIT 1400.0
```

<!-- Tambahkan screenshot output Tugas mandiri di sini, mis. ![Output Tugas Mandiri](./img/tugas-mandiri.png) -->

**Bukti Open/Closed + Liskov Substitution.** Baris `A004 monthly fee: 0.0` muncul di antara baris `processMonthEnd()` yang lain, dan `A004 - Budi - balance: 2000000.0` diikuti `Account type: Business` muncul di `printAllAccounts()` — persis seperti SavingsAccount dan CheckingAccount diproses sebelumnya. Keduanya dibuktikan **tanpa mengubah satu baris pun** `Account.java` atau `Bank.java` (diverifikasi dengan diff terhadap snapshot state Langkah 6: kedua berkas identik).

**Bukti Interface Segregation.** Tidak ada baris `A004 interest applied` di seluruh output (0 kemunculan), sebab BusinessAccount tidak meng-implement `InterestBearing`. Ia tidak dipaksa menyediakan `applyInterest()` yang tidak relevan baginya.

**Verifikasi tambahan aturan penarikan** (uji sementara di luar proyek, sudah dihapus): dari saldo 2000000, penarikan 1500000 ditolak dengan `InsufficientBalanceException` (sisa 500000 < minimum 1000000), sedangkan penarikan 1000000 berhasil (sisa tepat 1000000) dan tercatat di riwayat sebagai `WITHDRAW 1000000.0`.

### 2. Jawaban konsep

**(a)** Prinsip yang dibuktikan adalah **Open/Closed Principle (OCP)**: `Account` dan `Bank` tertutup untuk diubah, tetapi terbuka untuk diperluas lewat subclass baru. Semua aturan BusinessAccount yang berbeda (saldo minimum, biaya bulanan, jenis rekening) ditulis sebagai override `canWithdraw()`, `monthlyFee()`, dan `printInfo()`, sementara Bank memproses semua rekening secara polimorfik lewat tipe `Account` tanpa pernah menyebut nama kelas konkret. Karena itu, menambah jenis rekening baru tidak perlu menyentuh kode lama sama sekali.

**(b)** Karena yang diperiksa adalah **kemampuan** (interface `InterestBearing`), bukan nama kelas tertentu. BusinessAccount tidak meng-implement `InterestBearing`, sehingga `acc instanceof InterestBearing` otomatis bernilai false dan cabang pemberian bunga dilewati — tanpa Bank perlu tahu bahwa BusinessAccount ada. Subclass Account apa pun di masa depan akan diperlakukan benar dengan cara yang sama: bunga hanya diberikan jika ia meng-implement interface tersebut.

**(c)** Karena **Dependency Inversion Principle (DIP)**: `Bank` bergantung pada abstraksi `AccountRepository` (interface), bukan pada kelas konkret `InMemoryAccountRepository`. Kelas penyimpanan database cukup meng-implement interface yang sama (`save`, `findByNumber`, `findAll`), dan hanya kode perakit di `Main` yang diganti, misalnya `new Bank(new DatabaseAccountRepository())`. `Bank.java` tidak perlu diubah satu baris pun karena ia hanya mengenal kontrak method milik interface, bukan detail penyimpanannya.

