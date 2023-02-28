package kr.co.four_stech.service.Test.impl;

import kr.co.four_stech.model.req.TestObjReq;
import kr.co.four_stech.model.resp.TestObjResp;
import kr.co.four_stech.service.Test.TestService;
import kr.co.four_stech.mapper.TestMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TestServiceImpl implements TestService {
    private TestMapper testMapper;
    @Autowired
    public TestServiceImpl(TestMapper testMapper){
        this.testMapper = testMapper;
    }
    @Override
    public TestObjResp selectTest(TestObjReq testObjReq) throws Exception{
        TestObjResp testObjResp = new TestObjResp();
        testObjResp = testMapper.selectTestMapper(testObjReq);
        return testObjResp;
    }
}
