package com.imooc.sell;

import lombok.extern.slf4j.Slf4j;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;


/**
 * @author 陈刚
 * @ClassName LoggerTest
 * @Description //TODO
 * @create 2019-07-19 22:35
 */
@RunWith(SpringRunner.class)
@SpringBootTest
@Slf4j
public class LoggerTest {

    @Test
    public void test1(){
        log.debug("debug...");
        log.info("info....");
        log.error("error....");
//        log.error("name:{},password:{}",12,324);
        log.warn("warn....");
    }
}
