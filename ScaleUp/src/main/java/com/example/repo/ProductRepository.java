package com.example.repo;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.example.model.Product;
@Repository
public interface ProductRepository extends JpaRepository<Product, Long>{
	 @Query(value = "SELECT c FROM Product c WHERE c.name LIKE '%' || :keyword || '%'"
	            + " OR c.details LIKE '%' || :keyword || '%'")
	    public List<Product> search(@Param("keyword") String keyword);

}
