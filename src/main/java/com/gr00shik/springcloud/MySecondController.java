package com.gr00shik.springcloud;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/")
@Api(value = "myController2", description = "myControllerDescription2", tags = {"cloud", "cloud2"})
public class MySecondController {

    @RequestMapping(value = "get2", method = RequestMethod.GET)
    @ApiOperation(value = "GetStringValue2", notes = "Notes of cloud2", nickname = "CloudNickname2")
    public Car getCar() {
        return new Car("X6", "Audi");
    }

}