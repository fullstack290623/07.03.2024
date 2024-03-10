package com.example.demo.model;

public class Employee {
    protected Integer id;
    protected String name;
    protected Integer age;
    protected String address;
    protected Float salary;
    public Integer getId() {
        return id;
    }
    public void setId(Integer id) {
        this.id = id;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public Integer getAge() {
        return age;
    }
    public void setAge(Integer age) {
        this.age = age;
    }
    public String getAddress() {
        return address;
    }
    public void setAddress(String address) {
        this.address = address;
    }
    public Float getSalary() {
        return salary;
    }
    public void setSalary(Float salary) {
        this.salary = salary;
    }
    public Employee(Integer id, String name, Integer age, String address, Float salary) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.address = address;
        this.salary = salary;
    }
    public Employee() {
    }
    @Override
    public String toString() {
        return "Employee{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", age=" + age +
                ", address='" + address + '\'' +
                ", salary=" + salary +
                '}';
    }
}
