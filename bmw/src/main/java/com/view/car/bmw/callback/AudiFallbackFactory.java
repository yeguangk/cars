package com.view.car.bmw.callback;

import com.view.car.bmw.client.AudiClient;
import feign.hystrix.FallbackFactory;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

/**
 * @author yeguangkun on 2017/5/30 上午11:46
 * @version 1.0
 */
@Component
public class AudiFallbackFactory implements FallbackFactory<AudiClient> {
    private static final Logger LOGGER = LoggerFactory.getLogger(AudiFallbackFactory.class);

    @Override
    public AudiClient create(Throwable cause) {
        LOGGER.error("发生异常。",cause);

        return  new AudiClient(){
            @Override
            public String audiName() {
                return "create audiName fallback";
            }
        };
    }
}
