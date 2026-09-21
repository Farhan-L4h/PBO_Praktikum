// package Jobsheet4.Sistem_Toko_Online;

public class Toko {
    private Produk produk;

    public Toko(Produk produk) {
        this.produk = produk;
    }

    public void tampilkanProduk() {
        System.out.println("Produk: " + produk.getNama());
    }
}
