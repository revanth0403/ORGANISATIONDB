/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package organisation;

/**
 *
 * @author revanth
 */
public class Person {
    private String name;
    private String number;
    private String address;
    private String email;
    Person(){
        this("unknown","unknown","unknown","unknown");
                
    }
    Person(String name,String number,String address,String email){
        this.name=name;
        this.number=number;
        this.address=address;
        this.email=email;
    }
    public String getName(){
        return name;
    }
    public String getNumber(){
        return number;
    }
    public String getAddress(){
        return address;
    }
    public String getEmail(){
        return email;
    }
    public String getName(String name){
        this.name=name;
        return null;
    }
    public String getNumber(String number){
        this.number=number;
        return null;
    }
    public String getAddress(String address){
        this.address=address;
        return null;
    }
    public String getEmail(String email){
        this.email=email;
        return null;
    }
    @Override
    public  String toString(){
        System.out.println("name :"+name+"/n number :"+number+"/n address :"+address+"/n email :"+email);
        return null;
    }
    
}
