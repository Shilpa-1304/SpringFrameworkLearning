package com.learning.sorting_and_pagination_springJPA.service;
import com.learning.sorting_and_pagination_springJPA.entity.Product;

public interface IProuctService {
    public Iterable<Product> findAllProducts(Boolean status,String... properties);
    public Iterable<Product> fetchAllProcucts(int pageNumber,int pageSize,Boolean status, String... properties);
    public void fetchDataByPagination(int pageSize);

}
