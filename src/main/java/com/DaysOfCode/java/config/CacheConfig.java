package com.DaysOfCode.java.config;

import org.springframework.cache.CacheManager;
import org.springframework.cache.annotation.CachingConfigurer;
import org.springframework.cache.annotation.EnableCaching;
import org.springframework.cache.concurrent.ConcurrentMapCacheManager;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@EnableCaching
@Configuration
public class CacheConfig implements CachingConfigurer {
    @Bean
    public CacheManager cacheManager() {
        return new ConcurrentMapCacheManager("movies", "title");
    }
}
