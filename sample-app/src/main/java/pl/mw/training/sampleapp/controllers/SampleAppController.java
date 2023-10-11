package pl.mw.training.sampleapp.controllers;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("test")
public class SampleAppController {



    @GetMapping("/hello")
    public String helloWorld(){
        return "Hello world";
    }
}
