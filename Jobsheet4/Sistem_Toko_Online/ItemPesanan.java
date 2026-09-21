public class ItemPesanan {
    private String namaProduk;
    private int jumlah;

    public ItemPesanan(String namaProduk, int jumlah) {
        this.namaProduk = namaProduk;
        this.jumlah = jumlah;
    }

    public void tampilkan() {
        System.out.println(
            "Item: " + namaProduk + 
            ", Jumlah: " + jumlah
        );
    }
}
