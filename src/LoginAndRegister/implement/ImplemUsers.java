/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package LoginAndRegister.implement;

import LoginAndRegister.entity.Users;
import LoginAndRegister.interfaces.InterUsers;
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
public class ImplemUsers implements InterUsers {
    
    public Users insert(Users o) throws SQLException {
        PreparedStatement ps = MyConnection.getConnection().prepareStatement("insert into tbl_users values(?,?,?,?,?,?,?,?)");
        ps.setString(1, o.getFrontName());
        ps.setString(2, o.getLastName());
        ps.setString(3, o.getUserName());
        ps.setString(4, o.getEmail());
        ps.setString(5, o.getPassword());
        ps.setString(6, o.getBirthDate());
        ps.setString(7, o.getAddress());
        ps.setString(8, o.getType());
        ps.executeUpdate();
        return o;
    }
    
    public void update(Users o) throws SQLException {
        PreparedStatement ps=MyConnection.getConnection().prepareStatement("update tbl_users set u_fname=?,u_lname=?,u_uname=?,u_email=?,"
                + "u_pass=?,u_bdate=?,u_address=?,u_type=? where u_id=?");
        ps.setString(1, o.getFrontName());
        ps.setString(2, o.getLastName());
        ps.setString(3, o.getUserName());
        ps.setString(4, o.getEmail());
        ps.setString(5, o.getPassword());
        ps.setString(6, o.getBirthDate());
        ps.setString(7, o.getAddress());
        ps.setString(8, o.getType());
        ps.setInt(9, o.getId());
        ps.executeUpdate();
    }
    
    public void delete(int o) throws SQLException {
        PreparedStatement ps=MyConnection.getConnection().prepareStatement("delete from tbl_users where u_id=?");
        ps.setInt(1, o);
        ps.executeUpdate();
    }
    
    public List<Users> getAll() throws SQLException {
        Statement st = MyConnection.getConnection().createStatement();
        ResultSet rs=st.executeQuery("select *from kasir");
        List<Users>list=new ArrayList<Users>();
        while(rs.next()){
            Users o=new Users();
            o.setId(rs.getInt("u_id"));
            o.setFrontName(rs.getString("u_fname"));
            o.setLastName(rs.getString("u_lname"));
            o.setUserName(rs.getString("u_uname"));
            o.setEmail(rs.getString("u_email"));
            o.setPassword(rs.getString("u_pass"));
            o.setBirthDate(rs.getString("u_bdate"));
            o.setAddress(rs.getString("u_address"));
            o.setType(rs.getString("u_type"));
            list.add(o);
        }
        return list;
    }
    
    public Users getByUsername(String o) throws SQLException {
        PreparedStatement ps=MyConnection.getConnection().prepareStatement("select * from tbl_users where u_uname=?");
        ps.setString(1, o);
        ResultSet rs=ps.executeQuery();
        Users users=new Users();
        if(rs.next()){
            users.setId(rs.getInt("u_id"));
            users.setFrontName(rs.getString("u_fname"));
            users.setLastName(rs.getString("u_lname"));
            users.setUserName(rs.getString("u_uname"));
            users.setEmail(rs.getString("u_email"));
            users.setPassword(rs.getString("u_pass"));
            users.setBirthDate(rs.getString("u_bdate"));
            users.setAddress(rs.getString("u_address"));
            users.setType(rs.getString("u_type"));
        }
        return users;
    }
}
