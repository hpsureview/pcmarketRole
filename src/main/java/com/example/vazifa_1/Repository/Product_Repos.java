package com.example.vazifa_1.Repository;

import com.example.vazifa_1.Projection.Custom_Product;
import com.example.vazifa_1.entity.Role;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource(path = "measurment" , collectionResourceRel = "List", excerptProjection = Custom_Product.class)

public interface Product_Repos extends JpaRepository<Role,Integer> {
}
