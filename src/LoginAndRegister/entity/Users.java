/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package LoginAndRegister.entity;

/**
 *
 * @author bertomalone
 */
public class Users {
    
    private int id;
    private String front_name;
    private String last_name;
    private String username;
    private String email;
    private String password;
    private String birth_date;
    private String address;
    private String type;
    
    public Users() {
        
    }
    
    public Users(int idUser, String frontName, String lastName, String username, String userEmail, String password, String birthDate, String userAddress, String type) {
        this.id = idUser;
        this.front_name = frontName;
        this.last_name = lastName;
        this.username = username;
        this.email = userEmail;
        this.password = password;
        this.birth_date = birthDate;
        this.address = userAddress;
        this.type = type;
    }
    
    public String getAddress() {
        return address;
    }
    
    public void setAddress(String userAddress) {
        this.address = userAddress;
    }
    
    public String getBirthDate() {
        return birth_date;
    }
    
    public void setBirthDate(String birthDate) {
        this.birth_date = birthDate;
    }
    
    public String getEmail() {
        return email;
    }
    
    public void setEmail(String userEmail) {
        this.email = userEmail;
    }
    
    public String getFrontName() {
        return front_name;
    }
    
    public void setFrontName(String frontName) {
        this.front_name = frontName;
    }
    
    public int getId() {
        return id;
    }
    
    public void setId(int idUser) {
        this.id = idUser;
    }
    
    public String getLastName() {
        return last_name;
    }
    
    public void setLastName(String lastName) {
        this.last_name = lastName;
    }
    
    public String getUserName() {
        return username;
    }
    
    public void setUserName(String username) {
        this.username = username;
    }
    
    public String getPassword() {
        return password;
    }
    
    public void setPassword(String password) {
        this.password = password;
    }
    
    public String getType() {
        return type;
    }
    
    public void setType(String type) {
        this.type = type;
    }
}
