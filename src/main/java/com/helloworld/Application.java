package com.helloworld;

import org.restheart.Bootstrapper;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.context.web.SpringBootServletInitializer;

@SpringBootApplication
public class Application extends SpringBootServletInitializer {
    @Override
    protected SpringApplicationBuilder configure(SpringApplicationBuilder application) {
        return application.sources(Application.class);
    }

    public static void main(String[] args) throws Exception {
    	String[] str=new String[1];
    	str[0]="restheart.yml";
    
    	Bootstrapper.main(str);
        SpringApplication.run(Application.class, args);
    }
}

