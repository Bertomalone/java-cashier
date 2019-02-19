/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package LoginAndRegister.implement;

import LoginAndRegister.entity.Penjualan;
import LoginAndRegister.interfaces.InterPenjualan;
import LoginAndRegister.connection.MyConnection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

/**
 *
 * @author bertomalone
 */
public class ImplemPenjualan {
    
    public Penjualan insert(Penjualan o) throws SQLException {
        PreparedStatement ps=MyConnection.getConnection().prepareStatement("insert into tbl_penjualan values(null,?,?,?,?,?)");
        PreparedStatement ps2=MyConnection.getConnection().prepareStatement("update tbl_daftar_buku set stok_buku=? where id_buku=?");
        ps.setString(1, o.getBuku().getId());
        ps.setInt(2, o.getUsers().getId());
        ps.setInt(3, o.getJumlah());
        ps.setDouble(4, o.getTotal());
        ps.setDate(5, new java.sql.Date(o.getTanggal().getTime()));
        ps.executeUpdate();
        ps2.setInt(1, o.getBuku().getStok()-o.getJumlah());//update stok buku ditable buku. jumlah buku yg ada - jumlah buku yg dibeli
        ps2.setString(2, o.getBuku().getId());
        ps2.executeUpdate();
        return o;
    }
    
    public void update(Penjualan o) throws SQLException {
        throw new UnsupportedOperationException("Not supported yet.");
    }
}
