# TP2DPBO2025C1
# Janji
Saya Daffa Faiz Restu Oktavian dengan NIM 2309013 mengerjakan Tugas Praktikum 2 dalam mata kuliah Desain dan Pemrograman Berorientasi Objek untuk keberkahanNya maka saya tidak melakukan kecurangan seperti yang telah dispesifikasikan. Aamiin.
# Diagram
![image](https://github.com/user-attachments/assets/9ea64a3a-88c7-4b54-8cc3-336c62df6f80)
# Desain Program
Program Petshop Management terdiri dari tiga file utama. Petshop.php berisi kelas utama yang menyimpan informasi dasar produk seperti ID, nama, harga, stok, dan foto, serta menyediakan getter dan setter untuk mengakses dan memperbarui data. Aksesoris.php adalah turunan dari Petshop yang menambahkan atribut jenis, bahan, dan warna untuk menyimpan informasi aksesoris hewan. Baju.php merupakan turunan dari Aksesoris, yang lebih spesifik untuk pakaian hewan dengan tambahan atribut spesies, ukuran, dan merk.  
Fitur utama program mencakup Tambah Data, di mana pengguna dapat menginput produk baru melalui formulir, dan data yang dimasukkan—termasuk gambar—akan disimpan dalam array bernama produkList. Tampilkan Data memungkinkan pengguna melihat daftar produk dalam tabel dengan gambar yang telah diunggah. Selain itu, terdapat fitur Keluar, yang memungkinkan pengguna mengosongkan array produkList agar dapat memulai kembali dari awal.
# Petshop
Class Petshop merupakan kelas dasar yang memiliki atribut utama sebagai berikut:  
- id → Integer, secara otomatis ditetapkan oleh sistem secara berurutan.  
- nama_produk → digunakan untuk menyimpan nama produk.  
- harga_produk → menyimpan informasi harga produk.  
- stok_produk → mencatat jumlah stok produk yang tersedia.  
- foto_produk → (Khusus PHP) digunakan untuk menyimpan gambar produk.  
Class Petshop juga memiliki metode getter dan setter untuk setiap atribut, serta fungsi tambahan untuk menghitung panjang (length) dari setiap atribut yang bertipe string.  
# Aksesoris
Class Aksesoris merupakan turunan (child class) dari Petshop. Class ini memiliki atribut tambahan yang lebih spesifik untuk produk aksesoris:  
- jenis → menentukan jenis aksesoris.  
- bahan → mendeskripsikan material atau bahan dari aksesoris.  
- warna → menunjukkan warna aksesoris.  
Sama seperti Petshop, class Aksesoris juga menyediakan metode getter dan setter untuk setiap atribut, serta fungsi untuk menghitung panjang dari setiap atribut bertipe string.  
# Baju 
Class Baju adalah turunan dari Aksesoris yang dikhususkan untuk produk pakaian hewan peliharaan. Class ini memiliki atribut tambahan:  
- spesies → menentukan untuk spesies hewan mana pakaian ini dibuat.  
- ukuran → menunjukkan ukuran baju (S, M, L, dll.).  
- merk → menyimpan informasi mengenai merek pakaian.  
Seperti class lainnya, Baju juga dilengkapi dengan metode getter dan setter untuk setiap atribut, serta metode untuk menghitung panjang atribut string yang ada.
