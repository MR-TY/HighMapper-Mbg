package com.ty.shop.entities;

import javax.persistence.*;

@Table(name = "table_emp")
public class Employee {
    @Id
    @Column(name = "emp_id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer empId;

    @Column(name = "emp_ename")
    private String empEname;

    @Column(name = "emp_salary")
    private Double empSalary;

    @Column(name = "emp_age")
    private Integer empAge;

    
    public Employee() {
		super();
	}

	public Employee(Integer empId, String empEname, Double empSalary, Integer empAge) {
		super();
		this.empId = empId;
		this.empEname = empEname;
		this.empSalary = empSalary;
		this.empAge = empAge;
	}

	/**
     * @return emp_id
     */
    public Integer getEmpId() {
        return empId;
    }

    /**
     * @param empId
     */
    public void setEmpId(Integer empId) {
        this.empId = empId;
    }

    /**
     * @return emp_ename
     */
    public String getEmpEname() {
        return empEname;
    }

    /**
     * @param empEname
     */
    public void setEmpEname(String empEname) {
        this.empEname = empEname;
    }

    /**
     * @return emp_salary
     */
    public Double getEmpSalary() {
        return empSalary;
    }

    /**
     * @param empSalary
     */
    public void setEmpSalary(Double empSalary) {
        this.empSalary = empSalary;
    }

    /**
     * @return emp_age
     */
    public Integer getEmpAge() {
        return empAge;
    }

    /**
     * @param empAge
     */
    public void setEmpAge(Integer empAge) {
        this.empAge = empAge;
    }

	@Override
	public String toString() {
		return "Employee [empId=" + empId + ", empEname=" + empEname + ", empSalary=" + empSalary + ", empAge=" + empAge
				+ "]";
	}
}