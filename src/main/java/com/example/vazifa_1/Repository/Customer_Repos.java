package com.example.vazifa_1.Repository;

import com.example.vazifa_1.Projection.Custom_Attachment;
import com.example.vazifa_1.entity.Attachment_content;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource(path = "cateory" , collectionResourceRel = "List", excerptProjection = Custom_Attachment.class)

public interface Customer_Repos extends JpaRepository<Attachment_content,Integer> {
}
