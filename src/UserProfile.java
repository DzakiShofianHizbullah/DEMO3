/**
 * Kelas ini merepresentasikan model data untuk profil pengguna.
 * Menyimpan semua informasi fisik dan aktivitas yang dibutuhkan
 * untuk perhitungan kalori.
 *
 * @author [Ganti dengan Nama Anda]
 * @version 1.0
 */
public class UserProfile {
    private String jenisKelamin;
    private double berat;
    private double tinggi;
    private int usia;
    private int aktivitas;

    /**
     * Konstruktor untuk membuat objek UserProfile baru.
     *
     * @param jenisKelamin Jenis kelamin pengguna ("pria" atau "wanita").
     * @param berat Berat badan pengguna dalam kilogram (kg).
     * @param tinggi Tinggi badan pengguna dalam centimeter (cm).
     * @param usia Usia pengguna dalam tahun.
     * @param aktivitas Tingkat aktivitas (1=Rendah, 2=Sedang, 3=Tinggi).
     */
    public UserProfile(String jenisKelamin, double berat, double tinggi, int usia, int aktivitas) {
        this.jenisKelamin = jenisKelamin;
        this.berat = berat;
        this.tinggi = tinggi;
        this.usia = usia;
        this.aktivitas = aktivitas;
    }

    /**
     * Mendapatkan jenis kelamin pengguna.
     * @return Jenis kelamin (String).
     */
    public String getJenisKelamin() { return jenisKelamin; }

    /**
     * Mendapatkan berat badan pengguna.
     * @return Berat badan dalam kg (double).
     */
    public double getBerat() { return berat; }

    /**
     * Mendapatkan tinggi badan pengguna.
     * @return Tinggi badan dalam cm (double).
     */
    public double getTinggi() { return tinggi; }

    /**
     * Mendapatkan usia pengguna.
     * @return Usia dalam tahun (int).
     */
    public int getUsia() { return usia; }

    /**
     * Mendapatkan tingkat aktivitas pengguna.
     * @return Tingkat aktivitas (int) (1, 2, atau 3).
     */
    public int getAktivitas() { return aktivitas; }
}