package com.cnpc.epai.productionmanager.controller;

import com.cnpc.epai.productionmanager.StartApplication;
import com.cnpc.epai.productionmanager.service.CarService;
import com.netflix.discovery.converters.Auto;
import io.swagger.annotations.ApiOperation;
import lombok.extern.slf4j.Slf4j;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.context.embedded.LocalServerPort;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.context.SpringBootTest.WebEnvironment;
import org.springframework.boot.test.web.client.TestRestTemplate;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;
import java.util.Map;

@Slf4j
@Transactional
@RunWith(SpringRunner.class)
@SpringBootTest(classes = StartApplication.class, webEnvironment = WebEnvironment.RANDOM_PORT)
public class CarControllerTest {

    @LocalServerPort
    private int port;
    @Autowired
    private TestRestTemplate restTemplate;

    @Test
    public void testSelectCarList() {
        String result = restTemplate.getForObject(this.buildUrl("/swagger-ui.html"), String.class);
        Assert.assertNotNull(result);
        log.info("{}", result);
    }

    private String buildUrl(String path) {
        return String.format("http://localhost:%s", this.port);
    }
}
