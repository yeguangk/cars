package com.view.car.bmw.command;

import com.view.car.bmw.client.AudiClient;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

/**
 * @author yeguangkun on 2017/5/30 下午12:49
 * @version 1.0
 */
@Component
public class BmwCommandLineRunner implements CommandLineRunner {

    private static final Logger LOGGER = LoggerFactory.getLogger(BmwCommandLineRunner.class);

    @Autowired
    private AudiClient audiClient;

    @Value("${bmw.version}")
    private String version;

    @Override
    public void run(String... args) throws Exception {
       String name = audiClient.audiName();
       LOGGER.info("name:{}", name);
        LOGGER.info("version:{}", version);
    }
}
