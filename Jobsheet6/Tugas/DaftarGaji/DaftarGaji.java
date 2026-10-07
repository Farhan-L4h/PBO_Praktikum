public class DaftarGaji {
    private Pegawai[] listPegawai;
    private int jumlah;

    public DaftarGaji(int kapasitas) {
        listPegawai = new Pegawai[kapasitas];
        jumlah = 0;
    }

    public void addPegawai(Pegawai pegawai) {
        if (jumlah < listPegawai.length) {
            listPegawai[jumlah] = pegawai;
            jumlah++;
        }
    }

    public void printSemuaGaji() {
        for (int i = 0; i < jumlah; i++) {
            System.out.println(
                listPegawai[i].nama + " : " + listPegawai[i].getGaji()
            );
        }
    }
}