package com.gr00shik.springcloud;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/")
@Api(value = "myController", description = "myControllerDescription", tags = {"cloud"})
public class MyFirstController {

    @RequestMapping(value = "get1", method = RequestMethod.GET)
    @ApiOperation(value = "GetStringValue", notes = "Notes of cloud", nickname = "CloudNickname")
    public User getUser(){
        return new User("Sergey", "Makarov");
    }

}
