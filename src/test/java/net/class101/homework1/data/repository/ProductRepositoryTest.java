package net.class101.homework1.data.repository;

import net.class101.homework1.data.entity.Product;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.util.Assert;

import java.util.List;

@SpringBootTest
public class ProductRepositoryTest {
    @Autowired
    ProductRepository productRepository;

    @Test
    public void findAllTest() {
        List<Product> list = (List<Product>) productRepository.findAll();
        Assert.notEmpty(list, "data does not exists");
    }
}
