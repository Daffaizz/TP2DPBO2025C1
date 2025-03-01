public class Aksesoris extends Petshop {
    private String jenis;
    private String bahan;
    private String warna;

    public Aksesoris() {
        super();
        this.jenis = "";
        this.bahan = "";
        this.warna = "";
    }

    public Aksesoris(int id, String namaProduk, int hargaProduk, int stokProduk, String jenis, String bahan, String warna) {
        super(id, namaProduk, hargaProduk, stokProduk);
        this.jenis = jenis;
        this.bahan = bahan;
        this.warna = warna;
    }

    public String getJenis() {
        return jenis;
    }

    public void setJenis(String jenis) {
        this.jenis = jenis;
    }

    public String getBahan() {
        return bahan;
    }

    public void setBahan(String bahan) {
        this.bahan = bahan;
    }

    public String getWarna() {
        return warna;
    }

    public void setWarna(String warna) {
        this.warna = warna;
    }
}
