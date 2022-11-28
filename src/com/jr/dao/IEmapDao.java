package com.jr.dao;

import com.jr.entry.Emp;

import java.util.List;

public interface IEmapDao {
    int insertemp(Emp emp);

    List<Emp> selectAll();

    int deleteemp(Emp emp);

    int updateemp(Emp emp);

    Emp selectemp(Emp emp);
}
