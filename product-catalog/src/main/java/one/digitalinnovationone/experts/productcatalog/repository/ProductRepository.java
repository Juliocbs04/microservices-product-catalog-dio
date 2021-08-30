package one.digitalinnovationone.experts.productcatalog.repository;

import one.digitalinnovationone.experts.productcatalog.model.Product;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProductRepository extends CrudRepository<Product, Integer> {

}
