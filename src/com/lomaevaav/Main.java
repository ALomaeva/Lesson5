package com.lomaevaav;

public class Main {
    public static void main(String[] args) {
        Employee person1 = new Employee();
        person1.name = "Анастасия";
        person1.position = "QA";
        person1.email = "@gmail.com";
        person1.phone = "555555555";
        person1.salary = 45000;
        person1.age = 25;
        Employee person2 = new Employee("Александр", "TM", "@mail.com", "7777777", 80000, 29);
        person1.info();
        person2.info();
        Employee[] empArray = new Employee[5];
        empArray[0] = new Employee("Василий", "Директор", "@gmail.com", "1234567", 100000, 45);
        empArray[1] = new Employee("Павел", "Зам.директора", "@gmail.com", "1234568", 75000, 40);
        empArray[2] = new Employee("Елена", "Секретарь", "@gmail.com", "1234569", 45000, 35);
        empArray[3] = new Employee("Светлана", "Бухгалтер", "@gmail.com", "1234563", 50000, 33);
        empArray[4] = new Employee("Виктор", "Охраник", "@gmail.com", "1234565", 25000, 50);
        for (int i = 0; i < 5; i++) {
            if (empArray[i].age > 40) {
                empArray[i].info();
            }
        }

    }
}



