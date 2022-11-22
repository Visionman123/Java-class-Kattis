package Frankfurt.Exercise.Week3.Question_5;

import java.time.*;
import java.lang.*;
import java.util.*;

public class SimpleTimeClient implements TimeClient {
    
    private LocalDateTime dateAndTime;
    
    public SimpleTimeClient() {
        dateAndTime = LocalDateTime.now();
    }
    
    public void setTime(int hour, int minute, int second) {
        LocalDate currentDate = LocalDate.from(dateAndTime);
        LocalTime timeToSet = LocalTime.of(hour, minute, second);
        dateAndTime = LocalDateTime.of(currentDate, timeToSet);
    }
    
    public void setDate(int day, int month, int year) {
        LocalDate dateToSet = LocalDate.of(day, month, year);
        LocalTime currentTime = LocalTime.from(dateAndTime);
        dateAndTime = LocalDateTime.of(dateToSet, currentTime);
    }
    
    public void setDateAndTime(int day, int month, int year,
                               int hour, int minute, int second) {
        LocalDate dateToSet = LocalDate.of(day, month, year);
        LocalTime timeToSet = LocalTime.of(hour, minute, second); 
        dateAndTime = LocalDateTime.of(dateToSet, timeToSet);
    }
    
    public LocalDateTime getLocalDateTime() {
        return dateAndTime;
    }
    
    public String toString() {
        return dateAndTime.toString();
    }
    
  /*  public static void main(String... args) {
        TimeClient myTimeClient = new SimpleTimeClient();
        System.out.println(myTimeClient.toString());
    }
    
   */
    @Override
    public Object clone() throws CloneNotSupportedException {
    	
    	SimpleTimeClient tc=new SimpleTimeClient();
    	tc.dateAndTime=this.getLocalDateTime();
    	return tc;
    
    }
    @Override
    public boolean equals(Object o) {
	    // self check
	    if (this == o)						//ten sam obiekt
	        return true;
	    // null check
	    if (o == null)
	        return false;
	    // type check and cast
	    if (getClass() != o.getClass())
	        return false;

	    SimpleTimeClient timetest= (SimpleTimeClient) o;

	    return 	this.getLocalDateTime().equals(timetest.getLocalDateTime());
    }
    
    void printClassName() {
    	System.out.println("The Object's"+"Class is " + this.getClass().getSimpleName());
    
    }
    @Override
    public int hashCode() {
    		return dateAndTime.hashCode();														// not done! Can i override it??
     }

}