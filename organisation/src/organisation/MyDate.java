/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package organisation;
import java.util.GregorianCalendar;
/**
 *
 * @author revanth
 */
public class MyDate {
    private int date;
    private int month;
    private int year;
    MyDate(){
        GregorianCalendar calendar=new GregorianCalendar();
        year=calendar.get(GregorianCalendar.YEAR);
        month=calendar.get(GregorianCalendar.MONTH);
        date=calendar.get(GregorianCalendar.DATE);
    }
    MyDate(int date,int month,int year){
        this.date=date;
        this.month=month;
        this.year=year;
    }
    MyDate(long elapsedTime){
        setDate(elapsedTime);
    }
    public int getYear(){
        return year;
    }
    public String getMonth(){
        String m=String.valueOf(month+1);
        return (month < 10 ? "0"+m : m);
    }
    public String getDate(){
        String d=String.valueOf(date);
        return (date < 10 ? "0"+d : d);
    }
    public void setDate(long elapsedTime){
        GregorianCalendar calander = new GregorianCalendar();
		calander.setTimeInMillis(elapsedTime);
		year = calander.get(GregorianCalendar.YEAR);
		month = calander.get(GregorianCalendar.MONTH);
		date  = calander.get(GregorianCalendar.DAY_OF_MONTH);
        
    }
    
}
