package com.lomaevaav;

public class  Employee {
    public String name;
    public String position;
    public String email;
    public String phone;
    public int salary;
    public int age;


    public  Employee(String name, String position, String email, String phone, int salary, int age) {
        this.name = name;
        this.position = position;
        this.email = email;
        this.phone = phone;
        this.salary = salary;
        this.age = age;
    }

    public  Employee() {

    }
    public void info () {
        System.out.println(" Имя пользователя: " + name + "; Должность: " + position + "; Email: " + email + "; Телефон: " + phone + ";Зарплата: " + salary + "; Возраст: " + age);
    }

}
