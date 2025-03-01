import java.util.*;

public class Main {
    public static void main(String[] args) {
        List<Baju> inventory = new ArrayList<>();

        // Menambahkan produk ke dalam inventory
        inventory.add(new Baju(1, "Baju Kucing", 100000, 10, "Kaos", "Katun", "Putih", "Kucing", "M", "Adidas"));
        inventory.add(new Baju(2, "Baju Anjing", 200000, 5, "Kaos", "Katun", "Hitam", "Anjing", "L", "Nike"));
        inventory.add(new Baju(3, "Baju Kucing", 50000, 20, "Kaos", "Katun", "Biru", "Kucing", "S", "Puma"));
        inventory.add(new Baju(4, "Baju Anjing", 150000, 15, "Kaos", "Katun", "Merah", "Anjing", "M", "Adidas"));
        inventory.add(new Baju(5, "Baju Kucing", 75000, 25, "Kaos", "Katun", "Hijau", "Kucing", "S", "Nike"));

        Scanner scanner = new Scanner(System.in);
        int pilihan;

        do {
            System.out.println("===============================");
            System.out.println("Pilih Opsi:");
            System.out.println("1. Tambah Item");
            System.out.println("2. Tampilkan Semua Item");
            System.out.println("969. Keluar");
            System.out.println("===============================");
            System.out.print("Pilihan: ");
            pilihan = scanner.nextInt();
            scanner.nextLine();

            if (pilihan == 1) {
                int id = inventory.size() + 1;
                System.out.print("Masukkan Nama: ");
                String nama = scanner.nextLine();
                System.out.print("Masukkan Harga: ");
                int harga = scanner.nextInt();
                System.out.print("Masukkan Stok: ");
                int stok = scanner.nextInt();
                scanner.nextLine();
                System.out.print("Masukkan Jenis: ");
                String jenis = scanner.nextLine();
                System.out.print("Masukkan Bahan: ");
                String bahan = scanner.nextLine();
                System.out.print("Masukkan Warna: ");
                String warna = scanner.nextLine();
                System.out.print("Masukkan Hewan: ");
                String hewan = scanner.nextLine();
                System.out.print("Masukkan Ukuran: ");
                String ukuran = scanner.nextLine();
                System.out.print("Masukkan Merk: ");
                String merk = scanner.nextLine();

                inventory.add(new Baju(id, nama, harga, stok, jenis, bahan, warna, hewan, ukuran, merk));
            } else if (pilihan == 2) {
                // Menghitung panjang maksimal tiap kolom secara dinamis
                int[] maxWidths = {
                    2, // ID
                    "Nama".length(),
                    "Harga".length(),
                    "Stok".length(),
                    "Jenis".length(),
                    "Bahan".length(),
                    "Warna".length(),
                    "Hewan".length(),
                    "Ukuran".length(),
                    "Merk".length()
                };

                // Menyesuaikan panjang berdasarkan data dalam inventory
                for (Baju produk : inventory) {
                    maxWidths[0] = Math.max(maxWidths[0], String.valueOf(produk.getId()).length());
                    maxWidths[1] = Math.max(maxWidths[1], produk.getNamaProduk().length());
                    maxWidths[2] = Math.max(maxWidths[2], String.valueOf(produk.getHargaProduk()).length());
                    maxWidths[3] = Math.max(maxWidths[3], String.valueOf(produk.getStokProduk()).length());
                    maxWidths[4] = Math.max(maxWidths[4], produk.getJenis().length());
                    maxWidths[5] = Math.max(maxWidths[5], produk.getBahan().length());
                    maxWidths[6] = Math.max(maxWidths[6], produk.getWarna().length());
                    maxWidths[7] = Math.max(maxWidths[7], produk.getJenisHewan().length());
                    maxWidths[8] = Math.max(maxWidths[8], produk.getSize().length());
                    maxWidths[9] = Math.max(maxWidths[9], produk.getMerk().length());
                }

                // Membuat format string dinamis untuk header dan data
                String format = "| %-" + maxWidths[0] + "s | %-" + maxWidths[1] + "s | %-" + maxWidths[2] + "s | %-" +
                                maxWidths[3] + "s | %-" + maxWidths[4] + "s | %-" + maxWidths[5] + "s | %-" +
                                maxWidths[6] + "s | %-" + maxWidths[7] + "s | %-" + maxWidths[8] + "s | %-" +
                                maxWidths[9] + "s |\n";

                // Membuat garis pemisah dinamis
                StringBuilder line = new StringBuilder();
                line.append("+");
                for (int width : maxWidths) {
                    line.append("-".repeat(width + 2)).append("+");
                }

                System.out.println(line.toString()); // Garis atas tabel
                System.out.printf(format, "ID", "Nama", "Harga", "Stok", "Jenis", "Bahan", "Warna", "Hewan", "Ukuran", "Merk");
                System.out.println(line.toString()); // Garis antara header dan data

                // Menampilkan data produk
                for (Baju produk : inventory) {
                    System.out.printf(format, 
                        produk.getId(), produk.getNamaProduk(), produk.getHargaProduk(), produk.getStokProduk(),
                        produk.getJenis(), produk.getBahan(), produk.getWarna(), produk.getJenisHewan(),
                        produk.getSize(), produk.getMerk());
                }

                // Menutup tabel dengan garis bawah
                System.out.println(line.toString());
            } else if (pilihan == 969) {
                System.out.println("Terima Kasih Sudah Berkunjung");
            }
        } while (pilihan != 969);

        scanner.close();
    }
}
