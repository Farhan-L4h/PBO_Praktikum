package Jobsheet4.percobaan3;

public class MainPercobaan3 {
    public static void main(String[] args) {
        Pegawai masinis = new Pegawai("1122", "Pieter Parker");
        Pegawai asisten = new Pegawai("2211", "Tony Stark");
        KeretaApi keretaApi = new KeretaApi("Woosh", "Bisnis", masinis ,asisten);
        System.out.println(keretaApi.info());
    }
}