package com.example.demo.config;

import org.springframework.context.annotation.Bean;
import org.springframework.session.data.redis.config.annotation.web.http.EnableRedisHttpSession;
import org.springframework.web.client.RestTemplate;

/**
 * @author lk
 */
@EnableRedisHttpSession
public class HttpSessionConfig {
    @Bean
    public RestTemplate restTemplate(){
        return new RestTemplate();
    }
}
