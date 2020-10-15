package net.class101.homework1.data.repository;

import net.class101.homework1.data.entity.Product;
import org.springframework.data.repository.CrudRepository;

public interface ProductRepository extends CrudRepository<Product, Integer> {
}
