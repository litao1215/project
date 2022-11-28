package com.jr.biz.impl;

import com.jr.biz.IEmpBiz;
import com.jr.entry.Emp;

import java.util.List;

public class EmpBizImpl implements IEmpBiz {
    @Override
    public boolean register(Emp emp) {
        return false;
    }

    @Override
    public List<Emp> queryAll() {
        return null;
    }

    @Override
    public boolean removeemp(Emp emp) {
        return false;
    }

    @Override
    public boolean modifyemp(Emp emp) {
        return false;
    }

    @Override
    public Emp queryemp(Emp emp) {
        return null;
    }
}
