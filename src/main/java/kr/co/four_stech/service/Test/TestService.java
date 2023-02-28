package kr.co.four_stech.service.Test;

import kr.co.four_stech.model.req.TestObjReq;
import kr.co.four_stech.model.resp.TestObjResp;

public interface TestService {
//    test
    TestObjResp selectTest(TestObjReq testObjReq) throws Exception;
}
