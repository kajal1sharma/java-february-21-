class Person{
    int height=90;
    int weight=30;
    int age=33;
    String name="dsfsfda";
}

class student extends Person{
    int fees=900;
    int subject=3;
    int Sid=32323;



}

public class Inheritence {
    public static void main(String[] args) {
        student st=new student();

    System.out.println(st.height+" "+st.weight+"  "+st.fees+"  "+st.subject);
    }
}
