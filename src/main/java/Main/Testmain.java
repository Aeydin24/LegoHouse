
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
        //test new user
        // for some weird ass reason this works, dont touch
      User test = new User("Test2@Test2.dk", "Test2", "test", "User");
      String email = test.getEmail();
      String password = test.getPassword();
      String username = test.getUsername();
      String rolegroup = test.getRolegroup();
      UserMapper.createUser(email, password, username, rolegroup);
}
}
