package perpustakaankota;

public class Buku {
    protected String judul;
    protected String penulis;
    protected int tahunTerbit;
    protected int stokBuku;

    public Buku(String judul, String penulis, int tahunTerbit, int stokBuku) {
        this.judul = judul;
        this.penulis = penulis;
        this.tahunTerbit = tahunTerbit;
        this.stokBuku = stokBuku;
    }

    public void pinjamBuku() {
        if (stokBuku > 0) {
            stokBuku--;
            System.out.println("Buku " + judul + " berhasil dipinjam.");
        } else {
            System.out.println("Maaf, stok buku " + judul + " sedang habis.");
        }
    }

    public void kembalikanBuku(int jumlah) {
        stokBuku += jumlah;
        System.out.println(jumlah + " buku " + judul + " berhasil dikembalikan.");
    }
}