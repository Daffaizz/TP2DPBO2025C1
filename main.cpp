#include <iostream>
#include <list>
#include <string>
#include <iomanip> // Untuk setw()
#include "Baju.cpp"

using namespace std;

void printSeparator(int maxNama, int maxJenis, int maxBahan, int maxWarna, int maxMerk) {
    cout << "+-----+"
         << string(maxNama + 2, '-') << "+"
         << "--------+"
         << "------+" 
         << string(maxJenis + 2, '-') << "+"
         << string(maxBahan + 2, '-') << "+"
         << string(maxWarna + 2, '-') << "+"
         << "--------+"
         << "--------+"
         << string(maxMerk + 2, '-') << "+"
         << endl;
}

int main() {
    list<Baju> inventory;

    // Menambahkan produk ke dalam inventory
    inventory.push_back(Baju(1, "Baju Kucing", 100000, 10, "Kaos", "Katun", "Putih", "Kucing", "M", "Adidas"));
    inventory.push_back(Baju(2, "Baju Anjing", 200000, 5, "Kaos", "Katun", "Hitam", "Anjing", "L", "Nike"));
    inventory.push_back(Baju(3, "Baju Kucing", 50000, 20, "Kaos", "Katun", "Biru", "Kucing", "S", "Puma"));
    inventory.push_back(Baju(4, "Baju Anjing", 150000, 15, "Kaos", "Katun", "Merah", "Anjing", "M", "Adidas"));
    inventory.push_back(Baju(5, "Baju Kucing", 75000, 25, "Kaos", "Katun", "Hijau", "Kucing", "S", "Nike"));

    int pilihan = 0;
    do {
        cout << "===============================\n";
        cout << "Pilih Opsi:\n";
        cout << "1. Tambah Item\n";
        cout << "2. Tampilkan Semua Item\n";
        cout << "969. Keluar\n";
        cout << "===============================\n";
        cout << "Pilihan: ";
        cin >> pilihan;

        if (pilihan == 1) {
            int id = inventory.size() + 1;
            int harga, stok;
            string nama, jenis, bahan, warna, hewan, ukuran, merk;

            cout << "Masukkan Nama: "; cin >> nama;
            cout << "Masukkan Harga: "; cin >> harga;
            cout << "Masukkan Stok: "; cin >> stok;
            cout << "Masukkan Jenis: "; cin >> jenis;
            cout << "Masukkan Bahan: "; cin >> bahan;
            cout << "Masukkan Warna: "; cin >> warna;
            cout << "Masukkan Hewan: "; cin >> hewan;
            cout << "Masukkan Ukuran: "; cin >> ukuran;
            cout << "Masukkan Merk: "; cin >> merk;

            inventory.push_back(Baju(id, nama, harga, stok, jenis, bahan, warna, hewan, ukuran, merk));
        } else if (pilihan == 2) {
            // Menghitung panjang maksimum untuk setiap atribut
            int maxNama = 4, maxJenis = 5, maxBahan = 5, maxWarna = 5, maxMerk = 4;
            for (Baju &produk : inventory) {
                maxNama = max(maxNama, (int)produk.getNamaProduk().length());
                maxJenis = max(maxJenis, (int)produk.getJenis().length());
                maxBahan = max(maxBahan, (int)produk.getBahan().length());
                maxWarna = max(maxWarna, (int)produk.getWarna().length());
                maxMerk = max(maxMerk, (int)produk.getmerk().length());
            }

            // Cetak garis atas tabel
            printSeparator(maxNama, maxJenis, maxBahan, maxWarna, maxMerk);

            // Menampilkan header tabel
            cout << "| " << left
                 << setw(3)  << "ID" << " | "
                 << setw(maxNama) << "Nama" << " | "
                 << setw(6)  << "Harga" << " | "
                 << setw(4)  << "Stok" << " | "
                 << setw(maxJenis) << "Jenis" << " | "
                 << setw(maxBahan) << "Bahan" << " | "
                 << setw(maxWarna) << "Warna" << " | "
                 << setw(6)  << "Hewan" << " | "
                 << setw(6)  << "Ukuran" << " | "
                 << setw(maxMerk) << "Merk" << " | "
                 << endl;

            // Cetak garis tengah tabel
            printSeparator(maxNama, maxJenis, maxBahan, maxWarna, maxMerk);

            // Menampilkan daftar produk
            for (Baju &produk : inventory) {
                cout << "| " << left
                     << setw(3)  << produk.getId() << " | "
                     << setw(maxNama) << produk.getNamaProduk() << " | "
                     << setw(6)  << produk.getHargaProduk() << " | "
                     << setw(4)  << produk.getStokProduk() << " | "
                     << setw(maxJenis) << produk.getJenis() << " | "
                     << setw(maxBahan) << produk.getBahan() << " | "
                     << setw(maxWarna) << produk.getWarna() << " | "
                     << setw(6)  << produk.getJenisHewan() << " | "
                     << setw(6)  << produk.getSize() << " | "
                     << setw(maxMerk) << produk.getmerk() << " | "
                     << endl;
            }

            // Cetak garis bawah tabel
            printSeparator(maxNama, maxJenis, maxBahan, maxWarna, maxMerk);
        } else if (pilihan == 969) {
            cout << "Terima Kasih Sudah Berkunjung" << endl;
        }
    } while (pilihan != 969);

    return 0;
}
