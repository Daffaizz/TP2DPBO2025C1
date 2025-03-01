from Baju import Baju

def main():
    inventory = [
        Baju(1, "Baju Kucing", 100000, 10, "Kaos", "Katun", "Putih", "Kucing", "M", "Adidas"),
        Baju(2, "Baju Anjing", 200000, 5, "Kaos", "Katun", "Hitam", "Anjing", "L", "Nike"),
        Baju(3, "Baju Kucing", 50000, 20, "Kaos", "Katun", "Biru", "Kucing", "S", "Puma"),
        Baju(4, "Baju Anjing", 150000, 15, "Kaos", "Katun", "Merah", "Anjing", "M", "Adidas"),
        Baju(5, "Baju Kucing", 75000, 25, "Kaos", "Katun", "Hijau", "Kucing", "S", "Nike")
    ]

    pilihan = 0

    while pilihan != 969:
        print("===============================")
        print("Pilih Opsi:")
        print("1. Tambah Item")
        print("2. Tampilkan Semua Item")
        print("969. Keluar")
        print("===============================")
        pilihan = int(input("Pilihan: "))

        if pilihan == 1:
            id = len(inventory) + 1
            nama = input("Masukkan Nama: ")
            harga = int(input("Masukkan Harga: "))
            stok = int(input("Masukkan Stok: "))
            jenis = input("Masukkan Jenis: ")
            bahan = input("Masukkan Bahan: ")
            warna = input("Masukkan Warna: ")
            hewan = input("Masukkan Hewan: ")
            ukuran = input("Masukkan Ukuran: ")
            merk = input("Masukkan Merk: ")

            inventory.append(Baju(id, nama, harga, stok, jenis, bahan, warna, hewan, ukuran, merk))
        
        elif pilihan == 2:
            headers = ["ID", "Nama", "Harga", "Stok", "Jenis", "Bahan", "Warna", "Hewan", "Ukuran", "Merk"]
            min_widths = [2, 4, 5, 4, 5, 5, 5, 5, 6, 4]

            for baju in inventory:
                min_widths[0] = max(min_widths[0], len(str(baju.get_id())))
                min_widths[1] = max(min_widths[1], len(baju.get_nama_produk()))
                min_widths[2] = max(min_widths[2], len(str(baju.get_harga_produk())))
                min_widths[3] = max(min_widths[3], len(str(baju.get_stok_produk())))
                min_widths[4] = max(min_widths[4], len(baju.get_jenis()))
                min_widths[5] = max(min_widths[5], len(baju.get_bahan()))
                min_widths[6] = max(min_widths[6], len(baju.get_warna()))
                min_widths[7] = max(min_widths[7], len(baju.get_jenis_hewan()))
                min_widths[8] = max(min_widths[8], len(baju.get_size()))
                min_widths[9] = max(min_widths[9], len(baju.get_merk()))

            row_format = "| " + " | ".join([f"{{:<{w}}}" for w in min_widths]) + " |"

            def print_separator():
                print("+" + "+".join(["-" * (w + 2) for w in min_widths]) + "+")

            print_separator()  # Garis atas tabel
            print(row_format.format(*headers))
            print_separator()  # Garis pemisah header dan data

            for baju in inventory:
                print(row_format.format(
                    baju.get_id(), baju.get_nama_produk(), baju.get_harga_produk(), baju.get_stok_produk(),
                    baju.get_jenis(), baju.get_bahan(), baju.get_warna(), baju.get_jenis_hewan(),
                    baju.get_size(), baju.get_merk()
                ))

            print_separator()  # Garis bawah tabel
        
        elif pilihan == 969:
            print("Terima Kasih Sudah Berkunjung")

if __name__ == "__main__":
    main()
