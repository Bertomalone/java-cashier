/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package LoginAndRegister.interfaces;

import LoginAndRegister.entity.Users;
import java.sql.SQLException;
import java.util.List;

/**
 *
 * @author bertomalone
 */
public interface InterUsers {
    
    Users insert(Users o)throws SQLException;

    void update(Users o)throws SQLException;

    void delete(int o) throws SQLException;

    List<Users>getAll() throws SQLException;

    Users getByUsername(String o) throws SQLException;
    
}
