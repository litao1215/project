package com.jr.biz;

import com.jr.entry.Emp;

import java.util.List;

public interface IEmpBiz {
    boolean register(Emp emp);

    List<Emp> queryAll();

    boolean removeemp(Emp emp);

    boolean modifyemp(Emp emp);

    Emp queryemp(Emp emp);
}
