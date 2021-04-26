enum Level{
    HIGH,
    LOW
}

public class enumsjava {
public static void main(String[] args) {

    Level l=Level.HIGH;
    System.out.println(l);
    Attendance a=new Attendance();
    a.weekdaytoday();
}
}

class Attendance{
    enum Weekday{//public static final;
        //public static final Weekday Sunday=new Weekday("Sunday");
        Sunday,
        Monday,
        Tuesday,
        Wednesday,
        Thursday,
        Friday,
        Saturday;

        public static void print(){
             for(Weekday w: Weekday.values()){
            System.out.println(w);
        }
        }
        
    }



    public void weekdaytoday(){
        
        Weekday.print();
        // for(Weekday w: Weekday.values()){
        //     System.out.println(w);
        // }
        // System.out.println(Weekday.Sunday);
        // System.out.println(Weekday.Sunday.getClass());
    }
}

class Weekdays{
   final String sunday="sunday";
   final String monday="monday";    
}
