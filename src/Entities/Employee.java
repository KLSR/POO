/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entities;

import java.util.Calendar;

/**
 *
 * @author Marco
 */
public class Employee extends User{//create Employees
    public Employee(String name,String email,String age,String user,String password,Calendar date){
        super.setName(name);
        super.setEmail(email);
        super.setAge(age);
        super.setUser(user);
        super.setPassword(password);
        super.setDate(date);
    }
    
}
