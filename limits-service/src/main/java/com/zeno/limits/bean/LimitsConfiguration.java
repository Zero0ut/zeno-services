package com.zeno.limits.bean;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Configuration
@Component
@ConfigurationProperties("limits-service")
public class LimitsConfiguration {

    //@Value("${limits-service.maximum}")
    private int maximum;

    //@Value("${limits-service.minimum}")
    private int minimum;


}
