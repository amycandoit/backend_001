package com.naver.user.service;

import jdk.jfr.BooleanFlag;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

@Service
public class UserService {
 public UserService(){
 System.out.println("-----------------------------------user service---------------------------------");
 }
    int count = 0; //
    public int test() {
        count++;
        return count;
    }

    @Bean //주로 설정을 등록할 때 사용
    public int getCount() {
        System.out.println("-----------------------------------get service---------------------------------");
        return 1000;
    }

}
