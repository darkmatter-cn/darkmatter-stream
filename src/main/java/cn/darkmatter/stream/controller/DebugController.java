package cn.darkmatter.stream.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/debug")
public class DebugController {

    @RequestMapping("/java_version")
    public String javaVersion() {
        return System.getProperty("java.version");
    }

}
