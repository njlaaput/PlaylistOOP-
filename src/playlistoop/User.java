package playlistoop;

// Class User sebagai parent class untuk Admin dan Member
public class User {
    private String nama;
    private String id;

    // Constructor untuk mengisi data nama dan ID user
    public User(String nama, String id) {
        this.nama = nama;
        this.id = id;
    }

    // Getter untuk mengambil nama user
    public String getNama() {
        return nama;
    }

    // Setter untuk mengubah nama user
    public void setNama(String nama) {
        this.nama = nama;
    }

    // Getter untuk mengambil ID user
    public String getId() {
        return id;
    }

    // Setter untuk mengubah ID user
    public void setId(String id) {
        this.id = id;
    }

    // Method yang akan dioverride oleh Admin dan Member
    public void tampilkanAkses() {
        System.out.println("User dapat mengakses sistem playlist.");
    }
}
