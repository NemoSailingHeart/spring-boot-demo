package com.example.springbootdemo.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.BeansException;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * 优雅的停掉 SpringBoot 应用
 */
@RestController
public class ShutdownController implements ApplicationContextAware {

    private ApplicationContext context;
    private Logger logger = LoggerFactory.getLogger(ShutdownController.class);
    /**
     * curl -X POST localhost:port/shutdownContext 可以退出，mac win都适用
     * 当前项目配置端口为8090 关闭的密码为 acdc ，所以关闭的url为
     * curl -X POST localhost:8090/shutdownContext?password=acdc
     * @param passWord 关闭需要的密码
     */
    @PostMapping("/shutdownContext")
    public void shutdownContext(@RequestParam("password") String passWord) {
        if (passWord.trim().equals("acdc")){
            logger.info("get post shutdownContext, shutdown now");
            ((ConfigurableApplicationContext) context).close();
        } else {
            logger.error("shutdownContext password is incorrect");
        }
    }

    @Override
    public void setApplicationContext(ApplicationContext ctx) throws BeansException {
        this.context = ctx;
    }
}
