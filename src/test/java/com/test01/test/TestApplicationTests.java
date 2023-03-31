package com.test01.test;

import com.test01.test.demos.web.User;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import javax.jws.soap.SOAPBinding;

@SpringBootTest
class TestApplicationTests {

    @Test
    void contextLoads() {
    }
    @Autowired
    private User user;
@Test
    public void test01(){
    System.out.println(user.b);
    }
    }
