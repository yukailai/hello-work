package com.example.stock.yukailai.controller;

import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiResponse;
import io.swagger.annotations.ApiResponses;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping("stock")
public class StockController {

    @ApiOperation(value = "显示", notes = "显示")
    @RequestMapping(value = "/show/{id}")
    @ApiImplicitParam(name = "id", value = "菜单ID", required = true, dataType = "Long", paramType = "path")
    @ApiResponses(value = {
            @ApiResponse(response = String.class, code = 200, message = "返回基础数据说明")
    })
    public String show(@PathVariable(value = "id") Long id){
        return "你好"+id;
    }
}
