package praktikum2.soal3;

//baris ini eror karena nama class tidak sesuai dengan yang digunakan di soal3Main
//public class Employee {
public class Pegawai {
    public String nama;

    //baris ini eror karena tipe data seharusnya String bukan char karena kalimat
    //public char asal;
    public String asal;
    public String jabatan;
    public int umur;

    public String getNama() {
        return nama;
    }

    public String getAsal() {
        return asal;
    }

    //baris ini eror karena method setJabatan tidak punya parameter untun menerima nilai jabatan dan variabel j belum dideklarasikan
    //public void setJabatan() {
    public void setJabatan(String j) {
        this.jabatan = j;
    }
}
