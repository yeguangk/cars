package com.view.car.bmw.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author yeguangkun on 2017/5/29 下午9:36
 * @version 1.0
 */
@RestController
@RequestMapping("bmw")
@SuppressWarnings("unused")
class BmwController {

    @GetMapping("name")
    public String bmw(){
        return "bmw";
    }
}
