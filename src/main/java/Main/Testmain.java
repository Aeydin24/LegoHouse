
package Main;

import Data.UserMapper;
import Logic.User;
import java.sql.SQLException;
import javax.security.auth.login.LoginException;
import Data.OrderMapper;
import Logic.Order;

/**
 *
 * @author benjaminbajrami
 */
public class Testmain {
    public static void main(String[] args) throws SQLException, ClassNotFoundException, LoginException {
        //test new user
        
        // for some weird ass reason this works, dont touch
//      User test = new User("Test2@Test2.dk", "Test2", "test", "User");
//      String email = test.getEmail();
//      String password = test.getPassword();
//      String username = test.getUsername();
//      String rolegroup = test.getRolegroup();
//      UserMapper.createUser(email, password, username, rolegroup);


//        Test for new order, works as well

//        OrderMapper mapper = new OrderMapper();
//        User test = new User("Test2@Test2.dk", "Test2", "test", "User");
//        Order ord = new Order(20, 10, 3);
//        mapper.createOrder(test, ord);

}
}
