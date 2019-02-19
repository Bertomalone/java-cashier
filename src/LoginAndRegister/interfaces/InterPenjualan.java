/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package LoginAndRegister.interfaces;

import LoginAndRegister.entity.Penjualan;
import java.sql.SQLException;

/**
 *
 * @author bertomalone
 */
public interface InterPenjualan {
    
    Penjualan insert(Penjualan o) throws SQLException;

    void update(Penjualan o)throws SQLException;
}
