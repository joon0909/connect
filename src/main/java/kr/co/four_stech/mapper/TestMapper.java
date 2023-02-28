package kr.co.four_stech.mapper;

import kr.co.four_stech.model.req.TestObjReq;
import kr.co.four_stech.model.resp.TestObjResp;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.dao.DataAccessException;
@Mapper
public interface TestMapper {
    TestObjResp selectTestMapper(TestObjReq testObjReq) throws DataAccessException;
}
