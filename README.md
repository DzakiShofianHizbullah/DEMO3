# Kalkulator Kebutuhan Kalori Harian (Java)

##  Deskripsi Proyek

Proyek ini adalah implementasi kalkulator sederhana menggunakan Java untuk menghitung **Total Daily Energy Expenditure (TDEE)**, yaitu perkiraan total kebutuhan kalori harian seseorang.

Perhitungan didasarkan pada dua tahap utama:
1.  **BMR (Basal Metabolic Rate):** Jumlah kalori yang dibutuhkan tubuh saat istirahat, dihitung menggunakan **Rumus Mifflin-St Jeor** yang disesuaikan untuk pria dan wanita.
2.  **TDEE (Total Kalori Harian):** BMR dikalikan dengan faktor pengali berdasarkan tingkat aktivitas fisik pengguna.

---

## 🛠️ Struktur Kode

Proyek ini menggunakan prinsip Pemrograman Berorientasi Objek (OOP) dan dibagi menjadi tiga kelas utama:

| Kelas | Peran |
| :--- | :--- |
| **`UserProfile`** | Model data. Bertanggung jawab menyimpan data pengguna (berat, tinggi, usia, jenis kelamin, aktivitas). |
| **`KaloriCalculator`**| Logika bisnis. Bertanggung jawab atas semua perhitungan (`hitungBMR` dan `hitungKaloriHarian`). |
| **`Main`** | Eksekusi program. Bertanggung jawab atas I/O (input dari pengguna melalui *console*) dan menampilkan hasil. |

---

## 🚀 Cara Menjalankan Program

Program dijalankan melalui *console* dan memerlukan input dari pengguna.

1.  Buka dan jalankan kelas **`Main.java`** di IDE Anda (misalnya IntelliJ IDEA).
2.  Ikuti petunjuk di *console* untuk memasukkan data:
    * Jenis Kelamin (`pria`/`wanita`)
    * Berat Badan (kg)
    * Tinggi Badan (cm)
    * Usia (tahun)
    * Tingkat Aktivitas (Pilih 1, 2, atau 3)

### Faktor Aktivitas

|  Pilihan| Tingkat Aktivitas | Faktor Pengali |
|:-------| :--- | :--- |
| **1**  | Rendah | 1.2 |
| **2**  | Sedang | 1.55 |
| **3**  | Tinggi | 1.725 |
---

Dokumentasi API lengkap untuk semua kelas dan *method* dapat dilihat dengan membuka *file* **`index.html`** yang terletak di folder **`docs`** proyek ini.

## 🧑‍💻 Kontributor

* **[Dzaki Shofian Hizbullah** - Pengembang