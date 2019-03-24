/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Data;


import Logic.User;
import java.sql.SQLException;
/**
 *
 * @author benjaminbajrami
 */
public class UserCheck {
    public static boolean isValid(String username, String password) throws SQLException {
        User user = new User();
        if(password == null) {
            return false;
        }
        if(user.getPassword() == null) {
            return false;
        }
        return password.equals(user.getPassword());
            
    }
    public User getUser(String username) throws SQLException 
    {
        return UserMapper.getUser(username);
    }
}
