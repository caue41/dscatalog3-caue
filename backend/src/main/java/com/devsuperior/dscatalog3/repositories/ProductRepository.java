package com.devsuperior.dscatalog3.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.devsuperior.dscatalog3.entities.Product;

@Repository
public interface ProductRepository extends JpaRepository<Product, Long>{

}
