package com.example.webs.Configs;


import java.util.List;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.example.webs.Repositories.UserRepository;
import com.example.webs.User_Related.User;

@Configuration
public class UserConfig {
    @SuppressWarnings("null")
    @Bean
    CommandLineRunner commandlinerunner(UserRepository userrepository){
        return args ->{
            User Yond = new User("yond","456");
            User ubg = new User("ubg","365");
            userrepository.saveAll(List.of(Yond,ubg));
        };
    }
}
