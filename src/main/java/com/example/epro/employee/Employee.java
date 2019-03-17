package com.example.epro.employee;

import org.hibernate.annotations.Cascade;

import javax.persistence.*;

@Entity
@Table(name="EMPLOYEE")
public class Employee
{
    @Id
    @GeneratedValue
    @Column(name="EMP_ID")
    private int empId;

    @Column(name="NAME")
    private String empName;

    @OneToOne(mappedBy="employee",cascade = {CascadeType.PERSIST, CascadeType.MERGE})
    private Employee_Address employeeAddress;

    public Employee()
    {
        super();
    }

    public Employee(int empId, String empName, Employee_Address employeeAddress)
    {
        super();
        this.empId = empId;
        this.empName = empName;
        this.employeeAddress = employeeAddress;
    }

    public int getEmpId()
    {
        return empId;
    }

    public void setEmpId(int empId)
    {
        this.empId = empId;
    }

    public String getEmpName()
    {
        return empName;
    }

    public void setEmpName(String empName)
    {
        this.empName = empName;
    }

    public Employee_Address getEmployeeAddress()
    {
        return employeeAddress;
    }

    public void setEmployeeAddress(Employee_Address employeeAddress)
    {
        this.employeeAddress = employeeAddress;
    }

    @Override
    public String toString()
    {
        return "Employee [empId=" + empId + ", empName=" + empName + ", employeeAddress=" + employeeAddress + "]";
    }
}
