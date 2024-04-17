package com.shadabshamsi.edgeservice.config;

import org.springframework.cloud.gateway.filter.factory.RequestRateLimiterGatewayFilterFactory;
import org.springframework.cloud.gateway.filter.ratelimit.KeyResolver;
import org.springframework.cloud.gateway.route.builder.GatewayFilterSpec;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import reactor.core.publisher.Mono;

@Configuration
public class RateLimiterConfig {

    @Bean
    public KeyResolver keyResolver() {
//        return exchange -> exchange.getRequest().getRemoteAddress().getAddress().getHostAddress();
        return exchange -> Mono.just("anonymous");
    }

}
