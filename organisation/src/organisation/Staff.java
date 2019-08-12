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
public class Staff extends Employee{
     private String title;
    public Staff(String name, String number, String address,  
		String email, int office, double salary, String title) {
		super(name,number,address, email, office, salary);
		this.title = title;
	}

    public String getTitle(){
        return title;
    }
    public void setTitle(String title){
        this.title=title;
    }
    @Override
    public String toString() {
		return super.toString() + "\nTitle: " + title;
	}
    
}
