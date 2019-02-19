package LoginAndRegister.implement;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import LoginAndRegister.entity.Books;
import LoginAndRegister.interfaces.InterBooks;
import LoginAndRegister.connection.MyConnection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author bertomalone
 */
public class ImplemBooks implements InterBooks {
    
    public Books insert(Books o) throws SQLException {
        PreparedStatement ps = MyConnection.getConnection().prepareStatement("insert tbl_daftar_buku values(?,?,?,?,?,?,?)");
        ps.setString(1, o.getId());
        ps.setString(2, o.getJudul());
        ps.setString(3, o.getPenulis());
        ps.setString(4, o.getTanggalMasuk());
        ps.setInt(5, o.getHarga());
        ps.setInt(6, o.getTahunTerbit());
        ps.setInt(7, o.getStok());
        ps.executeUpdate();
        return o;
    }
    
    public void update(Books o) throws SQLException {
        PreparedStatement ps = MyConnection.getConnection().prepareStatement("update tbl_daftar_buku set judul_buku=?, penulis_buku=?, tanggal_masuk=?,"
                + " harga_buku=?, tahun_terbit=?, stok_buku=? where id_buku=?");
        ps.setString(1, o.getJudul());
        ps.setString(2, o.getPenulis());
        ps.setString(3, o.getTanggalMasuk());
        ps.setInt(4, o.getHarga());
        ps.setInt(5, o.getTahunTerbit());
        ps.setInt(6, o.getStok());
        ps.setString(7, o.getId());
        ps.executeUpdate();
    }
    
    public void delete(String o) throws SQLException {
        PreparedStatement ps = MyConnection.getConnection().prepareStatement("delete from tbl_daftar_buku where id_buku=?");
        ps.setString(1, o);
        ps.executeUpdate();
    }
    
    public List<Books> getAll() throws SQLException {
        Statement st = MyConnection.getConnection().createStatement();
        ResultSet rs=st.executeQuery("select * from tbl_daftar_buku");
        List<Books> list = new ArrayList<Books>();
        while(rs.next()){
            Books o = new Books();
            o.setId(rs.getString("id_buku"));
            o.setJudul(rs.getString("judul_buku"));
            o.setPenulis(rs.getString("penulis_buku"));
            o.setTanggalMasuk(rs.getString("tanggal_masuk"));
            o.setHarga(rs.getInt("harga_buku"));
            o.setTahunTerbit(rs.getInt("tahun_terbit"));
            o.setStok(rs.getInt("stok_buku"));
            
            list.add(o);
        }
        return list;
    }
    
    public List<Books> getByPenulis(String penu) throws SQLException {
        PreparedStatement ps=MyConnection.getConnection().prepareStatement("select *from tbl_daftar_buku where penulis_buku like ?");
        ps.setString(1, "%"+penu+"%");
        ResultSet rs=ps.executeQuery();
        List<Books> list=new ArrayList<Books>();
        while(rs.next()){
            Books o=new Books();
            o.setId(rs.getString("id_buku"));
            o.setJudul(rs.getString("judul_buku"));
            o.setPenulis(rs.getString("penulis_buku"));
            o.setTanggalMasuk(rs.getString("tanggal_masuk"));
            o.setHarga(rs.getInt("harga_buku"));
            o.setTahunTerbit(rs.getInt("tahun_terbit"));
            o.setStok(rs.getInt("stok_buku"));
            list.add(o);
        }
        return list;
    }
    
    public List<Books> getById(String o) throws SQLException {
        PreparedStatement ps=MyConnection.getConnection().prepareStatement("select *from tbl_daftar_buku where id_buku like ?");
        ps.setString(1,"%"+o+"%");
        ResultSet rs=ps.executeQuery();
        List<Books> list=new ArrayList<Books>();
        if(rs.next()){
            Books bk=new Books();
            bk.setId(rs.getString("id_buku"));
            bk.setJudul(rs.getString("judul_buku"));
            bk.setPenulis(rs.getString("penulis_buku"));
            bk.setTanggalMasuk(rs.getString("tanggal_masuk"));
            bk.setHarga(rs.getInt("harga_buku"));
            bk.setTahunTerbit(rs.getInt("tahun_terbit"));
            bk.setStok(rs.getInt("stok_buku"));
            list.add(bk);
        }
        return list;
    }
    
    public Books getByOne(String o) throws SQLException {
        PreparedStatement ps=MyConnection.getConnection().prepareStatement("select * from tbl_daftar_buku where id_buku=?");
        ps.setString(1,o);
        ResultSet rs=ps.executeQuery();
        Books bk=new Books();
        if(rs.next()){
            bk.setId(rs.getString("id_buku"));
            bk.setJudul(rs.getString("judul_buku"));
            bk.setPenulis(rs.getString("penulis_buku"));
            bk.setTanggalMasuk(rs.getString("tanggal_masuk"));
            bk.setHarga(rs.getInt("harga_buku"));
            bk.setTahunTerbit(rs.getInt("tahun_terbit"));
            bk.setStok(rs.getInt("stok_buku"));
        }
        return bk;
    }
}
