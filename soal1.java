import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Masukkan kode barang: ");
        String kodeBarang = scanner.nextLine();

        System.out.print("Masukkan nama customer: ");
        String namaCustomer = scanner.nextLine();

        System.out.print("Masukkan jumlah transaksi: ");
        int jumlahTransaksi = scanner.nextInt();

        String namaBarang = "";
        int harga = 0;
        int totalHarga = 0;
        double diskon = 0;

        // Deklarasi semua harga barang berdasarkan kode barang
        if (kodeBarang.equals("b001")) {
            namaBarang = "Buku";
            harga = 10000;
        } else if (kodeBarang.equals("b002")) {
            namaBarang = "Pensil";
            harga = 3000;
        } else if (kodeBarang.equals("b003")) {
            namaBarang = "Penggaris";
            harga = 5000;
        } else if (kodeBarang.equals("b004")) {
            namaBarang = "Pena";
            harga = 7000;
        } else {
            System.out.println("Kode barang tidak dikenal!");
            return;
        }

        // hitung harga total
        totalHarga = harga * jumlahTransaksi;

        // menghitung diskon yang ada jika ada 
        if ((kodeBarang.equals("b001") || kodeBarang.equals("b004")) && jumlahTransaksi > 10) {
            diskon = totalHarga * 0.05;
        } else if (kodeBarang.equals("b003") && jumlahTransaksi > 20) {
            diskon = totalHarga * 0.10;
        }

        // disini hitung bayar dari semua total nya ya
        int totalBayar = (int) (totalHarga - diskon);

        // menampilkan hasil dari inputan dari awal tadi
        System.out.println("Nama Customer: " + namaCustomer);
        System.out.println("Nama Barang: " + namaBarang);
        System.out.println("Harga: " + harga);
        System.out.println("Jumlah Transaksi: " + jumlahTransaksi);
        System.out.println("Total Harga: " + totalHarga);
        System.out.println("Diskon: " + diskon);
        System.out.println("Total Bayar: " + totalBayar);
    }
}
