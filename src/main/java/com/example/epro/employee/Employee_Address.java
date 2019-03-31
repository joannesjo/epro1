package com.example.epro.employee;

import com.example.epro.employee.Employee;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name="EMPLOYEE_ADDRESS")
public class Employee_Address
{
    @Id
    @Column(name = "ADDR_ID")
    @GeneratedValue
    private int addrId;

    @Column(name="STREET")
    private String street;

    @OneToOne(cascade= CascadeType.ALL)
    @JoinColumn(name = "EMP_ID")
    private Employee employee;

    public Employee_Address()
    {
        super();
    }

    public Employee_Address(int addrId, String street,Employee employee)
    {
        super();
        this.addrId = addrId;
        this.street = street;
        this.employee = employee;
    }

    public int getAddrId()
    {
        return addrId;
    }

    public void setAddrId(int addrId)
    {
        this.addrId = addrId;
    }

    public String getStreet()
    {
        return street;
    }

    public void setStreet(String street)
    {
        this.street = street;
    }


    public Employee getEmployee()
    {
        return employee;
    }

    public void setEmployee(Employee employee)
    {
        this.employee = employee;
    }

    @Override
    public String toString()
    {
        return "Employee_Address [addrId=" + addrId + ", street=" + street + ", employee=" + employee + "]";
    }
}