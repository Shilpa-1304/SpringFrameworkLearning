package com.learning.sorting_and_pagination_springJPA;

import com.learning.sorting_and_pagination_springJPA.entity.Product;
import com.learning.sorting_and_pagination_springJPA.service.IProuctService;
import com.learning.sorting_and_pagination_springJPA.service.ProductService;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class SortingAndPaginationSpringJpaApplication {

	public static void main(String[] args) {

		ConfigurableApplicationContext container = SpringApplication.run(SortingAndPaginationSpringJpaApplication.class, args);
		IProuctService prouctService=container.getBean(ProductService.class);
//		prouctService.findAllProducts(false,"productName","productPrice").forEach(product -> System.out.println(product.toString()));
//		prouctService.fetchAllProcucts(1,4,true,"productPrice").forEach(product -> System.out.println(product));
		prouctService.fetchDataByPagination(3);
	}

}
