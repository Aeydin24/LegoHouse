/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Data;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Properties;

/**
 *
 * @author benjaminbajrami
 */

public class Connector {

    private static final String URL         = "jdbc:mysql://localhost:3306/lego";
    private static final String USERNAME    = "root";
    private static final String PASSWORD    = "1234";

    private static Connection Newinstance;

    public static void setConnection(Connection connect) {
        Newinstance = connect;
    }

    public static Connection connection() throws ClassNotFoundException, SQLException {
        if ( Newinstance == null ) {
            Class.forName( "com.mysql.cj.jdbc.Driver" );
            Newinstance = DriverManager.getConnection( URL, USERNAME, PASSWORD );
        }
        return Newinstance;
    }
    
}


