package com.codeup.lister.dao;

import java.sql.Connection;
import java.sql.Driver;
import java.sql.DriverManager;
import java.sql.SQLException;
import com.codeup.lister.dao.Config;

public class DaoTest {

    public static void main(String[] args) {
        Config config = new Config();
        try {
            Connection connection = DriverManager.getConnection(
                    config.getUrl(),
                    config.getUser(),
                    config.getPassword()
            );
        } catch (SQLException e) {
            e.printStackTrace();
        }

    }

}
