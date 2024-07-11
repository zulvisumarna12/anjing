package perpustakaankota;
import java.util.ArrayList;
import java.util.List;

public class Perpustakaan {
    protected String nama;
    protected String alamat;
    protected List<Buku> daftarBuku;

    public Perpustakaan(String nama, String alamat) {
        this.nama = nama;
        this.alamat = alamat;
        this.daftarBuku = new ArrayList<>();
    }

    public void tambahBuku(Buku buku) {
        daftarBuku.add(buku);
    }

    public Buku cariBuku(String judul) {
        for (Buku buku : daftarBuku) {
            if (buku.judul.equalsIgnoreCase(judul)) {
                return buku;
            }
        }
        return null;
    }
}