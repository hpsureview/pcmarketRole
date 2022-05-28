package com.example.vazifa_1.Projection;

import com.example.vazifa_1.entity.Role;
import org.springframework.data.rest.core.config.Projection;

@Projection(types = Role.class)
public interface Custom_Product {
    Integer getId();
    String getName();
    boolean getActive();
}
