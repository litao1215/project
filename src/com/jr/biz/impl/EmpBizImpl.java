package com.jr.biz.impl;

import com.jr.biz.IEmpBiz;
import com.jr.dao.impl.EmpDaoImpl;
import com.jr.entry.Emp;

import java.util.List;

public class EmpBizImpl implements IEmpBiz {
    EmpDaoImpl ed = new EmpDaoImpl();
    @Override
    public boolean register(Emp emp) {
        return ed.insertemp(emp)==0?false:true;
    }

    @Override
    public List<Emp> queryAll() {
        return ed.selectAll();
    }

    @Override
    public boolean removeemp(Emp emp) {
        return ed.deleteemp(emp)==0?false:true;
    }

    @Override
    public boolean modifyemp(Emp emp) {
        return ed.updateemp(emp)==1?true:false;
    }

    @Override
    public Emp queryemp(Emp emp) {
        return ed.selectemp(emp);
    }
}
