package com.jts.springboot2mybatis;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * @author jia ting shuai
 * @date 2019/4/19 18:14
 */
@Controller
public class HelloController {
    @GetMapping("hello")
    @ResponseBody
    public String hello(){
        return "spring-boot-2-mybatis";
    }
}
