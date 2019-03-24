
package Data;

import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import Logic.User;
import Logic.Order;
/**
 *
 * @author benjaminbajrami
 */
public class OrderMapper {
    

    /**
     * createOrder adds a new order to the database.
     *
     * The prepareStatement interface improves performance in the application by
     * using passing parameter (?) the query is compiled only once.
     */
    public static void createOrder(User user, Order order) throws SQLException, ClassNotFoundException {
            try {
                Connector connect = new Connector();

                String addOrder
                        = "INSERT INTO legoDB.Orders (`id`, `length`, `width`, `quantityheight`) "
                        + "VALUES(?,?,?,?);";

                PreparedStatement ps = connect.getConnection().prepareStatement(addOrder);
                ps.setInt(1, user.getId());
                ps.setInt(2, order.getLength());
                ps.setInt(3, order.getWidth());
                ps.setInt(4, order.getQuantityheigth());
                
                ps.executeUpdate();
                
            } catch (SQLException ex) {
                Logger.getLogger(UserMapper.class.getName()).log(Level.SEVERE, null, ex);
            }
        }

    /**
     * getOrders returns all orders from one user.
     */
    public static List<Order> getOrders(User user) {
        List<Order> orders = new ArrayList<>();
        
        
        
        return orders;
    }
    

}
