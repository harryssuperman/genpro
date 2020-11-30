package com.github.harryssuperman.genpro;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import com.github.harryssuperman.genpro.controller.GenProController;

@SpringBootApplication
public class GenproApplication {

    private static final Logger log = LogManager.getLogger(GenproApplication.class);

    public static void main(String[] args) {
        if (isGenProCall(SpringApplication.run(GenproApplication.class, args), args)) {
            log.info("Ok.");
        } else {
            log.error("Not Ok. Wrong GenPro Call with: {}", String.join(" ", args));
        }
    }

    private static boolean isGenProCall(ConfigurableApplicationContext applicationContext, String[] args) {
        log.info("Genpro App executing: {}", String.join(" ", args));
        return (applicationContext.getBean(GenProController.class).isGenProCallExecuted(args));
    }
}

