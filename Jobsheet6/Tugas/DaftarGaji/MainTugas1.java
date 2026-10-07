public class MainTugas1 {
    public static void main(String[] args) {

        DaftarGaji daftarGaji = new DaftarGaji(10);

        Pegawai pegawai = new Pegawai(
            "P001",
            "Budi",
            "Malang"
        );

        Dosen dosen = new Dosen(
            "D001",
            "Siti",
            "Surabaya",
            12
        );

        daftarGaji.addPegawai(pegawai);
        daftarGaji.addPegawai(dosen);

        daftarGaji.printSemuaGaji();
    }
}
