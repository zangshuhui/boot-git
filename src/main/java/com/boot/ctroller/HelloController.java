package com.boot.ctroller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author zangshuhui
 * @create 2019/12/5 - 14:54
 * @Version 1.0
 */
@RestController
public class HelloController {

    @RequestMapping("info")
    public String info(){
        return "Hello SpringBoot";

    }

    @RequestMapping("info2")
    public String info2(){
        return "Hello SpringBoot info2";

    }

    @RequestMapping("info3")
    public String info3(){
        return "Hello SpringBoot info3";

    }
}
