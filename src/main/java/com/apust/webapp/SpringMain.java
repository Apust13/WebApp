package com.apust.webapp;

import com.apust.webapp.repository.mock.MockUserRepository;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.Arrays;

/**
 * Created by GUN
 * on 13.07.2016.
 */
public class SpringMain {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext appCtx = new ClassPathXmlApplicationContext("spring/spring-app.xml");
        System.out.println(Arrays.toString(appCtx.getBeanDefinitionNames()));
        MockUserRepository mockUserRepository =(MockUserRepository) appCtx.getBean("mockUserRepository");
        mockUserRepository = appCtx.getBean(MockUserRepository.class);
        appCtx.close();
    }
}
