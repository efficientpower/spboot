package org.wjh.spboot.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SpbootController {
    Logger logger = LoggerFactory.getLogger(SpbootController.class);

    @RequestMapping("/spboot/get.do")
    public String get(@RequestHeader("user-agent") String userAgent,
                      @RequestHeader("cookie") String cookie){
        logger.info("cookie={};  userAgent={}", cookie, userAgent);
        return userAgent +"\n  cookie: " + cookie;
    }
}
