package com.cnpc.epai.productionmanager;

import com.cnpc.epai.common.util.JsonUtil;
import com.cnpc.epai.productionmanager.mapper.CarMapper;
import com.fasterxml.jackson.core.type.TypeReference;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.context.annotation.ComponentScan;

import java.util.Map;

@MapperScan(basePackageClasses = CarMapper.class)
@ComponentScan("com.cnpc.epai")
@EnableDiscoveryClient
@SpringBootApplication
public class StartApplication {

	public static void main(String[] args) {
		SpringApplication.run(StartApplication.class, args);
	}
}




















