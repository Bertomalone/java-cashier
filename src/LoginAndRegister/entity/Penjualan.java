package LoginAndRegister.entity;

import java.util.Date;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author bertomalone
 */
public class Penjualan {
    
    private int id;
    private Books buku;
    private Users roles;
    private int jumlah;
    private double total;
    private Date tanggal;

    public Penjualan() {
    }

    public Penjualan(int id, Books buku, Users role, int jumlah, double total, Date tanggal) {
        this.id = id;
        this.buku = buku;
        this.roles = role;
        this.jumlah = jumlah;
        this.total = total;
        this.tanggal = tanggal;
    }

    public Books getBuku() {
        return buku;
    }

    public void setBuku(Books buku) {
        this.buku = buku;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getJumlah() {
        return jumlah;
    }

    public void setJumlah(int jumlah) {
        this.jumlah = jumlah;
    }

    public Users getUsers() {
        return roles;
    }

    public void setUsers(Users role) {
        this.roles = role;
    }

    public Date getTanggal() {
        return tanggal;
    }

    public void setTanggal(Date tanggal) {
        this.tanggal = tanggal;
    }

    public double getTotal() {
        return total;
    }

    public void setTotal(double total) {
        this.total = total;
    }
    
}
