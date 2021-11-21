package com.uc;
import com.uc.controller.Controller;
import com.uc.modelo.CancionRepository;
import com.uc.vista.Vista;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jdbc.repository.config.EnableJdbcRepositories;

@SpringBootApplication
@ComponentScan("com.uc.modelo")
@EnableJdbcRepositories("com.uc.modelo")
public class AppApplication {
@Autowired
    CancionRepository repositorio;
    
	public static void main(String[] args) {
            SpringApplicationBuilder builder = new SpringApplicationBuilder(AppApplication.class);
            builder.headless(false);
            ConfigurableApplicationContext context = builder.run(args);
	}
        
        @Bean
        ApplicationRunner  applicationRunner (){
            return args ->{
                Vista vista = new Vista();
                Controller controlador = new Controller(repositorio, vista);
            };
        }
}
