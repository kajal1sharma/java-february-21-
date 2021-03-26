class School{
    static final String schoolname;
    //static final String schoolname;
//To check block initialization of schoolname;
    final String standard;
    int studentcount;
    int totalmarksofclass;
    String unittest;

School(String standard,String schoolname){
  //  School.schoolname=schoolname;
    this.standard=standard;
}


static void print2(){
    System.out.println(School.schoolname);
}

void print(){
    System.out.println(this.schoolname);
}

}

public class Finalkeyword {
    public static void main(String[] args) {
       
        System.out.println(School.schoolname);
        School.print2();
       //School.print();
       
        School stnd1A=new School("1st-A","DPS");

        stnd1A.studentcount=90;
        stnd1A.studentcount=86;
        School stnd1B=new School("1st-B","DAV");
        School stnd2A=new School("2nd-A","ABC");
        School stnd2B=new School("2nd-B","DFG");
    }
}
