package com.dawn.sentinel.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.Random;
import java.util.concurrent.TimeUnit;

/**
 * Created by Dawn on 2020-01-04.
 */
@RestController
public class SentinelController {
    private static final Logger logger= LoggerFactory.getLogger(SentinelController.class);
    @GetMapping("/hi")
    public String apiHi(){
        doBusiness();
        logger.info("Hi Dawn");
        return "Hi Dawn";
    }

    @GetMapping("err")
    public String apiErr(){
        doBusiness();
        return "Oop..";
    }

    @GetMapping("/foo/{id}")
    public String apiFoo(@PathVariable("id") Long id){
        doBusiness();
        return "Hi" + id;
    }

    @GetMapping("/exclue/{id}")
    public String apiExecute(@PathVariable("id") Long id){
       doBusiness();
       return "Execute" + id;
    }
    private void doBusiness() {
        Random random = new Random(1);
        try {
            TimeUnit.MILLISECONDS.sleep(random.nextInt(100));
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
