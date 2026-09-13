package playlistoop;

public class PlaylistOOP {
    public static void main(String[] args) {
        Lagu[] daftarLagu = new Lagu[10];

        Admin admin = new Admin("Bonari", "A01");
        Member member = new Member("Ugo", "M01");

        // Polymorphism: method sama, hasil beda tergantung objek
        admin.tampilkanAkses();
        member.tampilkanAkses();

        admin.tambahLagu(daftarLagu, new Lagu("Judul A", "Artis A", 3.5));
        admin.tambahLagu(daftarLagu, new Lagu("Judul B", "Artis B", 4.2));

        admin.lihatDaftarLagu(daftarLagu);
        member.cariLagu(daftarLagu, "Judul A");

        System.out.println("Rata-rata durasi: " + member.hitungRataRataDurasi(daftarLagu));
    }
}

class Lagu {
    private String judul;
    private String artis;
    private double durasi;

    public Lagu(String judul, String artis, double durasi) {
        this.judul = judul;
        this.artis = artis;
        this.durasi = durasi;
    }

    public String getJudul() { return judul; }
    public void setJudul(String judul) { this.judul = judul; }

    public String getArtis() { return artis; }
    public void setArtis(String artis) { this.artis = artis; }

    public double getDurasi() { return durasi; }
    public void setDurasi(double durasi) { this.durasi = durasi; }

    public void tampilkanInfo() {
        System.out.println("Judul: " + judul + " | Artis: " + artis + " | Durasi: " + durasi + " menit");
    }
}