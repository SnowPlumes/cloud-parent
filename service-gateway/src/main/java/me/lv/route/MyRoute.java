package me.lv.route;

import me.lv.filter.RequestTimeFilter;
import org.springframework.cloud.gateway.route.RouteLocator;
import org.springframework.cloud.gateway.route.builder.RouteLocatorBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;

/**
 * @author lv
 */
@Component
public class MyRoute {
    @Bean
    public RouteLocator myRoutes(RouteLocatorBuilder builder) {
        return builder.routes()
                .route(p -> p
                        .path("/get")
                        .filters(f -> f.filter(new RequestTimeFilter())
                                .addRequestHeader("hello", "world"))
                        .uri("http://httpbin.org:80/get"))
                .build();
    }
}
