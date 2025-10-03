import java.util.Scanner;

public class systemWifi02 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String jenisPengguna;
        int jumlahSKS = 0;

        System.out.println("Masukkan jenis pengguna (dosen/mahasiswa): ");
        jenisPengguna = sc.nextLine();

        if (jenisPengguna.equalsIgnoreCase("dosen")) {
            System.out.println("Aksi wifi diberikan (dosen)");
        } else if (jenisPengguna.equalsIgnoreCase("mahasiswa")) {
            System.out.println("Masukkan jumlah SKS: ");
            jumlahSKS = sc.nextInt();

            if (jumlahSKS >= 12) {
                System.out.println("Akses wifi diberikan (mahasiswa)");
            } else {
                System.out.println("Akses ditolak");
            }
        } else {
            System.out.println("Akses ditolak");
        }
        sc.close();
    }
}