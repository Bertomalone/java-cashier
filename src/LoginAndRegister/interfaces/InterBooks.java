package LoginAndRegister.interfaces;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import LoginAndRegister.entity.Books;
import java.sql.SQLException;
import java.util.List;

/**
 *
 * @author bertomalone
 */
public interface InterBooks {
    Books insert(Books o) throws SQLException;
    
    void update(Books o) throws SQLException;
    
    void delete(String o) throws SQLException;
    
    List<Books> getAll() throws SQLException;

    List<Books> getByPenulis(String penu) throws SQLException;
    
    List<Books> getById(String o) throws SQLException;

    Books getByOne(String o) throws SQLException;
}
