package com.learning.procuct_mangaement_using_SpringJPA.Service;

import com.learning.procuct_mangaement_using_SpringJPA.Entity.Product;

import java.util.Optional;

public interface IProuctService {
    public String addProduct(Product product);
    public Iterable<Product> addAllProducts(Iterable<Product> procuctList);
    public Long findCount();
    public Product findById(Integer id);
    public Iterable<Product> getAllProducts();
    public String deleteVaccineById(Integer id);
}
