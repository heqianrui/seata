package controller;

import config.TestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class TestController {
    @Autowired
    private TestService testService;


    @RequestMapping("test1")
    public void test1() throws Exception {
        testService.test1();
    }
}
