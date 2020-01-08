package com.mini.service.impl;

import com.mini.dao.TestMapper;
import com.mini.service.TestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * <class说明>： Created by WiuLuS on 2020/01/02.
 *
 * @author WiuLuS
 * @version 1.0.0
 * @date 2020/1/2 16:46
 */
@Service
public class TestServiceImpl implements TestService {

    @Autowired
    private TestMapper dao ;

    @Override
    public List<String> selectIds() {
        return dao.selectIds() ;
    }
}
