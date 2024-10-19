package com.learning.procuct_mangaement_using_SpringJPA;

import com.learning.procuct_mangaement_using_SpringJPA.Entity.Product;
import com.learning.procuct_mangaement_using_SpringJPA.Service.ProductService;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@SpringBootApplication
public class ProcuctMangaementUsingSpringJpaApplication {

	public static void main(String[] args) {
		ConfigurableApplicationContext container = SpringApplication.run(ProcuctMangaementUsingSpringJpaApplication.class, args);
		ProductService product=container.getBean(ProductService.class);
//		LocalDate.ofYearDay(2024,55);
//		Product productA=new Product("Apple Jam",300.0, LocalDate.now());
//		Product productB=new Product("Bread",100.0, LocalDate.ofYearDay(2024,55));
//		Product productC=new Product("Coffee",900.0, LocalDate.ofYearDay(2024,95));
//		Product productD=new Product("Ice Cream",600.0, LocalDate.ofYearDay(2024,65));
//		Product productE=new Product("Pickels",400.0, LocalDate.ofYearDay(2024,155));
//		Product productF=new Product("Pulses",500.0, LocalDate.ofYearDay(2024,355));
//
//
//		List<Product> productList=new ArrayList<>();
//		productList.add(productB);
//		productList.add(productC);
//		productList.add(productD);
//		productList.add(productE);
//		productList.add(productF);
//
//		product.addAllProducts(productList);
//		System.out.println("Total products: "+product.findCount());
//		product.getAllProducts().forEach(prod-> System.out.println(prod));
//		System.out.println(product.findById(2).toString());
		System.out.println(product.deleteVaccineById(3));
	}


}
