package com.cnpc.epai.productionmanager.configuration;

import com.cnpc.epai.common.configuration.EpaiConfig;
import com.cnpc.epai.productionmanager.controller.CarController;
import com.google.common.collect.Lists;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.condition.ConditionalOnWebApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.context.request.async.DeferredResult;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiKey;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger.web.ApiKeyVehicle;
import springfox.documentation.swagger.web.SecurityConfiguration;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

@ConditionalOnWebApplication
@EnableSwagger2
@Slf4j
@Configuration
public class SwaggerConfig {

    @Autowired
    private EpaiConfig epaiConfig;

    @Bean
    public Docket customDocket() {
        return new Docket(DocumentationType.SWAGGER_2)
                .groupName(epaiConfig.getService_prefix())
                .genericModelSubstitutes(DeferredResult.class)
                .useDefaultResponseMessages(false)
                .forCodeGeneration(true).pathMapping("/")
                .select()
                .apis(RequestHandlerSelectors.basePackage(CarController.class.getPackage().getName()))
                .build()
                .securitySchemes(Lists.newArrayList(customApiKey()));
    }

    @Bean
    public SecurityConfiguration customSecurityConfiguration() {
        return new SecurityConfiguration(null, null, null, null, "",
                ApiKeyVehicle.HEADER,"Authorization","");
    }

    private ApiKey customApiKey() {
        return new ApiKey("Authorization", "Authorization", "header");
    }
}
