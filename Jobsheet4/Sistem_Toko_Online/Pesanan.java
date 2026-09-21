// package Jobsheet4.Sistem_Toko_Online;

public class Pesanan {
    private String nomorPesanan;
    private ItemPesanan item;

    public Pesanan(String nomorPesanan) {
        this.nomorPesanan = nomorPesanan;

        // Composition
        this.item = new ItemPesanan("Keyboard", 2);
    }

    public void tampilkanPesanan() {
        System.out.println("Pesanan: " + nomorPesanan);
        item.tampilkan();
    }

    public void prosesPembayaran(PaymentService paymentService) {
        paymentService.bayar(700000);
    }
}