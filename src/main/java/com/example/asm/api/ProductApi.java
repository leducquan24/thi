package com.example.asm.api;

import com.example.asm.entity.Product;
import com.example.asm.repository.ProductRepository;
import com.example.asm.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping(path = "api/v1/products")
public class ProductApi {
    @Autowired
    ProductService productService;
    @Autowired
    ProductRepository productRepository;
    private static List<Product> products = new ArrayList<>();

    @RequestMapping(method = RequestMethod.GET)
    public List<Product> findAll() {return products;}
    @RequestMapping(method = RequestMethod.GET, path = "{id}")
    public Product findById(@PathVariable int id){
        if (products.get(i).getId()== id){
            foundIndex = 1;
        }
        if (foundIndex == -1){
            return null;
        }
        return products.get(foundIndex);
    }
    @RequestMapping(method = RequestMethod.POST)
    public Product save(@RequestBody Product product){
        products.add(product);
        return product;
    }
    @RequestMapping(method = RequestMethod.PUT, path = "{id}")
    public Product update(@PathVariable int id, @RequestBody Product updateProduct){
        int foundIndex = -1;
        for(int i = 0; i < products.size(); i++){
            if (products.get(i).getId()==id){
                foundIndex = i;
            }
        }
        if (foundIndex == -1){
            return null;
        }
        products.get(foundIndex).setName(updateProduct.getName());
        products.get(foundIndex).setDescription(updateProduct.getDescription());
        return products.get(foundIndex);
    }
    @RequestMapping(method = RequestMethod.DELETE, path = "{id}")
    public Product delete(@PathVariable int id){
        int foundIndex = -1;
        for (int i = 0; i < products.size(); i++){
            if (products.get(i).getId() == id){
                foundIndex = 1;
            }
        }
        if (foundIndex == -1){
            return null;
        }
        products.remove(foundIndex);
        return products.get(foundIndex);
    }

}
