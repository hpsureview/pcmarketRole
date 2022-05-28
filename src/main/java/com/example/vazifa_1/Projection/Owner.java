package com.example.vazifa_1.Projection;

import com.example.vazifa_1.entity.Attachment;
import org.springframework.data.rest.core.config.Projection;

@Projection(types = Attachment.class)
public interface Owner {
    Integer getId();
    String getName();
    Boolean getActive();

}
