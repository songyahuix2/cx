package jdbc.jdbc03.jdbctemplate.entity;


import java.util.Date;

public class Employee {
    private int empNo;
    private String empName;
    private String empJob;
    private int empMgr;
    private float empSalary;
    private float empComm;
    private Date empHiredate;
    private int deptno;

    public Employee(){}
    public Employee(int empNo, String empName, String empJob, int empMgr, float empSalary, float empComm, Date empHiredate, int deptno) {
        this.empNo = empNo;
        this.empName = empName;
        this.empJob = empJob;
        this.empMgr = empMgr;
        this.empSalary = empSalary;
        this.empComm = empComm;
        this.empHiredate = empHiredate;
        this.deptno = deptno;
    }

    public int getEmpNo() {
        return empNo;
    }

    public void setEmpNo(int empNo) {
        this.empNo = empNo;
    }

    public String getEmpName() {
        return empName;
    }

    public void setEmpName(String empName) {
        this.empName = empName;
    }

    public String getEmpJob() {
        return empJob;
    }

    public void setEmpJob(String empJob) {
        this.empJob = empJob;
    }

    public int getEmpMgr() {
        return empMgr;
    }

    public void setEmpMgr(int empMgr) {
        this.empMgr = empMgr;
    }

    public float getEmpSalary() {
        return empSalary;
    }

    public void setEmpSalary(float empSalary) {
        this.empSalary = empSalary;
    }

    public float getEmpComm() {
        return empComm;
    }

    public void setEmpComm(float empComm) {
        this.empComm = empComm;
    }

    public Date getEmpHiredate() {
        return empHiredate;
    }

    public void setEmpHiredate(Date empHiredate) {
        this.empHiredate = empHiredate;
    }

    public int getDeptno() {
        return deptno;
    }

    public void setDeptno(int deptno) {
        this.deptno = deptno;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "empNo=" + empNo +
                ", empName='" + empName + '\'' +
                ", empJob='" + empJob + '\'' +
                ", empMgr=" + empMgr +
                ", empSalary=" + empSalary +
                ", empComm=" + empComm +
                ", empHiredate=" + empHiredate +
                ", deptno=" + deptno +
                '}';
    }
}

