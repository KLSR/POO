/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entities;

import java.util.ArrayList;
import java.util.Calendar;
/**
 *
 * @author Marco
 */
public class MethodsArrayList {
    public ArrayList <User> Users=new ArrayList<>();
    public ArrayList <Publication> publications=new ArrayList<>();

    public ArrayList<Publication> getPublications() {
        return publications;
    }

    public void setPublications(ArrayList<Publication> publications) {
        this.publications = publications;
    }
    
    public ArrayList<User> getUsers() {
        return Users;
    }

    public void setUsers(ArrayList<User> Users) {
        this.Users = Users;
    }
    User use;//global user 
    public Class<? extends User> searchUsers(String user,String password){//class from search a User
        int i=0;
        while(i<Users.size()){
            if(Users.get(i).getUser().equals(user) && Users.get(i).getPassword().equals(password)){
                use=Users.get(i);
                return Users.get(i).getClass();
            }
            i++;    
        }
        return null;
    }
    public String validUsername(String user){
        int i=0;
        while(i<Users.size()){
            if(Users.get(i).getUser().equals(user)){
                return "Ya existe";
            }
            i++;
        }
        return "Insertar";
        
    }
    //with the name the user only modify the others characterics
    public String modify(String name,String email,String age,String user,String password,Calendar date){
        int i=0;
        while(i<Users.size()){
            if(Users.get(i).getName().equals(name)){
                if(email.equals("")){
                    System.out.println(Users.get(i).getEmail()+Users.get(i).getAge()+Users.get(i).getUser()+Users.get(i).getPassword());
                    //continue;
                }
                else{
                    Users.get(i).setEmail(email);
                }
                if(age.equals("")==false){
                   //continue;
                }
                else{
                    Users.get(i).setAge(age);
                }
            
                if(user.equals("")==false){
                    //continue;
                }
                else{
                    Users.get(i).setUser(user);
                }
              
                if(password.equals("")==false){
                    //continue;
                }
                else{
                    Users.get(i).setPassword(password);
                }
                System.out.println("jj"+Users.get(i).getEmail()+"jj");
                System.out.println(Users.get(i).getEmail()+Users.get(i).getAge()+Users.get(i).getUser()+Users.get(i).getPassword());
                return "modificado";
            }
            i++;
        }
        
        return "no existe";
    }
            
    public User getUse() {
        return use;
    }

    public void setUse(User use) {
        this.use = use;
    }
    
    
}
