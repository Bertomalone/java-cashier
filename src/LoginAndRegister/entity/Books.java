package LoginAndRegister.entity;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author bertomalone
 */
public class Books {
    
    private String id;
    private String judul;
    private String penulis;
    private String tanggalMasuk; 
    private int harga;
    private int tahunTerbit;
    private int stok;
    
    public Books() {
        
    }
    
    public Books(String bookId, String bookJudul, String bookPenulis, String bookTanggalMasuk, int bookHarga, int bookTahunTerbit, int bookStok)
    {
        this.id = bookId;
        this.judul = bookJudul;
        this.penulis = bookPenulis;
        this.tanggalMasuk = bookTanggalMasuk;
        this.harga = bookHarga;
        this.tahunTerbit = bookTahunTerbit;
        this.stok = bookStok;
    }
    
    public String getId()
    {
        return id;
    }
    
    public void setId(String bookId) {
        this.id = bookId;
    }
    
    public String getJudul()
    {
        return judul;
    }
    
    public void setJudul(String bookJudul) {
        this.judul = bookJudul;
    }
    
    public String getPenulis()
    {
        return penulis;
    }
    
    public void setPenulis(String bookPenulis) {
        this.penulis = bookPenulis;
    }
    
    public String getTanggalMasuk()
    {
        return  tanggalMasuk;
    }
    
    public void setTanggalMasuk(String bookTanggalMasuk) {
        this.tanggalMasuk = bookTanggalMasuk;
    }
    
    public int getHarga()
    {
        return harga;
    }
    
    public void setHarga(int bookHarga) {
        this.harga = bookHarga;
    }
    
    public int getTahunTerbit()
    {
        return tahunTerbit;
    }
    
    public void setTahunTerbit(int bookTahunTerbit) {
        this.tahunTerbit = bookTahunTerbit;
    }
    
    public int getStok()
    {
        return stok;
    }
    
    public void setStok(int bookStok) {
        this.stok = bookStok;
    }
}
