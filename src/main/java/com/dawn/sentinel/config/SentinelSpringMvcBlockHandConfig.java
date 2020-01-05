package com.dawn.sentinel.config;

import com.alibaba.csp.sentinel.slots.block.BlockException;
import com.dawn.sentinel.vo.ResultWrapper;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.core.annotation.Order;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * Created by Dawn on 2020-01-04.
 */
@ControllerAdvice
@Order(0)
public class SentinelSpringMvcBlockHandConfig {
    private static final Logger logger = LoggerFactory.getLogger(SentinelSpringMvcBlockHandConfig.class);


    @ExceptionHandler(BlockException.class)
    @ResponseBody
    public ResultWrapper sentinelBlockHandler(BlockException e){
        logger.warn("Blocked by Sentinel:{}",e.getRule());
        return ResultWrapper.blocked();
    }
}
