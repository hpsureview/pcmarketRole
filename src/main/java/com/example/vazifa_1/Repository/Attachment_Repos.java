package com.example.vazifa_1.Repository;

import com.example.vazifa_1.entity.Product;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource(path = "attachment_center" , collectionResourceRel = "List", excerptProjection = Product.class)

public interface Attachment_Repos extends JpaRepository<Product,Integer> {
}
