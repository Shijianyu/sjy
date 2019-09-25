package com.cnpc.epai.productionmanager.service;

import com.cnpc.epai.productionmanager.StartApplication;
import lombok.extern.slf4j.Slf4j;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.boot.test.context.SpringBootTest.WebEnvironment;

import java.util.List;
import java.util.Map;

@Slf4j
@RunWith(SpringRunner.class)
@Transactional
@SpringBootTest(classes = StartApplication.class, webEnvironment = WebEnvironment.NONE)
public class CarServiceTest {

    @Autowired
    private CarService carService;

    @Test
    public void testSelectCarList() {
        List<Map> list = this.carService.selectCarList();
        log.info("查询结果 ==》 {}", list);
    }
}