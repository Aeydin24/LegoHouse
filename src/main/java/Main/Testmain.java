/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Main;

import Data.UserMapper;
import Logic.User;
import java.sql.SQLException;
import javax.security.auth.login.LoginException;

/**
 *
 * @author benjaminbajrami
 */
public class Testmain {
    public static void main(String[] args) throws SQLException, ClassNotFoundException, LoginException {

        /* This works */
      UserMapper mapper = new UserMapper();
      User test = new User("Test2@Test2.dk", "Test2");
      String email = test.getEmail();
      String password = test.getPassword();
      mapper.createUser(email, password);
}
}
