package com.parking;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;

/**
 * Данный сервис служит для содержания всех настроек(application) других микросервисов
 * В других микросервисах нужно главное указать имя по параметру spring.application.name
 * Главное чтобы имя совпадало с названием файла(application) в config-repo
 * То есть сервис называется booking, то в config-repo файл с настройками должен называться booking.yml
 */
@EnableConfigServer
@SpringBootApplication
public class ConfigServer {
    public static void main(String[] args) {
        SpringApplication.run(ConfigServer.class, args);
    }
}
