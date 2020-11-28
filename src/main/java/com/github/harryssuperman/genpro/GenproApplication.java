package com.github.harryssuperman.genpro;

import java.util.Arrays;
import java.util.stream.Collectors;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class GenproApplication {

    private static final Logger log = LogManager.getLogger(GenproApplication.class);

    /*@Autowired
    private GenProController genProController;*/

    public static void main(String[] args) {
        SpringApplication.run(GenproApplication.class, args);
        log.info("Genpro App started: " + Arrays.stream(args).map(String::toString).collect(Collectors.joining(" ")));
    }

}

