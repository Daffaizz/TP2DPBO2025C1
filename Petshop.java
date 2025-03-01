import java.util.*;

public class Petshop {
    private int id;
    private String namaProduk;
    private int hargaProduk;
    private int stokProduk;

    public Petshop() {
        this.id = 0;
        this.namaProduk = "";
        this.hargaProduk = 0;
        this.stokProduk = 0;
    }

    public Petshop(int id, String namaProduk, int hargaProduk, int stokProduk) {
        this.id = id;
        this.namaProduk = namaProduk;
        this.hargaProduk = hargaProduk;
        this.stokProduk = stokProduk;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNamaProduk() {
        return namaProduk;
    }

    public void setNamaProduk(String namaProduk) {
        this.namaProduk = namaProduk;
    }

    public int getHargaProduk() {
        return hargaProduk;
    }

    public void setHargaProduk(int hargaProduk) {
        this.hargaProduk = hargaProduk;
    }

    public int getStokProduk() {
        return stokProduk;
    }

    public void setStokProduk(int stokProduk) {
        this.stokProduk = stokProduk;
    }
}
