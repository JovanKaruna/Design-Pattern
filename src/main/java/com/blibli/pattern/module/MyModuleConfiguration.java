package com.blibli.pattern.module;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@Configuration
@ComponentScan
public class MyModuleConfiguration {

    @RestController
    public static class MyModuleController {

        @GetMapping("/my-module")
        public String index() {
            return "MY MODULE CONTROLLER";
        }

    }

}
