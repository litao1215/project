package com.jr.server;

import com.jr.biz.impl.EmpBizImpl;
import com.jr.entry.Emp;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.List;

@WebServlet("/emp")
public class TestServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        req.setCharacterEncoding("utf-8");
        resp.setCharacterEncoding("utf-8");
        resp.setContentType("text/html;charset=UTF-8");

        String str = req.getParameter("i");
        if (str.equals("1")) {
            insert(req, resp);
        } else if (str.equals("2")) {
            selectAll(req, resp);
        } else if (str.equals("3")) {
            deleteone(req, resp);
        } else if (str.equals("4")) {
            queryByEmpno(req, resp);
        } else if (str.equals("5")) {
            modifyAll(req, resp);
        }
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

    }

    public void insert(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        Emp emp = new Emp();
        emp.setEmpno(Integer.parseInt(req.getParameter("empno")));
        emp.setEname(req.getParameter("ename"));
        emp.setJob(req.getParameter("job"));
        emp.setMgr(Integer.parseInt(req.getParameter("mgr")));
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        try {
            emp.setHiredate(sdf.parse(req.getParameter("hiredate")));
        } catch (ParseException e) {
            e.printStackTrace();
        }
        emp.setSal(Double.parseDouble(req.getParameter("sal")));
        emp.setComm(Double.parseDouble(req.getParameter("comm")));
        emp.setDeptno(Integer.parseInt(req.getParameter("deptno")));
        boolean boo = new EmpBizImpl().register(emp);
        if (boo) {
            resp.sendRedirect("login.jsp");
        } else {
            resp.sendRedirect("index.jsp");
        }
    }

    public void selectAll(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        EmpBizImpl ebi = new EmpBizImpl();
        List<Emp> list = ebi.queryAll();
        HttpSession session = req.getSession();
        session.setAttribute("emplist", list);
        req.getRequestDispatcher("select.jsp").forward(req, resp);
    }

    public void deleteone(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        int empno = Integer.parseInt(req.getParameter("empno"));
        EmpBizImpl ebi = new EmpBizImpl();
        Emp emp = new Emp();
        emp.setEmpno(empno);
        boolean b = ebi.removeemp(emp);
        if (b) {
            selectAll(req, resp);
        } else {
            resp.getWriter().println("删除失败！！！");
            resp.getWriter().println("<a href='select.jsp'>返回展示</a>");
        }
    }

    public void queryByEmpno(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        int empno = Integer.parseInt(req.getParameter("empno"));

        Emp e = new Emp();
        e.setEmpno(empno);
        try {
            SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
            e.setHiredate(sdf.parse(req.getParameter("hiredate")));
        } catch (ParseException ex) {
            ex.printStackTrace();
        }
        e.setSal(Double.parseDouble(req.getParameter("sal")));
        e.setComm(Double.parseDouble(req.getParameter("comm")));
        e.setDeptno(Integer.parseInt(req.getParameter("deptno")));
        e.setJob(req.getParameter("job"));
        EmpBizImpl ebi = new EmpBizImpl();
        Emp queryemp = ebi.queryemp(e);
        HttpSession session = req.getSession();
        session.setAttribute("emp", queryemp);
        req.getRequestDispatcher("modify.jsp").forward(req, resp);
    }

    public void modifyAll(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        int empno = Integer.parseInt(req.getParameter("empno"));
        Emp e = new Emp();
        e.setEmpno(empno);
        try {
            SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
            e.setHiredate(sdf.parse(req.getParameter("hiredate")));
        } catch (ParseException ex) {
            ex.printStackTrace();
        }
        e.setSal(Double.parseDouble(req.getParameter("sal")));
        e.setComm(Double.parseDouble(req.getParameter("comm")));
        e.setDeptno(Integer.parseInt(req.getParameter("deptno")));
        e.setJob(req.getParameter("job"));
        EmpBizImpl ebi = new EmpBizImpl();
        boolean b = ebi.modifyemp(e);
        if (b) {
            selectAll(req, resp);
        }
    }

    @Override
    protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        super.service(req, resp);
    }
}
