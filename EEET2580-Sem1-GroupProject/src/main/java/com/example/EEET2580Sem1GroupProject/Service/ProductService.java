package com.example.EEET2580Sem1GroupProject.Service;

import com.example.EEET2580Sem1GroupProject.Models.Product;
import com.example.EEET2580Sem1GroupProject.Models.Seller;
import com.example.EEET2580Sem1GroupProject.Repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import java.text.DecimalFormat;
import java.text.NumberFormat;
import java.util.List;

@Service
public class ProductService {

//
//    @Autowired
//    private ProductRepository productRepository;
//
//
//    public List<Product> getAllProducts(){
//        return productRepository.findAll();
//    }
//
//    public Product getProductById(Long id){
//        return productRepository.findByProductID(id);
//    }
//
//    public void addProduct(Product product){
//        productRepository.save(product);
//    }
}
