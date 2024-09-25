import java.util.Scanner;

public class CD_DVDTester {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("berapa jumlah objek?");
        int jumlah = in.nextInt();
        if (jumlah < 1 || jumlah > 10) {
            System.out.println("anda mencapai batas maksimal");
        }
        for (int i = 1; i <= jumlah; i++) {
            try {
                System.out.println("Silahkan pilih 1 untuk CD atau 2 untuk DVD");
                int pilihan = in.nextInt();
                if (pilihan == 1) {
                    CD c = new CD();
                    c.print();
                } else if (pilihan == 2) {
                    DVD d = new DVD();
                    d.print();
                } else {
                    System.out.println("Tipe yang anda masukkan salah");
                }
            } catch (Exception e) {
                System.out.println("Tipe data salah, hanya menerima angka");
            }

        }
        in.close();

    }
}
