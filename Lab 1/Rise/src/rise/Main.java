/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rise;
import java.io.*;
import java.util.*;
/**
 *
 * @author fa20-bse-061
 */
public class Main {
    public static void main(String args[]) {
        Rise s = new Employee();
        s.printInfo();
        //Encapsulation Main//
        Encapsulation person = new Encapsulation();
        person.setName("ALi sher Khan");
        person.setAge(27);
  
        System.out.println("Name: " + person.getName());
        System.out.println("Age: " + person.getAge());
        //Inheritance Main//
        MountainBike mb = new MountainBike(3, 100, 25);
        System.out.println(mb.toString());
        //Polymorphism//
         System.out.println(Polymorphism.Multiply(2, 4));
        System.out.println(Polymorphism.Multiply(5.5, 6.3));
        //Association//
         Bank bank = new Bank("Alflah");
        Employee1 emp;
        emp = new Employee1("Ahmad");
 
        Set<Employee> employees = new HashSet<>();
        Employee1.add(emp);
 
        bank.setEmployees(employees);
 
        System.out.println(emp.getEmployeeName()
                           + " belongs to bank "
                           + bank.getBankName());
    }
    
}
