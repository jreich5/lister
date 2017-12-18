package com.codeup.lister.dao;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;
import com.codeup.lister.dao.models.Item;
import com.codeup.lister.dao.Items;
import com.mysql.cj.jdbc.Driver;

public class ItemDao implements Items {

    private Connection connection = null;

    public ItemDao(Config config) {

        try {
            DriverManager.registerDriver(new Driver());
            this.connection = DriverManager.getConnection(
                    config.getUrl(),
                    config.getUser(),
                    config.getPassword()
            );

        } catch (SQLException e) {
            e.printStackTrace();
        }

    }

    @Override
    public ArrayList<Item> getAllItems() {

        String selectQuery = "SELECT * FROM items";
        ArrayList<Item> items = new ArrayList<>();
        try {
            PreparedStatement ps = connection.prepareStatement(selectQuery);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                items.add(new Item(rs.getLong("id"), rs.getString("name")));
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return items;
    }

    @Override
    public long deleteItem(long id) {
        return 0;
    }

    @Override
    public long updateItem(long id) {
        return 0;
    }

    @Override
    public long createItem(Item item) {
        return 0;
    }

    @Override
    public Item findItem(long id) {
        return null;
    }
}
