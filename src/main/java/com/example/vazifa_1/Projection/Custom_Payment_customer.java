package com.example.vazifa_1.Projection;

import com.example.vazifa_1.entity.Attachment_content;
import org.springframework.data.rest.core.config.Projection;

@Projection(types = Attachment_content.class)
public interface Custom_Payment_customer {
    Integer getId();
    String getName();
    int getParent_catagory_id();
    boolean getActive();
}
