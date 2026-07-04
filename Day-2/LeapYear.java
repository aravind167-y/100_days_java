

public class LeapYear {
    public static void main(String[] args) {
        int leapYear=2000;
        if((leapYear%4==0 && !(leapYear%100==0)) || leapYear%400==0 ){
            System.out.println("Leap Year");
        } else{
            System.out.println("Not a Leap year");
        }
    }
}
