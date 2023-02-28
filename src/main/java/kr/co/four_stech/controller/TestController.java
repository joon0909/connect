package kr.co.four_stech.controller;

import kr.co.four_stech.model.req.TestObjReq;
import kr.co.four_stech.model.resp.TestObjResp;
import kr.co.four_stech.service.Test.TestService;
import kr.co.four_stech.service.Test.impl.TestServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {
    @Autowired
    public TestController(TestService testService){this.testService = testService;}
    private TestService testService;
    @GetMapping("/api/test")
    public String test(){
        return "다른 컨트롤러 작동여부 확인";
    }
    @GetMapping("/api/mybatis")
    public TestObjResp mybatis(@ModelAttribute TestObjReq testObjReq) throws Exception {

        return testService.selectTest(testObjReq);
    }
}
