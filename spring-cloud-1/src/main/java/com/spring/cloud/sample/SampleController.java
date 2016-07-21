package com.spring.cloud.sample;

/**
 * Created by Tima on 7/20/16.
 */
import org.springframework.boot.*;
import org.springframework.boot.autoconfigure.*;
import org.springframework.stereotype.*;
import org.springframework.web.bind.annotation.*;

@Controller
@SpringBootApplication
public class SampleController  {

    @ResponseBody
    @RequestMapping(value = "/")
    String home() {
        return "Hello World!";
    }

}