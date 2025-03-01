<?php 

class Petshop {
    private $id;
    private $nama_produk;
    private $harga_produk;
    private $stok_produk;
    private $foto_produk;

    public function __construct($id, $nama_produk, $harga_produk, $stok_produk, $foto_produk) {
        $this->id = $id;
        $this->nama_produk = $nama_produk;
        $this->harga_produk = $harga_produk;
        $this->stok_produk = $stok_produk;
        $this->foto_produk = $foto_produk;
    }

    public function getId() {
        return $this->id;
    }

    public function setId($id) {
        $this->id = $id;
    }

    public function getNamaProduk() {
        return $this->nama_produk;
    }

    public function setNamaProduk($nama_produk) {
        $this->nama_produk = $nama_produk;
    }

    public function getHargaProduk() {
        return $this->harga_produk;
    }

    public function setHargaProduk($harga_produk) {
        $this->harga_produk = $harga_produk;
    }

    public function getStokProduk() {
        return $this->stok_produk;
    }

    public function setStokProduk($stok_produk) {
        $this->stok_produk = $stok_produk;
    }

    public function getFotoProduk() {
        return $this->foto_produk;
    }

    public function setFotoProduk($foto_produk) {
        $this->foto_produk = $foto_produk;
    }
}