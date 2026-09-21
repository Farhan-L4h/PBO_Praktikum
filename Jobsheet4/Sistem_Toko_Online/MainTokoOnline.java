public class MainTokoOnline {
    public static void main(String[] args) {

        // Aggregation
        Produk produk = new Produk("Keyboard", 350000);
        Toko toko = new Toko(produk);

        toko.tampilkanProduk();

        // Composition
        Pesanan pesanan = new Pesanan("ORD-001");
        pesanan.tampilkanPesanan();

        // Dependency
        PaymentService paymentService = new PaymentService();
        pesanan.prosesPembayaran(paymentService);
    }
}
