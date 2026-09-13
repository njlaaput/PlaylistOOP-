package playlistoop;

public class Admin extends User {

    // constructor admin
    public Admin(String nama, String id) {
        super(nama, id);
    }

    // Override method dari class User
    @Override
    public void tampilkanAkses() {
        System.out.println("Admin dapat mengelola playlist lagu");
    }

    // Menambahkan lagu baru ke slot kosong dalam array
    public boolean tambahLagu(Lagu[] daftarLagu, Lagu laguBaru) {
    if (laguBaru == null) {
        System.out.println("Lagu tidak valid.");
        return false;
    }
    for (int i = 0; i < daftarLagu.length; i++) {
        if (daftarLagu[i] == null) {
            daftarLagu[i] = laguBaru;
            System.out.println("Lagu \"" + laguBaru.getJudul() + "\" berhasil ditambahkan.");
            return true;
        }
    }
    System.out.println("Playlist penuh.");
    return false;

    }

    // Menghapus lagu berdasarkan judul
    public boolean hapusLagu(Lagu[] daftarLagu, String judul) {
        for (int i = 0; i < daftarLagu.length; i++) {
            if (daftarLagu[i] != null && daftarLagu[i].getJudul().equalsIgnoreCase(judul)) {
                System.out.println("Lagu \"" + daftarLagu[i].getJudul() + "\" berhasil dihapus");
                daftarLagu[i] = null;
                return true;
            }
        }

        System.out.println("Lagu dengan judul \"" + judul + "\" tidak ditemukan.");
        return false;
    }

    // Menampilkan seluruh daftar lagu
    public void lihatDaftarLagu(Lagu[] daftarLagu) {
        System.out.println("=== DAFTAR LAGU (Admin: " + getNama() + ") ===");
        boolean kosong = true;

        for (Lagu lagu : daftarLagu) {
            if (lagu != null) {
                lagu.tampilkanInfo();
                kosong = false;
            }
        }

        if (kosong) {
            System.out.println("Silahkan tambahkan lagu");
        }
    }
}