package com.cnpc.epai.productionmanager.service.impl;

import com.cnpc.epai.productionmanager.mapper.CarMapper;
import com.cnpc.epai.productionmanager.service.CarService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.util.List;
import java.util.Map;

@Slf4j
@Service
public class CarServiceImpl implements CarService {

    @Autowired
    private CarMapper carMapper;
    @Autowired
    private RestTemplate restTemplate;

    @Override
    public List<Map> selectCarList() {
//        System.out.println(JSON.toJSONString(SpringManager.getCurrentUser(), true));
//        restTemplate.postForObject(
//                "http://1001configuration/sys/configuration/system/aa/test?value=这是一个测试", "", String.class);
//        System.out.println(restTemplate.getForObject("http://1001configuration/sys/configuration/system/aa/test", String.class));
//        return this.carMapper.selectCarList("production", "CNHD_FILES_CLASS");
        return this.carMapper.selectCarList("table1", "abc");
    }
}
