package com.github.harryssuperman.genpro;

import java.util.Arrays;
import java.util.stream.Collectors;

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
        if (isACorrectGenProCall(SpringApplication.run(GenproApplication.class, args), args)) {
            log.info("Ok.");
        } else {
            log.error("Not Ok. Wrong GenPro Call with: " + Arrays.stream(args).collect(Collectors.joining(" ")));
        }
    }

    private static boolean isACorrectGenProCall(ConfigurableApplicationContext applicationContext, String[] args) {
        log.info("Genpro App executing: " + Arrays.stream(args).collect(Collectors.joining(" ")));
        return (applicationContext.getBean(GenProController.class).isGenProCallCorrect(args)) == true;
    }
}

