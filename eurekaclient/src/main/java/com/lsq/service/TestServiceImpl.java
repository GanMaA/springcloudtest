package com.lsq.service;

import com.lsq.entity.Test;
import org.springframework.stereotype.Repository;

@Repository
public class TestServiceImpl implements TestService{
    @Override
    public int getId() {
        Test test=new Test();
        return test.getId();
    }
}
