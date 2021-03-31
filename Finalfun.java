class Schools{

    final String school="DAV";

    final void printnameSchool(){
        
        System.out.println(this.school);
    }
    
} 

class Students extends Schools{
    // final void printnameSchool(){
        
    //     System.out.println(this.school);
    // }
}

public class Finalfun {
    public static void main(String[] args) {
        Schools s=new Schools();
       // s.printnameSchool();

        Students st=new Students();
        st.printnameSchool();
    }
}
