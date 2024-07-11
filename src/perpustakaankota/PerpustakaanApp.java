package perpustakaankota;

public class PerpustakaanApp {
    public static void main(String[] args) {
        Perpustakaan perpustakaan = new Perpustakaan("Perpustakaan Kota", "Jl. Merdeka No. 123");

        Buku buku1 = new Buku("Pemrograman Java", "John Doe", 2020, 5);
        Buku buku2 = new Buku("Algoritma dan Struktur Data", "Jane Smith", 2019, 3);

        perpustakaan.tambahBuku(buku1);
        perpustakaan.tambahBuku(buku2);

        Buku bukuDicari = perpustakaan.cariBuku("Pemrograman Java");
        if (bukuDicari != null) {
            System.out.println("Buku ditemukan: " + bukuDicari.judul);
            bukuDicari.pinjamBuku();
        } else {
            System.out.println("Buku tidak ditemukan.");
        }

        bukuDicari = perpustakaan.cariBuku("Algoritma dan Struktur Data");
        if (bukuDicari != null) {
            System.out.println("Buku ditemukan: " + bukuDicari.judul);
            bukuDicari.pinjamBuku();
            bukuDicari.kembalikanBuku(1);
        } else {
            System.out.println("Buku tidak ditemukan.");
        }
    }
}

