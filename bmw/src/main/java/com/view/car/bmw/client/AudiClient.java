package com.view.car.bmw.client;

import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * @author yeguangkun on 2017/5/30 上午11:42
 * @version 1.0
 */
@FeignClient(name = "audi")
public interface AudiClient {

    @RequestMapping(value = "audi/name", method = RequestMethod.GET)
    String audiName();
}
