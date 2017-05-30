package com.view.car.audi.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author yeguangkun on 2017/5/29 下午5:18
 * @version 1.0
 */
@RestController
@RequestMapping("audi")
@SuppressWarnings("unused")
class AudiController {

    @GetMapping("name")
    public String audi(){
        return "audi";
    }
}
