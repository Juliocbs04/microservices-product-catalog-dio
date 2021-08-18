package one.digitalinnovationone.experts.productcatalog.controller;

import one.digitalinnovationone.experts.productcatalog.model.Product;
import one.digitalinnovationone.experts.productcatalog.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RestController
@RequestMapping("/product")
public class ProductController {

    @Autowired
    private ProductRepository productRepository;

    @PostMapping
    public Product create(@RequestBody Product p){
        return productRepository.save(p);
    }
    @RequestMapping("/{id}")
    public Optional<Product> findByID(@PathVariable Long id){
        return productRepository.findById(id);
    }
}
