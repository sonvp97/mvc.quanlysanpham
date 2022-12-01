package com.example.service;

import com.example.product.Product;

import java.util.ArrayList;
import java.util.List;

public class ProductServiceImpl implements ProductService {
    private static List<Product> list = new ArrayList<>();

    static {
        list.add(new Product(1,"coca",8000,"Nước Ngọt","Năm Châu",300));
        list.add(new Product(2,"pesi",88000,"Nước Ngọt","Năm Cam",100));
        list.add(new Product(3,"khong do",18000,"Nước Ngọt","Năm Sáu",200));
        list.add(new Product(4,"doctor thanh",6000,"Nước Ngọt","Năm Mười",600));
        list.add(new Product(5,"Number one",4000,"Nước Ngọt","Năm Ngón Tay",56));
    }

    @Override
    public List<Product> findAll() {
        return list;
    }

    @Override
    public void save(Product product) {
        list.add(product);
    }


    @Override
    public Product findById(int id) {
        for (Product p : list){
            if(p.getId() == id){
                return p;
            }
        }
        return null;
    }

    @Override
    public List<Product> findByName(String name) {
        List<Product> listProduct = new ArrayList<>();
        for(Product p : list){
            if (p.getName().toLowerCase().contains(name.toLowerCase())){
                listProduct.add(p);
            }
        }
        return listProduct;
    }

    @Override
    public void update(int id, Product product) {
        if(findById(id) != null){
            findById(id).setName(product.getName());
            findById(id).setPrice(product.getPrice());
            findById(id).setProducer(product.getProducer());
            findById(id).setQuantity(product.getQuantity());
        }
    }

    @Override
    public void remove(int id) {
        if(findById(id)!=null){
            list.remove(findById(id));
        }
    }

    @Override
    public void sort() {

    }
}
