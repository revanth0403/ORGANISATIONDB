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
public class Student extends Person {
    private static int status;
    public final static int FRESHMAN=1;
    public final static int JUNIOR=2;
    public final static int SOPHOMORE=3;
    public final static int SENIOR=4;
    public Student(String name,String number,String address,String email,int status){
        super(name,number,address,email);
                Student.status=status;
    }
    public void setStatus(int status){
        Student.status=status;
    }
    public String getStatus(){
        switch(status){
            case 1:return "freshman";
            case 2:return "junior";
            case 3:return "Sophmore";
            case 4:return "senior";
            default :return "unknown";
        }}
    @Override
         public String toString(){
             return super.toString() +"/n status :"+getStatus();
        }
    
    
}
