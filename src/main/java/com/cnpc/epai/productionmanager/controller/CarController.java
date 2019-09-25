package com.cnpc.epai.productionmanager.controller;

import com.cnpc.epai.common.util.ApiResult;
import com.cnpc.epai.productionmanager.service.CarService;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/demo/test")
public class CarController {

    @Autowired
    private CarService carService;

    /**
     * 主要用于后台服务间调用
     */
    @RequestMapping(value = "/testList", method = RequestMethod.GET)
    @ResponseBody
    @ApiOperation(value = "查询所有汽车", notes = "这是一个测试服务")
    public List<Map> selectCarList() {
        return this.carService.selectCarList();
    }

    /**
     * 返回有状态的结果集，主要用于前端，用于执行结果的判断
     * 这种返回结果的方式不推荐，可以通过添加网关拦截器，在网关那一层包裹消息
     */
    @RequestMapping(value = "/testList2", method = RequestMethod.GET)
    @ResponseBody
    @ApiOperation(value = "查询所有汽车", notes = "这是一个测试服务")
    public ApiResult selectCarListForBrower() {
        return ApiResult.ofSuccessResult(this.carService.selectCarList());
    }
}
