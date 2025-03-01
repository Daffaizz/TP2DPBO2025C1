<?php 

include "Aksesoris.php";

class Baju extends Aksesoris {
    private $jenis_hewan;
    private $size;
    private $merk;

    public function __construct($id, $nama_produk, $harga_produk, $stok_produk, $foto_produk, $jenis, $bahan, $warna, $jenis_hewan, $size, $merk) {
        parent::__construct($id, $nama_produk, $harga_produk, $stok_produk, $foto_produk, $jenis, $bahan, $warna);
        $this->jenis_hewan = $jenis_hewan;
        $this->size = $size;
        $this->merk = $merk;
    }

    public function getJenisHewan() {
        return $this->jenis_hewan;
    }

    public function setJenisHewan($jenis_hewan) {
        $this->jenis_hewan = $jenis_hewan;
    }

    public function getSize() {
        return $this->size;
    }

    public function setSize($size) {
        $this->size = $size;
    }

    public function getMerk() {
        return $this->merk;
    }

    public function setMerk($merk) {
        $this->merk = $merk;
    }
}
