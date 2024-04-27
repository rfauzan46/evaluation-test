package com.fauzan.evaluation;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Configuration
@EnableWebMvc
public class CorsConfig implements WebMvcConfigurer {

    @Override
    public void addCorsMappings(CorsRegistry registry) {
        registry.addMapping("/**")
                .allowedOrigins("http://localhost:5173") // Replace with the origin of your frontend application
                .allowedMethods("GET", "POST", "PUT", "DELETE") // Add allowed HTTP methods
                .allowedHeaders("*") // Add allowed headers
                .allowCredentials(true); // Allow credentials (if needed)
    }
}
