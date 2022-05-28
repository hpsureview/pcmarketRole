package com.example.vazifa_1.Repository;

import com.example.vazifa_1.Projection.Custom_Attachment;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource(path = "cateory" , collectionResourceRel = "List", excerptProjection = Custom_Attachment.class)
public interface Role_Repos {
}
