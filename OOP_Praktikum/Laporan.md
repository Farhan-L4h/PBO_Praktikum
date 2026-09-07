# Laporan Praktikum PBO – Pertemuan 2

## Identitas

| Keterangan | Data |
|---|---|
| **Nama** | Muhammad Farhan |
| **NIM** | 264107027002 |
| **No** | 14 |
| **Kelas** | TI 2G |

---

# Langkah Praktikum

## Langkah 2: Kelas Rectangle Minimal dan Objek Pertama

Pada langkah ini dibuat kelas `Rectangle` dan sebuah objek `Rectangle` dengan ukuran `6 × 4`.

![Gambar Langkah 2](./IMG%20Laporan/Langkah%202.png)

---

## Langkah 4: Konstruktor dan `this`

Pada langkah ini ditambahkan konstruktor pada kelas `Rectangle` untuk memberikan nilai awal pada atribut `width` dan `height`.

![Gambar Langkah 4](./IMG%20Laporan/Langkah%204.png)

---

## Langkah 5: Referensi, Aliasing, dan `null`

Pada langkah ini dilakukan pengujian referensi objek, aliasing, serta penggunaan `null`.

![Gambar Langkah 5](./IMG%20Laporan/Langkah%205.png)

---

## Langkah 6: Kelas Student dari Diagram UML

Pada langkah ini dibuat kelas `Student` berdasarkan diagram UML yang diberikan.

![Gambar Langkah 6](./IMG%20Laporan/Langkah%206.png)

---

## Langkah 7: Array of Objects

Pada langkah ini dibuat array berisi beberapa objek `Rectangle` dari satu kelas.

![Gambar Langkah 7](./IMG%20Laporan/Langkah%207.png)

---

# Tugas dan Deliverable

## Tugas Mandiri

### 1. Membuat Kelas `Circle`

Buat kelas `Circle` sesuai dengan diagram UML berikut:

```text
Circle
-------------------------
- radius : double
-------------------------
+ Circle(radius : double)
+ area() : double
+ circumference() : double

```
![](./IMG%20Laporan/Tugas%20Mandiri.png)


### 2. Soal Esay 
Jawab singkat (2-3 kalimat masing-masing): (a) apa bedanya objek dengan referensi ke
objek? (b) tepatnya kapan konstruktor sebuah kelas dijalankan?

Jawaban :

A. Objek Adalah Sebuah Data yang di buat di memori, Sedangkan referensi adalah variable yang merujuk ke objek tersebut, satu objek bisa memiliki banyak referensi yang merujuk ke objek yang sama

B. Konstruktor dibuat secara otomatis ketika di objek di jalankan, dibuat dengan menggunakan kata kunci new.