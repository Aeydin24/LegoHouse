/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Data;
import Data.Connector;
import Logic.User;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
/**
 *
 * @author benjaminbajrami
 */
public class UserMapper {
    public static void createUser(String email, String password) throws SQLException, ClassNotFoundException 
    {
       if (email != null && password != null)
       {    
        try {
            Connector connect = new Connector();
            
            String addUser
                    = "INSERT INTO lego.user (`email`, `password`) "
                    + "VALUES(?,?);";

            PreparedStatement ps = connect.connection().prepareStatement(addUser);
            ps.setString(1, email);
            ps.setString(2, password);
            ps.executeUpdate();
            } catch (SQLException ex) {
          Logger.getLogger(UserMapper.class.getName()).log(Level.SEVERE, null, ex);  
            }
        }
    }

   public static User login(String email, String password) throws Exception {
        try {
            Connection con = Connector.connection();
            String SQL = "SELECT id FROM user "
                    + "WHERE email=? AND password=?";
            PreparedStatement ps = con.prepareStatement(SQL);
            ps.setString(1, email);
            ps.setString(2, password);
            ResultSet rs = ps.executeQuery();
            if (rs.next()) {
                int id = rs.getInt("id");
                User user = new User(email, password);
                user.setId(id);
                return user;
            } else {
                throw new Exception("Validation failed");
            }
        } catch (ClassNotFoundException | SQLException ex) {
            throw new Exception(ex.getMessage());
        }
    }
   public static User getUser(String email) throws SQLException, ClassNotFoundException {
        User user = new User();
        Connector con = new Connector();

        String query
                = "SELECT * FROM lego.user "
                + "WHERE `email`='" + email + "';";

        Connection connection = con.connection();
        Statement stmt = connection.createStatement();
        ResultSet rs = stmt.executeQuery(query);

        while (rs.next()) {
            String password = rs.getString("password");
            user.setPassword(password);
        }
        
        user.setEmail(email);
        return user;
    }
}
