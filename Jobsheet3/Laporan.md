# Laporan Praktikum PBO – Pertemuan 3

## Identitas

| Keterangan | Data            |
| ---------- | --------------- |
| **Nama**   | Muhammad Farhan |
| **NIM**    | 264107023002    |
| **No**     | 14              |
| **Kelas**  | TI 2G           |

---

## Percobaan

### 3.1 Percobaan 1 – `Enkapsulasi`

![Percobaan 1](./IMG/Percobaan%203.1.png)

### 3.2 Percobaan 2 – `Access Modifier`

![Percobaan 2](./IMG/Percobaan%203.2.png)

### 3.3 Percobaan 3 – `Getter dan Setter`

![Percobaan 3](./IMG/Percobaan%203.4.png)

### 3.4 Percobaan 4 – `Konstruktor dan Instansiasi`

![Percobaan 4](./IMG/Percobaan%203.5%201.png)

![Percobaan 4](./IMG/Percobaan%203.5%202.png)

### 3.5 Pertanyaan Percobaan 3 dan 4

1. Apa yang dimaksud getter dan setter?

   Getter adalah method yang digunakan untuk mengambil atau membaca nilai dari atribut
   private, sedangkan setter adalah method yang digunakan untuk mengubah atau memberikan
   nilai pada atribut private.

2. Apa kegunaan dari method `getSimpanan()`?

   Method `getSimpanan()` digunakan untuk mendapatkan atau membaca nilai saldo/simpanan
   anggota karena atribut simpanan bersifat private.

3. Method apa yang digunakan untuk menambah saldo?

   Method yang digunakan untuk menambah saldo adalah `setor()`.

4. Apa yang dimaksud konstruktor?

   Konstruktor adalah method khusus pada class yang dijalankan ketika objek dibuat
   menggunakan keyword `new`. Nama konstruktor harus sama dengan nama class dan tidak
   memiliki tipe return.

5. Sebutkan aturan dalam membuat konstruktor?

   Aturan membuat konstruktor:

   a. Nama konstruktor harus sama dengan nama class.
   
   b. Konstruktor tidak memiliki tipe data return.
   
   c. Konstruktor tidak boleh menggunakan modifier `abstract`, `static`, `final`, dan
      `synchronized`.

6. Apakah boleh konstruktor bertipe private?

   Boleh. Konstruktor dapat menggunakan access modifier `private`. Konstruktor private
   digunakan untuk membatasi pembuatan objek dari luar class, misalnya pada pola Singleton.

7. Kapan menggunakan konstruktor dengan passing parameter?

   Konstruktor dengan passing parameter digunakan ketika objek membutuhkan nilai tertentu
   atau spesifik saat pertama kali dibuat. Contohnya nama dan alamat pada class Anggota.

8. Apa perbedaan inisialisasi atribut dan instansiasi atribut?

   Inisialisasi atribut adalah memberikan nilai awal pada atribut. Instansiasi adalah
   membuat objek dari suatu class menggunakan keyword `new`.

9. Apa perbedaan inisialisasi method dan instansiasi method?

   Method tidak dibuat dengan proses instansiasi seperti objek. Method didefinisikan di
   dalam class, kemudian dipanggil melalui objek yang telah dibuat.

## Tugas

### 1. EncapTest

![Tugas 1](./IMG/Tugas%201.png)

### 2. Validasi Nilai `age`

Pada program di atas, pada class `EncapTest` kita mengeset `age` dengan nilai 35,
namun pada saat ditampilkan ke layar nilainya 30. Jelaskan mengapa.

**Jawab:**

Nilai `age` menjadi 30 karena pada method `setAge()` terdapat kondisi yang membatasi
nilai maksimal `age` sebesar 30. Ketika nilai yang diberikan adalah 35, kondisi
`newAge > 30` terpenuhi sehingga nilai `age` otomatis diubah menjadi 30.

### 3. Validasi Rentang Nilai `age`

Ubah program di atas agar atribut `age` dapat diberi nilai maksimal 30 dan minimal 18.

![Tugas 3](./IMG/Tugas%203.png)

### 4. Class `Kontainer`

Pada sebuah sistem manajemen pergudangan kargo ekspedisi, terdapat class `Kontainer`
yang memiliki atribut antara lain `nomorResi`, `namaPemilik`, `kapasitasMaksimal`
(dalam kg), dan `beratMuatanSaatIni`. Kontainer dapat menerima tambahan muatan barang
dengan batasan kapasitas maksimal yang telah ditentukan. Kontainer juga dapat diturunkan
muatannya (bongkar muat). Ketika barang diturunkan, jumlah muatan saat ini akan berkurang
sesuai dengan nominal berat yang dikeluarkan.

Buatlah class `Kontainer` tersebut, berikan atribut private, method getter, dan konstruktor
sesuai dengan kebutuhan arsitektur enkapsulasi. Uji dengan kelas driver `TestLogistik`
berikut untuk memeriksa apakah manajemen state kelas telah berjalan dengan benar.

![Tugas 4](./IMG/Tugas%204.png)

### 5. Batas Pembongkaran Muatan

Modifikasi soal kargo logistik di atas agar nominal berat muatan yang dibongkar/diturunkan
dalam satu kali pemanggilan method `turunkanMuatan()` maksimal hanya boleh sebesar 50%
dari total berat muatan saat ini. Langkah ini diterapkan demi alasan keselamatan kerja
operasional alat berat (crane).

Jika operator mencoba menurunkan muatan melebihi batas 50% tersebut, sistem harus
memblokir aksi dan memunculkan peringatan berikut:

> "Maaf, demi keselamatan, pembongkaran muatan satu kali jalan tidak boleh melebihi
> 50% dari muatan saat ini!"

![Tugas 5](./IMG/Tugas%205.png)

### 6. Input Dinamis dengan `Scanner`

Modifikasi kelas `Main TestLogistik` agar parameter jumlah berat barang yang dimasukkan
(`tambahMuatan`) maupun berat barang yang dibongkar (`turunkanMuatan`) dapat menerima
input nilai dinamis dari pengguna secara interaktif melalui terminal menggunakan utilitas
`java.util.Scanner`.

![Tugas 6](./IMG/Tugas%206.png)

### 7. Aplikasi Pemesanan Tiket Bioskop

Sebuah aplikasi pemesanan tiket bioskop memerlukan kelas `Tiket` untuk mengelola data
pemesanan secara aman. Kelas ini harus memiliki atribut private:

- `judulFilm` (`String`)
- `hargaDasar` (`double`)
- `statusPembayaran` (`boolean`)

Ketentuan pengesetan nilai objek:

- Konstruktor harus menerima parameter `judulFilm` dan `hargaDasar`. Nilai awal
  `statusPembayaran` selalu diset `false` (Belum Dibayar).
- Atribut `hargaDasar` tidak boleh bernilai negatif. Jika input yang dimasukkan kurang dari
  0, otomatis set nilai default ke Rp35.000.
- Sediakan method `lakukanPembayaran()` untuk mengubah `statusPembayaran` menjadi `true`.
- Nilai `statusPembayaran` hanya boleh dibaca (read-only) menggunakan getter. Atribut ini
  tidak boleh memiliki fungsi setter langsung dari luar kelas demi alasan keamanan transaksi.

![Tugas 7](./IMG/Tugas%207.png)

