package com.example.vazifa_1.Projection;

import com.example.vazifa_1.entity.Category;
import org.springframework.data.rest.core.config.Projection;

@Projection(types = Category.class)
public interface Custop_Role {
     Integer getId();

     String getName();

     Integer getSize();

     String getContent_type();
}
