package com.patrol.common.config;

import net.sf.ehcache.CacheManager;
import org.springframework.cache.annotation.EnableCaching;
import org.springframework.cache.ehcache.EhCacheCacheManager;
import org.springframework.cache.ehcache.EhCacheManagerFactoryBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/***
 * 缓存配置
 *
 * @author WangSheng/2019-10-14
 *
 */
@Configuration
@EnableCaching
public class CacheConfig {

    @Bean
    public EhCacheCacheManager cacheManager(CacheManager cacheManager) {
        return new EhCacheCacheManager(cacheManager);
    }

    @Bean
    public EhCacheManagerFactoryBean ehcache() {
        return new EhCacheManagerFactoryBean();
    }

}
