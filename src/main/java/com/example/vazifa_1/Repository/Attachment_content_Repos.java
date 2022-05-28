package com.example.vazifa_1.Repository;

import com.example.vazifa_1.entity.Category;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource(path = "attachment" , collectionResourceRel = "List", excerptProjection = Category.class)

public interface Attachment_content_Repos extends JpaRepository<Category,Integer> {
}
