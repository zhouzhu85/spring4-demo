package com.spring4.knightDemo.config;

import com.spring4.knightDemo.BraveKnight;
import com.spring4.knightDemo.Knight;
import com.spring4.knightDemo.Quest;
import com.spring4.knightDemo.SlayDragonQuest;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class KinghtConfig {
    @Bean
    public Knight knight(){
        return new BraveKnight(quest());
    }

    @Bean
    public Quest quest(){
        return new SlayDragonQuest(System.out);
    }

}
