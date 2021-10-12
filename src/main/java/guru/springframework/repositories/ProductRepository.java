package guru.springframework.repositories;

import guru.springframework.domain.Product;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;

/**
 * Created by jt on 5/6/16.
 */
public interface ProductRepository extends JpaRepository<Product, Integer> {
}
