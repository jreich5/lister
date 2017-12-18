package com.codeup.lister.dao;

public class DaoFactory {

    private static Config config = new Config();
    private static Items itemDao;

    public static Items getItemsDao() {
        if (itemDao == null) {
            itemDao = new ItemDao(config);
        }
        return itemDao;
    }

}
