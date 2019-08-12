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
public class faculty extends Employee {
	// Data fields
	private String officeHours;
	private String rank;
    private String title;

	// Constructors
	/** Construct a Faculty object with specified name, address, phone number,
	  * email address, office, salary, office hours and rank
     * @param name
     * @param number
     * @param email
     * @param address
     * @param office
     * @param salary
     * @param officeHours
     * @param rank */
		public faculty(String name, String number, String address, String email, 
		int office, double salary, String officeHours, String rank) {
		super(name,number,address, email, office, salary);
		this.officeHours = officeHours;
		this.rank = rank;
	}
        public String getOfficeHours() {
		return officeHours;
	}
        public void setOfficeHours(String officeHours) {
		this.officeHours = officeHours;
	}
        public String getRank() {
		return rank;
	}
        public void setRank(String rank) {
		this.rank = rank;
	}
        @Override
        public String toString() {
		return super.toString() + "\nOffice hours: " + officeHours +
		"\nRank: " + rank;
	}
    
}
