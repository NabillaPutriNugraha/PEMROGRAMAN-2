package soal3;

import java.util.*;

public class StudentMain {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        ArrayList<Student> students = new ArrayList<>();

        int choose = 0;

        do {
            System.out.println(" ");
            System.out.println("Menu :");
            System.out.println("1. Tambah Mahasiswa");
            System.out.println("2. Hapus Mahasiswa berdasarkan NIM");
            System.out.println("3. Cari Mahasiswa berdasarkan NIM");
            System.out.println("4. Tampilkan Daftar Mahasiswa");
            System.out.println("0. Keluar");
            System.out.print("Pilihan : ");
            choose = input.nextInt();
            input.nextLine();

            switch (choose) {
                case 1:
                   System.out.print("Masukkan Nama Mahasiswa : ");
                   String name = input.nextLine();

                   System.out.print("Masukkan NIM Mahasiswa (harus unik) : ");
                   String nim = input.nextLine();

                   boolean availableId = false;
                   for(Student s : students) {
                       if(s.getId().equals(nim)) {
                           availableId = true;
                           break;
                       }
                   }

                   if(availableId) {
                       System.out.println("NIM sudah digunakan");
                   } else {
                       students.add(new Student(name, nim));
                       System.out.println("Mahasiswa " + name + " ditambahkan");
                       break;
                   }

                case 2:
                    System.out.print("Masukkan NIM Mahasiswa yang akan dihapus : ");
                    String deleteNim = input.nextLine();

                    boolean found = false;
                    for(int i = 0; i < students.size(); i++) {
                        if(students.get(i).getId().equals(deleteNim)) {
                            students.remove(i);
                            System.out.println("Mahasiswa dengan NIM " + deleteNim + " telah dihapus");
                            found = true;
                            break;
                        }
                    }

                    if(!found) {
                        System.out.println("NIM tidak ditemukan");
                    }
                    break;

                case 3:
                    System.out.print("Masukkan NIM Mahasiswa yang ingin dicari : ");
                    String searchId = input.nextLine();

                    boolean foundStudent = false;
                    for(Student s : students) {
                        if(s.getId().equals(searchId)) {
                            System.out.println("Data Mahasiswa ditemukan");
                            System.out.println("Nama : " + s.getName());
                            System.out.println("NIM : " + s.getId());
                            foundStudent = true;
                            break;
                        }
                    }

                    if(!foundStudent) {
                        System.out.println("Mahasiswa dengan NIM tersebut tidak ditemukan");
                    }
                    break;

                case 4:
                    System.out.print("Daftar Mahasiswa");

                    if(students.isEmpty()) {
                        System.out.println("Belum ada data Mahasiswa");
                    } else  {
                        for(Student s : students) {
                            System.out.println("NIM : " + s.getId() + ", Nama : " + s.getName());
                        }
                    }
                    break;

                case 0:
                    System.out.print("Terima Kasih!");
            }
        } while (choose != 0);
    }
}
