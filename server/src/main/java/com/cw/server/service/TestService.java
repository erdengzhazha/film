package com.cw.server.service;

import com.cw.server.domain.Test;
import com.cw.server.mapper.TestMapper;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class TestService {

    @Resource
    private TestMapper testMapper;

    public Test list(){
        return testMapper.selectByPrimaryKey(1);
    }
}
