package com.spring4.knightDemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class KinghtMain {

    public static void main(String[] args){
        ClassPathXmlApplicationContext context=new ClassPathXmlApplicationContext("classpath:knights.xml");
        Knight knight = context.getBean(Knight.class);
        knight.embarkOnQuest();
        context.close();
    }
}
