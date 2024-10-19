package com.learning.sorting_and_pagination_springJPA.service;

import com.learning.sorting_and_pagination_springJPA.dao.IProductRepo;
import com.learning.sorting_and_pagination_springJPA.entity.Product;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class ProductService implements IProuctService{
    @Autowired
    private IProductRepo repo;

    @Override
    public Iterable<Product> findAllProducts(Boolean status,String... properties) {
        Sort sort=Sort.by(status? Sort.Direction.ASC: Sort.Direction.DESC,properties);
        return repo.findAll(sort);
    }

    @Override
    public Iterable<Product> fetchAllProcucts(int pageNumber, int pageSize, Boolean status, String... properties) {
        Sort sort=Sort.by(status? Sort.Direction.ASC: Sort.Direction.DESC,properties);
        Pageable pageable= PageRequest.of(pageNumber,pageSize,sort);
        Page<Product> page=repo.findAll(pageable);
        return page.getContent();
    }

    @Override
    public void fetchDataByPagination(int pageSize) {
        long count =12l;
        long pageCount=count/pageSize;
        pageCount=count%pageSize==0?pageCount:pageCount++;
        for(int i=0;i<pageCount;i++){
            PageRequest pageable=PageRequest.of(i,pageSize);
            Page<Product> pages=repo.findAll(pageable);
            System.out.println("Page Number: "+i);
            pages.forEach(product -> System.out.println(product));
            System.out.println(PageRequest.ofSize(pageSize));
        }

    }
}
