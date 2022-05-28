package com.example.vazifa_1.Repository;

import com.example.vazifa_1.Projection.Custom_Category;
import com.example.vazifa_1.entity.Customer;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource(path = "input" , collectionResourceRel = "List", excerptProjection = Custom_Category.class)

public interface Product_property_Repos extends JpaRepository<Customer,Integer> {
}
