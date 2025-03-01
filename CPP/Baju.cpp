#include <iostream>
#include <list>
#include <string>
#include "Aksesoris.cpp"

using namespace std;

class Baju : public Aksesoris {
    private:
        string jenis_hewan;
        string size;
        string merk;

    public:
        Baju() {
            jenis_hewan = "";
            size = "";
            merk = "";
        }

        Baju(int id, string nama_produk, int harga_produk, int stok_produk, string jenis, string bahan, string warna, string jenis_hewan, string size, string merk) : Aksesoris(id, nama_produk, harga_produk, stok_produk, jenis, bahan, warna) { 
        this->jenis_hewan = jenis_hewan;
        this->size = size;
        this->merk = merk;
    }
    

        void setJenisHewan(string jenis_hewan) {
            this->jenis_hewan = jenis_hewan;
        }

        string getJenisHewan() {
            return jenis_hewan;
        }

        void setSize(string size) {
            this->size = size;
        }

        string getSize() {
            return size;
        }

        void setmerk(string merk) {
            this->merk = merk;
        }

        string getmerk() {
            return merk;
        }

        int jenisHewanLength() {
            return jenis_hewan.length();
        }

        int sizeLength() {
            return size.length();
        }

        int merkLength() {
            return merk.length();
        }
};
