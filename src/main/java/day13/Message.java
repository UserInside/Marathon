package day13;

import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

public class Message {
    private User sender;
    private User receiver;
    private String text;
    private Date date;

    public Message(User sender, User receiver, String text) {
        this.sender = sender;
        this.receiver = receiver;
        this.text = text;
        Calendar calendar = new GregorianCalendar();
        date = calendar.getTime();
    }

    public User getSender() {
        return sender;
    }

    public User getReceiver() {
        return receiver;
    }

    public String getText() {
        return text;
    }

    public Date getDate() {
        return date;
    }

    @Override
    public String toString() {
        return "FROM: " + sender +
                "\nTO: " + receiver +
                "\nON: " + date +
                "\n" + text;
    }
}
