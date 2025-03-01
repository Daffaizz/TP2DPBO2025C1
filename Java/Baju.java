public class Baju extends Aksesoris {
    private String jenisHewan;
    private String size;
    private String merk;

    public Baju() {
        super();
        this.jenisHewan = "";
        this.size = "";
        this.merk = "";
    }

    public Baju(int id, String namaProduk, int hargaProduk, int stokProduk, String jenis, String bahan, String warna, String jenisHewan, String size, String merk) {
        super(id, namaProduk, hargaProduk, stokProduk, jenis, bahan, warna);
        this.jenisHewan = jenisHewan;
        this.size = size;
        this.merk = merk;
    }

    public String getJenisHewan() {
        return jenisHewan;
    }

    public void setJenisHewan(String jenisHewan) {
        this.jenisHewan = jenisHewan;
    }

    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        this.size = size;
    }

    public String getMerk() {
        return merk;
    }

    public void setMerk(String merk) {
        this.merk = merk;
    }
}
