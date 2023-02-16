package com.example.demo;

import com.example.importnexusserver.domain.RoleNexus;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import com.example.importlocalrepo.domain.*;

@SpringBootApplication
public class DemoApplication {

    public static void main(String[] args) {
        User user = new User();
        user.setName("test");


        RoleNexus rn = new RoleNexus();
        SpringApplication.run(DemoApplication.class, args);
    }

}
