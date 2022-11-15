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

    // Creates and returns a copy of this object.
    public Object clone() throws CloneNotSupportedException {
        return super.clone(); // return nearest element
    }

    // Indicates whether some other object is "equal to" this one.
    public boolean equals(Object obj) {
        if (obj instanceof TimeClient) {
            TimeClient result = (TimeClient) obj;
            return result.hour == this.hour;
        } else
            return false;
    }

    // Returns the runtime class of an object.
    void printClassName(Object obj) {
        System.out.println("The object's" + " class is " +
            obj.getClass().getSimpleName());
    }

    // Returns a hash code value for the object.@overide
    public int hashCode() {
        return hour*10; //hashcode
    }
    
    public static void main(String... args) throws CloneNotSupportedException {
        TimeClient myTimeClient1 = new SimpleTimeClient();
        TimeClient myTimeClient2 = new SimpleTimeClient();

        //settime
        myTimeClient1.setTime(10, 11, 12);
        myTimeClient2.setTime(11, 1, 3);

        //clone()
        // System.out.println("Clone?");
        // TimeClient myTimeClient1_copy = (TimeClient) myTimeClient1.clone();
        // System.out.println("MyTimeClients copy = " + myTimeClient1);
        // System.out.println("--------------------");

        //equals()
        System.out.println("Check equals ?");
        if (myTimeClient1.equals(myTimeClient2)) {
            System.out.println("Objects are equal");
        } else {
            System.out.println("Objects are not equal");
        }
        System.out.println("--------------------");

        //getClass()
        // System.out.println("Check Rec1 class?");
        // TimeClient.printClassName(myTimeClient1);
        // System.out.println("--------------------");
        
        //Hashcode()
        System.out.println("Hashcode Rec3?");
        System.out.println(myTimeClient2.hashCode());
        System.out.println("--------------------");

        //To String 
        System.out.println(myTimeClient1.toString());
        System.out.println(myTimeClient2.toString());
    }
}