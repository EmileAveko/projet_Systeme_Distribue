package banque;
import java.util.Date;


public class Notification{

    private Date date;
    private String message;


    public Notification(Date date,String message){
    this.date = date;
    this.message = message;
    }


    public Date getDate(){
        return this.date;
    }

    public String getMessage(){
        return this.message;
    }
}