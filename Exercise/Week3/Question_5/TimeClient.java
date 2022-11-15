package Frankfurt.Exercise.Week3.Question_5;

import java.time.*; 
 
public interface TimeClient {
    public int hour = 0;
    void setTime(int hour, int minute, int second);
    void setDate(int day, int month, int year);
    void setDateAndTime(int day, int month, int year,
                               int hour, int minute, int second);
    LocalDateTime getLocalDateTime();
}
