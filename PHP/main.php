<?php
include "Baju.php";

// Array untuk menyimpan daftar produk
$produkList = [
    new Baju(1, "Baju Kucing", 100000, 10, "uploads/Kaoskucing2.jpg", "Kaos", "Katun", "Putih", "Kucing", "M", "Adidas"),
    new Baju(2, "Baju Anjing", 200000, 5, "uploads/BajuAnjing2.jpg", "Kaos", "Katun", "Hitam", "Anjing", "L", "Nike"),
    new Baju(3, "Baju Kucing", 50000, 20, "uploads/KaosKucing.jpg", "Kaos", "Katun", "Biru", "Kucing", "S", "Puma"),
    new Baju(4, "Baju Anjing", 150000, 15, "uploads/BajuAnjing.jpeg", "Kaos", "Katun", "Merah", "Anjing", "M", "Adidas"),
    new Baju(5, "Baju Kucing", 75000, 25, "uploads/Kaoskucing2.jpg", "Kaos", "Katun", "Hijau", "Kucing", "S", "Nike"),
];

// Proses penambahan produk baru
if ($_SERVER["REQUEST_METHOD"] == "POST") {
    $id = count($produkList) + 1;
    $nama_produk = $_POST["nama_produk"];
    $harga_produk = $_POST["harga_produk"];
    $stok_produk = $_POST["stok_produk"];
    $foto_produk = "uploads/" . $_FILES["foto_produk"]["name"];
    move_uploaded_file($_FILES["foto_produk"]["tmp_name"], $foto_produk);
    $jenis = $_POST["jenis"];
    $bahan = $_POST["bahan"];
    $warna = $_POST["warna"];
    $jenis_hewan = $_POST["jenis_hewan"];
    $size = $_POST["size"];
    $merk = $_POST["merk"];
    
    $produkBaru = new Baju($id, $nama_produk, $harga_produk, $stok_produk, $foto_produk, $jenis, $bahan, $warna, $jenis_hewan, $size, $merk);
    $produkList[] = $produkBaru;
}
?>

<!DOCTYPE html>
<html lang="id">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Daftar Produk Petshop</title>
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0/dist/css/bootstrap.min.css" rel="stylesheet">
</head>
<body class="container py-4">
    <h2 class="text-center mb-4">Daftar Produk</h2>
    <table class="table table-bordered text-center">
        <thead class="table-dark">
            <tr>
                <th>ID</th>
                <th>Nama Produk</th>
                <th>Harga</th>
                <th>Stok</th>
                <th>Jenis Baju</th>
                <th>Bahan</th>
                <th>Warna</th>
                <th>Jenis Hewan</th>
                <th>Size</th>
                <th>Merk</th>
                <th>Foto</th>
            </tr>
        </thead>
        <tbody>
            <?php foreach ($produkList as $produk) { ?>
                <tr>
                    <td><?php echo $produk->getId(); ?></td>
                    <td><?php echo $produk->getNamaProduk(); ?></td>
                    <td>Rp<?php echo number_format($produk->getHargaProduk(), 0, ',', '.'); ?></td>
                    <td><?php echo $produk->getStokProduk(); ?></td>
                    <td><?php echo $produk->getJenis(); ?></td>
                    <td><?php echo $produk->getBahan(); ?></td>
                    <td><?php echo $produk->getWarna(); ?></td>
                    <td><?php echo $produk->getJenisHewan(); ?></td>
                    <td><?php echo $produk->getSize(); ?></td>
                    <td><?php echo $produk->getMerk(); ?></td>
                    <td><img src="<?php echo $produk->getFotoProduk(); ?>" width="100"></td>
                </tr>
            <?php } ?>
        </tbody>
    </table>

    <h2 class="text-center mt-4">Tambah Produk Baru</h2>
    <form action="" method="post" enctype="multipart/form-data" class="mx-auto w-50 border p-4 rounded shadow">
        <div class="mb-3">
            <input type="text" name="nama_produk" class="form-control" placeholder="Nama Produk" required>
        </div>
        <div class="mb-3">
            <input type="number" name="harga_produk" class="form-control" placeholder="Harga" required>
        </div>
        <div class="mb-3">
            <input type="number" name="stok_produk" class="form-control" placeholder="Stok" required>
        </div>
        <div class="mb-3">
            <input type="text" name="jenis" class="form-control" placeholder="Jenis" required>
        </div>
        <div class="mb-3">
            <input type="text" name="bahan" class="form-control" placeholder="Bahan" required>
        </div>
        <div class="mb-3">
            <input type="text" name="warna" class="form-control" placeholder="Warna" required>
        </div>
        <div class="mb-3">
            <input type="text" name="jenis_hewan" class="form-control" placeholder="Jenis Hewan" required>
        </div>
        <div class="mb-3">
            <input type="text" name="size" class="form-control" placeholder="Size" required>
        </div>
        <div class="mb-3">
            <input type="text" name="merk" class="form-control" placeholder="Merk" required>
        </div>
        <div class="mb-3">
            <input type="file" name="foto_produk" class="form-control" required>
        </div>
        <button type="submit" class="btn btn-primary w-100">Tambah Produk</button>
    </form>
</body>
</html>
