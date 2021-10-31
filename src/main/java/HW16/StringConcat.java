package HW16;

public class StringConcat {
    String string = "";
    public String printPersonalGreeting(String n, String ln) {

        string = "Hello," + n + " " + ln + "!";
        return string;
    }
}
