package com.example.vazifa_1.Projection;

import com.example.vazifa_1.entity.Product;
import org.springframework.data.rest.core.config.Projection;

@Projection(types = Product.class)
public interface Custop_Product_property {
    Integer getId();
    int getByte1();
    int getAttachment_id();

}
