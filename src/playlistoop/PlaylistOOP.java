package playlistoop;

public class PlaylistOOP {
    public static void main(String[] args) {
        // nanti dipakai buat testing gabungan semua class
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