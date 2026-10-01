package org.atd.springbootazuredemo;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SpringAzureDemoController {

    @RequestMapping("/msg")
    public String message(){
        return "<H1>Your Image Deployed to Azure Successfully<H1>";
    }
}
