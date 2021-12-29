package club.junefory.spi.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 * @author Jarvis
 * @version 1.0
 * @description: TODO
 * @date 2021/12/29 14:42
 */
public class SpiJdbcDemo {
    public static void main(String[] args) {
        try {
            Connection connection = DriverManager.getConnection("");

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
