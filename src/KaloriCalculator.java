/**
 * Kelas ini menyediakan metode untuk menghitung BMR (Basal Metabolic Rate)
 * dan kebutuhan kalori harian (Total Daily Energy Expenditure)
 * berdasarkan data dari objek UserProfile.
 *
 * @author [Ganti dengan Nama Anda]
 * @version 1.0
 */
public class KaloriCalculator {

    /**
     * Menghitung Basal Metabolic Rate (BMR) pengguna menggunakan rumus Mifflin-St Jeor.
     * BMR adalah jumlah kalori yang dibutuhkan tubuh untuk fungsi dasar saat istirahat.
     *
     * @param user Objek UserProfile yang berisi jenis kelamin, berat, tinggi, dan usia.
     * @return Nilai BMR yang dihitung dalam kkal (Kilokalori).
     */
    public double hitungBMR(UserProfile user) {
        if (user.getJenisKelamin().equalsIgnoreCase("pria")) {
            // Rumus BMR Pria
            return 88.362 + (13.397 * user.getBerat()) + (4.799 * user.getTinggi()) - (5.677 * user.getUsia());
        } else {
            // Rumus BMR Wanita
            return 447.593 + (9.247 * user.getBerat()) + (3.098 * user.getTinggi()) - (4.330 * user.getUsia());
        }
    }

    /**
     * Menghitung total kebutuhan kalori harian (TDEE) pengguna.
     * Rumusnya: BMR x Faktor Aktivitas.
     *
     * @param user Objek UserProfile yang berisi tingkat aktivitas (1, 2, atau 3).
     * @return Total kebutuhan kalori harian dalam kkal.
     */
    public double hitungKaloriHarian(UserProfile user) {
        double faktor;
        // Penentuan faktor pengali berdasarkan tingkat aktivitas
        switch (user.getAktivitas()) {
            case 1 -> faktor = 1.2;     // Rendah: Sedikit/tidak ada latihan
            case 2 -> faktor = 1.55;    // Sedang: Latihan 3-5 hari/minggu
            case 3 -> faktor = 1.725;   // Tinggi: Latihan berat 6-7 hari/minggu
            default -> faktor = 1.2;    // Default ke Rendah jika input tidak valid
        }
        return hitungBMR(user) * faktor;
    }
}