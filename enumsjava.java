enum Level{
    High,
    Low
}

public class enumsjava {
public static void main(String[] args) {

    Level l=Level.High;
    System.out.println(l);
    Attendance a=new Attendance();
    a.weekdaytoday();
}
}

class Attendance{
    enum Weekday{
        Sunday,
        Monday,
        Tuesday,
        Wednesday,
        Thursday,
        Friday,
        Saturday
    }


    public void weekdaytoday(){
        System.out.println(Weekday.Sunday);
    }
}

class Weekdays{
   final String sunday="sunday";
   final String monday="monday";    
}
