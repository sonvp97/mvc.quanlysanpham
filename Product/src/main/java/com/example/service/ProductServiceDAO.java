package com.example.service;

import com.example.product.Product;

import java.sql.*;
import java.util.ArrayList;
import java.util.ConcurrentModificationException;
import java.util.List;

public class ProductServiceDAO implements ProductService {
    private static final String URL = "jdbc:mysql://localhost:3306/demo2";

    private static final String USER = "root";
    private static final String PASS = "admin";
    private static final String SELECT_ALL_PRODUCT = "select*from product;";
    private static final String ADD_PRODUCT = "insert into product(`name`,price,`describe`,producer,quantity) value(?,?,?,?,?);";
    private static final String SELECT_BY_ID_PRODUCT = "select * from product where id = ?;";
    private static final String UPDATE_BY_ID_PRODUCT = "update product set `name` = ?,price = ?,`describe` = ?,producer = ?,quantity = ? where id = ?;";
    private static final String SELECT_BY_NAME = "select * from product where like name = '%'?;";

    private static final String DELETE_BY_ID = "delete from product where id = ?;";
    Connection connection;

    public Connection getConnection() {
        try {
            Class.forName("com.mysql.jdbc.Driver");
            connection = DriverManager.getConnection(URL, USER, PASS);
        } catch (SQLException e) {
            throw new RuntimeException(e);
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        }
        return connection;
    }

    @Override
    public List<Product> findAll() {
        List<Product> list = new ArrayList<>();
        try (Connection connection = getConnection();
             PreparedStatement preparedStatement = connection.prepareStatement(SELECT_ALL_PRODUCT);) {
            ResultSet rs = preparedStatement.executeQuery();
            while (rs.next()) {
                String name = rs.getString("name");
                double price = rs.getDouble("price");
                String describe = rs.getString("describe");
                String producer = rs.getString("producer");
                int id = rs.getInt("id");
                int quantity = rs.getInt("quantity");
                Product product = new Product(id, name, price, describe, producer, quantity);
                list.add(product);
            }

        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
        return list;
    }

    @Override
    public void save(Product customer) {
        try (Connection connection = getConnection();
             PreparedStatement preparedStatement = connection.prepareStatement(ADD_PRODUCT);) {
            preparedStatement.setString(1, customer.getName());
            preparedStatement.setDouble(2, customer.getPrice());
            preparedStatement.setString(3, customer.getDescribe());
            preparedStatement.setString(4, customer.getProducer());
            preparedStatement.setInt(5, customer.getQuantity());
            preparedStatement.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    @Override
    public Product findById(int id) {
        Product product = null;
        try (Connection connection = getConnection();
             PreparedStatement preparedStatement = connection.prepareStatement(SELECT_BY_ID_PRODUCT);) {
            preparedStatement.setInt(1, id);
            ResultSet resultSet = preparedStatement.executeQuery();
            while (resultSet.next()) {
                String name = resultSet.getString("name");
                double price = resultSet.getDouble("price");
                String describe = resultSet.getString("describe");
                String producer = resultSet.getString("producer");
                int quantity = resultSet.getInt("quantity");
                product = new Product(id, name, price, describe, producer, quantity);
            }

        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
        return product;
    }

    @Override
    public List<Product> findByName(String name) {
        List<Product> list = new ArrayList<>();
        try (Connection connection = getConnection();
             PreparedStatement preparedStatement = connection.prepareStatement(SELECT_BY_NAME);) {
            preparedStatement.setString(1, name);
            ResultSet rs = preparedStatement.executeQuery();
            while (rs.next()) {
                int id = rs.getInt("id");
                String name1 = rs.getString("name");
                double price = rs.getDouble("price");
                String describe = rs.getString("describe");
                String producer = rs.getString("producer");
                int quantity = rs.getInt("quantity");
                Product product = new Product(id, name1, price, describe, producer, quantity);
                list.add(product);
            }

        } catch (SQLException e) {
            e.printStackTrace();
        }
        return list;
    }

    @Override
    public void update(int id, Product product) {
        try (Connection connection = getConnection();
             PreparedStatement preparedStatement = connection.prepareStatement(UPDATE_BY_ID_PRODUCT);) {
            preparedStatement.setString(1, product.getName());
            preparedStatement.setDouble(2, product.getPrice());
            preparedStatement.setString(3, product.getDescribe());
            preparedStatement.setString(4, product.getProducer());
            preparedStatement.setInt(5, product.getQuantity());
            preparedStatement.setInt(6, id);
            preparedStatement.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    @Override
    public void remove(int id) {
        try (Connection connection = getConnection();
             PreparedStatement preparedStatement = connection.prepareStatement(DELETE_BY_ID);) {
            preparedStatement.setInt(1,id);
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    @Override
    public void sort() {

    }
}
