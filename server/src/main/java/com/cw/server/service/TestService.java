package com.cw.server.service;

import com.cw.server.domain.Test;
import com.cw.server.domain.TestExample;
import com.cw.server.mapper.TestMapper;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class TestService {

    @Resource
    private TestMapper testMapper;

    public List<Test> list(){
        TestExample testExample = new TestExample();
        testExample.createCriteria().andIdEqualTo(1);
        testExample.setOrderByClause("id desc"); //从小到大
        return testMapper.selectByExample(testExample);
    }
}
