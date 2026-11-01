package com.parking;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * Приложение служит единой точкой входа с фронтенда.
 * Также служит для проверки токенов и запрещает неавторизированные входы на те эндпоинты где нужна роль
 */
@SpringBootApplication
@EnableDiscoveryClient
public class ApiGateway {
    public static void main(String[] args) {
        SpringApplication.run(ApiGateway.class, args);
    }
}
