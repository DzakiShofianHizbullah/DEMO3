import java.util.Scanner;

/**
 * Kelas utama (entry point) untuk menjalankan program Kalkulator Kalori Harian.
 * Kelas ini bertanggung jawab atas interaksi I/O (input/output) dengan pengguna
 * dan mengoordinasikan objek UserProfile dan KaloriCalculator.
 *
 * @author [Dzaki Shofian Hizbuallah]
 * @version 1.0
 */
public class Main {
    /**
     * Metode utama yang dieksekusi saat program dimulai.
     * Metode ini mengambil input pengguna, melakukan perhitungan, dan menampilkan hasilnya.
     *
     * @param args Argumen baris perintah.
     */
    public static void main(String[] args) {
        // PERBAIKAN: Hanya satu 'new' saat membuat objek Scanner
        Scanner input = new Scanner(System.in);

        // --- Input Data Pengguna ---
        System.out.print("Masukkan jenis kelamin (pria/wanita): ");
        String gender = input.nextLine();

        System.out.print("Masukkan berat badan (kg): ");
        double berat = input.nextDouble();

        System.out.print("Masukkan tinggi badan (cm): ");
        double tinggi = input.nextDouble();

        System.out.print("Masukkan usia (tahun): ");
        int usia = input.nextInt();

        System.out.println("Pilih tingkat aktivitas: ");
        System.out.println("1. Rendah");
        System.out.println("2. Sedang");
        System.out.println("3. Tinggi");
        int aktivitas = input.nextInt();

        // --- Proses Perhitungan ---
        // 1. Buat objek UserProfile dengan data yang diinput
        UserProfile user = new UserProfile(gender, berat, tinggi, usia, aktivitas);

        // 2. Buat objek KaloriCalculator
        KaloriCalculator kalkulator = new KaloriCalculator();

        // 3. Hitung total kalori harian
        double totalKalori = kalkulator.hitungKaloriHarian(user);

        // --- Output Hasil ---
        System.out.println("\nKebutuhan kalori harian Anda: " + totalKalori + " kkal");

        input.close();
    }
}