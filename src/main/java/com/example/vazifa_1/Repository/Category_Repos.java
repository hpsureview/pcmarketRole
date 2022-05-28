package com.example.vazifa_1.Repository;

import com.example.vazifa_1.Projection.Custom_Attachment_content;
import com.example.vazifa_1.entity.Owner;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource(path = "Client" , collectionResourceRel = "List", excerptProjection = Custom_Attachment_content.class)

public interface Category_Repos extends JpaRepository<Owner,Integer> {
}
