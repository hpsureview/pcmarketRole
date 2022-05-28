package com.example.vazifa_1.Projection;

import com.example.vazifa_1.entity.Owner;
import org.springframework.data.rest.core.config.Projection;

@Projection(types = Owner.class)
public interface Custom_Attachment_content {
    Integer getId();
    String getName();
    String getPhone_number();
}
