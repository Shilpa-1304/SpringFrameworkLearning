package com.learning.procuct_mangaement_using_SpringJPA.Dao;

import com.learning.procuct_mangaement_using_SpringJPA.Entity.Product;
import org.springframework.data.repository.CrudRepository;

public interface IProductRepo extends CrudRepository<Product,Integer>  {
}
