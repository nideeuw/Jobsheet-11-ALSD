import java.util.Scanner;

public class SLLMain17Modif {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        SingleLinkedList17 sll = new SingleLinkedList17();

        Mahasiswa17 mhs1 = new Mahasiswa17("24212200", "Alvaro", "1A", 4.0);
        Mahasiswa17 mhs2 = new Mahasiswa17("23212201", "Bimon", "2B", 3.8);
        Mahasiswa17 mhs3 = new Mahasiswa17("22212202", "Cintia", "3C", 3.5);
        Mahasiswa17 mhs4 = new Mahasiswa17("21212203", "Dirga", "4D", 3.6);

        sll.addFirst(mhs4);
        sll.addLast(mhs1);
        sll.insertAfter("Dirga", mhs3);
        sll.insertAt(2, mhs2);

        int pilihan;
        do {
            System.out.println("\n====== MENU LINKED LIST ======");
            System.out.println("1. Tambah data di awal");
            System.out.println("2. Tambah data di akhir");
            System.out.println("3. Tambah data setelah nama tertentu");
            System.out.println("4. Tambah data di indeks tertentu");
            System.out.println("5. Tampilkan data");
            System.out.println("0. Keluar");
            System.out.print("Pilihan: ");
            pilihan = sc.nextInt();
            sc.nextLine();

            switch (pilihan) {
                case 1:
                    sll.addFirst(inputMahasiswa(sc));
                    break;
                case 2:
                    sll.addLast(inputMahasiswa(sc));
                    break;
                case 3:
                    System.out.print("Masukkan nama yang dicari: ");
                    String keyNama = sc.nextLine();
                    Mahasiswa17 mhsAfter = inputMahasiswa(sc);
                    sll.insertAfter(keyNama, mhsAfter);
                    break;
                case 4:
                    System.out.print("Masukkan indeks: ");
                    int index = sc.nextInt();
                    sc.nextLine();
                    Mahasiswa17 mhsIndex = inputMahasiswa(sc);
                    sll.insertAt(index, mhsIndex);
                    break;
                case 5:
                    sll.print();
                    break;
                case 0:
                    System.out.println("Terima kasih.");
                    break;
                default:
                    System.out.println("Pilihan tidak valid.");
            }
        } while (pilihan != 0);

        sc.close();
    }

    public static Mahasiswa17 inputMahasiswa(Scanner sc) {
        System.out.print("NIM: ");
        String nim = sc.nextLine();
        System.out.print("Nama: ");
        String nama = sc.nextLine();
        System.out.print("Kelas: ");
        String kelas = sc.nextLine();
        System.out.print("IPK: ");
        double ipk = sc.nextDouble();
        sc.nextLine();

        return new Mahasiswa17(nim, nama, kelas, ipk);
    }
}