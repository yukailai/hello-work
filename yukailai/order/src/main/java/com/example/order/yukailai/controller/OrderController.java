package com.example.order.yukailai.controller;

import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiResponse;
import io.swagger.annotations.ApiResponses;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
@RequestMapping("order")
public class OrderController {


    RestTemplate restTemplate;

    @ApiOperation(value = "显示", notes = "显示")
    @RequestMapping(value = "/show/{id}")
    @ApiImplicitParam(name = "id", value = "菜单ID", required = true, dataType = "Long", paramType = "path")
    @ApiResponses(value = {
            @ApiResponse(response = String.class, code = 200, message = "返回基础数据说明")
    })
    public String show(@PathVariable(value = "id") Long id){
        String a= restTemplate.getForObject("http://localhost:8081/stock/show/"+id,String.class);
        return "你好"+a;
    }
}
