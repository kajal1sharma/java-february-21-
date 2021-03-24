class Persons{
    String name;
    String surname;
    int age;
    String address;
    String phone;
    int id;
}

class Teachers extends Persons{
    int salary;
    String subjectToTeach[]=new String[2];
}

class Studdent extends Persons{
    int fees;
    int marks;
    int standard;
    String subject[];

    Studdent(int fees,int marks,int standard,String subjects[],String name,String surname,int age,String address,String phone,int id){
        this.fees=fees;
        this.marks=marks;
        this.standard=standard;
        this.subject=subjects;
        this.name= name;
        this.surname =surname;
        this.age =age;
        this.address =address;
        this.phone =phone;
        this.id =id;
    }
}

public class Inheritence2 {
    public static void main(String[] args) {
        Studdent st=new Studdent(2000,100,5,new String[]{"maths","english","science","hindi","sst"},"teena","verma",12,"new delhi","213234242",23232322);
        System.out.println("fees : "+st.fees+
        "marks : "+st.marks+"subjects : "+st.subject[0]+"  "+st.subject[1]+"  "+st.subject[2]+"   "+"name : "+st.name);
    }
}
