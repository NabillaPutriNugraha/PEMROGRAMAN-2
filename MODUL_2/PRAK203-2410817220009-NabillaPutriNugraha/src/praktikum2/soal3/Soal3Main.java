package praktikum2.soal3;

public class Soal3Main {
    public static void main(String[] args) {
        Pegawai p1 = new Pegawai();

        //error karena kurang tanda titik koma
        //p1.nama = "Roi"
        p1.nama = "Roi";
        p1.asal = "Kingdom of Orvel";
        p1.setJabatan("Assasin");

        //baris ini awalnya tidak ada sehingga umurnya masih 0
        p1.umur = 17;

        System.out.println("Nama Pengawai : " + p1.getNama());
        System.out.println("Asal : " + p1.getAsal());
        System.out.println("Jabatan : " + p1.jabatan);

        //baris ini tidak ada + “tahun” sehingga outputnya kurang kata tahun
        // System.out.println("Umur : " + p1.umur);
        System.out.println("Umur : " + p1.umur + " tahun");
    }
}
