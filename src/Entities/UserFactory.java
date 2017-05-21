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
public class UserFactory {//maker User: This class create diferents Users, this is a Factory
    public static User maker(int tipo,String name,String email,String age,String user,String password,Calendar date){
        switch (tipo) {
            case 1:
                return new Manager(name,email,age,user,password,date);
                
            case 2:
                return new Employee(name,email,age,user,password,date);
                
            case 3:
                return new Client(name,email,age,user,password,date);
                
            default:
                return null;
        }
    }
}
