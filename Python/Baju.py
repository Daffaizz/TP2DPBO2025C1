from Aksesoris import Aksesoris

class Baju(Aksesoris):
    def __init__(self, id=0, nama_produk="", harga_produk=0, stok_produk=0, jenis="", bahan="", warna="", jenis_hewan="", size="", merk=""):
        super().__init__(id, nama_produk, harga_produk, stok_produk, jenis, bahan, warna)
        self.jenis_hewan = jenis_hewan
        self.size = size
        self.merk = merk

    def get_jenis_hewan(self):
        return self.jenis_hewan

    def set_jenis_hewan(self, jenis_hewan):
        self.jenis_hewan = jenis_hewan

    def get_size(self):
        return self.size

    def set_size(self, size):
        self.size = size

    def get_merk(self):
        return self.merk

    def set_merk(self, merk):
        self.merk = merk
