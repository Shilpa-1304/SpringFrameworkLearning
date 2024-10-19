package com.learning.sorting_and_pagination_springJPA.dao;

import com.learning.sorting_and_pagination_springJPA.entity.Product;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.PagingAndSortingRepository;
//Repository is the parent of PagingAndSortingRepository
public interface IProductRepo extends PagingAndSortingRepository<Product,Integer> {
}
