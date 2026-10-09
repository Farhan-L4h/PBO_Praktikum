package Tugas.Tugas1;

public class Segitiga {
    private int sudut;

    public int sisaSudut(int sudutA) {
        if (sudutA <= 0 || sudutA >= 180) {
            throw new IllegalArgumentException(
                "Sudut harus lebih dari 0 dan kurang dari 180"
            );
        }

        sudut = 180 - sudutA;
        return sudut;
    }

    public int sisaSudut(int sudutA, int sudutB) {
        int jumlahSudut = sudutA + sudutB;

        if (sudutA <= 0 || sudutB <= 0
                || jumlahSudut <= 0 || jumlahSudut >= 180) {
            throw new IllegalArgumentException(
                "Jumlah sudut harus lebih dari 0 dan kurang dari 180"
            );
        }

        sudut = 180 - jumlahSudut;
        return sudut;
    }

    public int getSudut() {
        return sudut;
    }

    public int keliling(int sisiA, int sisiB, int sisiC) {
        return sisiA + sisiB + sisiC;
    }

    public double keliling(int sisiA, int sisiB) {
        double sisiMiring = Math.sqrt(
            sisiA * sisiA + sisiB * sisiB
        );

        return sisiA + sisiB + sisiMiring;
    }
}
