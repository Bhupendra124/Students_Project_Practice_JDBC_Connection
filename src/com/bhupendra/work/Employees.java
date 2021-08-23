package com.bhupendra.work;

public class Employees {
    private int Id;
    private String Name;
    private  String department;
    private  String gender;
    private double basicPay;

    public Employees(int id, String name, String department, String gender, double basicPay) {
        Id = id;
        Name = name;
        this.department = department;
        this.gender = gender;
        this.basicPay = basicPay;
    }

    public Employees(String name, String department, String gender, double basicPay) {
        Name = name;
        this.department = department;
        this.gender = gender;
        this.basicPay = basicPay;
    }

    public int getId() {
        return Id;
    }

    public void setId(int id) {
        Id = id;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public double getBasicPay() {
        return basicPay;
    }

    public void setBasicPay(double basicPay) {
        this.basicPay = basicPay;
    }

    @Override
    public String toString() {
        return "Employees{" +
                "Id=" + Id +
                ", Name='" + Name + '\'' +
                ", department='" + department + '\'' +
                ", gender='" + gender + '\'' +
                ", basicPay=" + basicPay +
                '}';
    }
}
