public class Kontainer {
     private String nomorResi;
    private String namaPemilik;
    private double kapasitasMaksimal;
    private double beratMuatanSaatIni;

    public Kontainer(String nomorResi, String namaPemilik,
                     double kapasitasMaksimal) {
        this.nomorResi = nomorResi;
        this.namaPemilik = namaPemilik;
        this.kapasitasMaksimal = kapasitasMaksimal;
        this.beratMuatanSaatIni = 0;
    }

    public String getNomorResi() {
        return nomorResi;
    }

    public String getNamaPemilik() {
        return namaPemilik;
    }

    public double getKapasitasMaksimal() {
        return kapasitasMaksimal;
    }

    public double getBeratMuatanSaatIni() {
        return beratMuatanSaatIni;
    }

    public void tambahMuatan(double berat) {
        if (beratMuatanSaatIni + berat <= kapasitasMaksimal) {
            beratMuatanSaatIni += berat;
        } else {
            System.out.println(
                "Maaf, berat muatan melebihi kapasitas maksimal kontainer."
            );
        }
    }

    public void turunkanMuatan(double berat) {
        if (berat <= beratMuatanSaatIni) {
            beratMuatanSaatIni -= berat;
        } else {
            System.out.println(
                "Maaf, berat muatan yang diturunkan melebihi muatan saat ini."
            );
        }
    }
}
