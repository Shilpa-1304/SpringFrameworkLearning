package com.learning.procuct_mangaement_using_SpringJPA.Service;

import com.learning.procuct_mangaement_using_SpringJPA.Dao.IProductRepo;
import com.learning.procuct_mangaement_using_SpringJPA.Entity.Product;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class ProductService implements IProuctService{
    @Autowired
    private IProductRepo repo;
    @Override
    public String addProduct(Product product) {
        Product savedProduct=repo.save(product);
        return "Product saved with id : "+savedProduct.getProductId();
    }

    @Override
    public Iterable<Product> addAllProducts(Iterable<Product> productList) {
        return repo.saveAll(productList);
    }

    @Override
    public Long findCount() {
        return repo.count();
    }

    @Override
    public Product findById(Integer id) {
        Optional<Product> product=repo.findById(id);
        if(product.isPresent())
            return product.get();
        else
            return new Product();
    }

    @Override
    public Iterable<Product> getAllProducts() {
        return repo.findAll();
    }

    @Override
    public String deleteVaccineById(Integer id) {
        if(repo.existsById(id)){
            repo.deleteById(3);
            return "Deletion successful";
        }
        return "No such Product found";
    }
}
