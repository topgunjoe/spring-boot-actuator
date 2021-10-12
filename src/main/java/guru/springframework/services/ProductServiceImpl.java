package guru.springframework.services;

import guru.springframework.domain.Product;
import guru.springframework.repositories.ProductRepository;
import org.apache.commons.collections4.IteratorUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by jt on 1/26/16.
 */
@Service
public class ProductServiceImpl implements ProductService {

    private ProductRepository productRepository;

    @Autowired
    public ProductServiceImpl(ProductRepository productRepository) {
        this.productRepository = productRepository;
    }

    @Override
    public Product getProduct(Integer id) {
        return productRepository.findById(id).get();
    }

    @Override
    public List<Product> listProducts() {

        return IteratorUtils.toList(productRepository.findAll().iterator());
    }

}
