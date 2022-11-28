package com.jr.dao.impl;

import com.jr.dao.IEmapDao;
import com.jr.entry.Emp;
import com.jr.util.DBHelper;

import java.io.IOException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.SimpleDateFormat;
import java.util.List;

public class EmpDaoImpl implements IEmapDao {
    ResultSet rs;
    PreparedStatement ps;
    Connection con;

    @Override
    public int insertemp(Emp emp) {
        int i = 0;
        try {
            con = DBHelper.getconn();
            String sql ="insert into emp values(?,?,?,?,?,?,?,?)";
            ps = con.prepareStatement(sql);
            ps.setInt(1,emp.getEmpno());
            ps.setString(2,emp.getEname());
            ps.setString(3,emp.getJob());
            ps.setInt(4,emp.getMgr());
            SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
            ps.setString(5,sdf.format(emp.getHiredate()));
            ps.setDouble(6,emp.getSal());
            ps.setDouble(7,emp.getComm());
            ps.setInt(8,emp.getDeptno());
            i =ps.executeUpdate();
        } catch (IOException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            DBHelper.closeAll(rs,ps,con);
        }
        return i;
    }

    @Override
    public List<Emp> selectAll() {
        return null;
    }

    @Override
    public int deleteemp(Emp emp) {
        return 0;
    }

    @Override
    public int updateemp(Emp emp) {
        return 0;
    }

    @Override
    public Emp selectemp(Emp emp) {
        return null;
    }
}
