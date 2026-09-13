package playlistoop;

public class Member extends User {

    // Constructor Member
    public Member(String nama, String id) {
        super(nama, id);
    }

    // Override method dari class User
    @Override
    public void tampilkanAkses() {
        System.out.println("Member dapat melihat dan mencari lagu.");
    }

    // Menampilkan daftar lagu
    public void lihatLagu(Lagu[] daftarLagu) {
        System.out.println("=== DAFTAR LAGU ===");

        for (Lagu lagu : daftarLagu) {
            lagu.tampilkanInfo();
        }
    }

    // Mencari lagu berdasarkan judul
    public void cariLagu(Lagu[] daftarLagu, String keyword) {
        boolean ditemukan = false;

        System.out.println("=== HASIL PENCARIAN ===");

        for (Lagu lagu : daftarLagu) {
            if (lagu.getJudul().toLowerCase().contains(keyword.toLowerCase())) {
                lagu.tampilkanInfo();
                ditemukan = true;
            }
        }

        if (!ditemukan) {
            System.out.println("Lagu dengan judul \"" + keyword + "\" tidak ditemukan.");
        }
    }
}
