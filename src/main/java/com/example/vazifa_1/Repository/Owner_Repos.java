package com.example.vazifa_1.Repository;

import com.example.vazifa_1.Projection.Custom_Customer;
import com.example.vazifa_1.entity.Product_properties;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource(path = "input" , collectionResourceRel = "List", excerptProjection = Custom_Customer.class)

public interface Owner_Repos extends JpaRepository<Product_properties,Integer> {
}
