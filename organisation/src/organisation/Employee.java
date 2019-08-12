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
public class Employee extends Person {
    private int office;
    private double salary;
    private MyDate dateHired;
    public Employee(String name, String number, String address, 
		String email, int office, double salary) {
		super(name, number, address, email);
		this.office = office;
		this.salary = salary;
		this.dateHired = new MyDate();
	}
    public int getOffice(){
        return office;
    }
    public String getSalary(){
        return String.format("%.2f",salary);
    }
    public void setOffice(int office){
        this.office=office;
    }
    public void setSalary(double salary){
        this.salary=salary;
    }
    
    public String getDateHired(){
        return dateHired.getMonth()+"/"+dateHired.getDate()+"/"+dateHired.getYear();
    }
    public void setDate(){
         dateHired=new MyDate();
    }
    @Override
    public String toString(){
         return super.toString() + "\nOffice: " + office + 
				 "\nSalary: $" + getSalary() + "\nDate hired: " + getDateHired();
    }

   
}

