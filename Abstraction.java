interface Atm{//methods =>body  abstract 
    public void amount();
    public void current();
    public void savings();
    public void deposit();
}
abstract class atmmachine implements Atm{
    public void amount(){

    }
    public void savings(){
        
    }
    public void current(){
        System.out.println("hello");
    }
    // public void deposit(){
        
    // }
}
class abc extends atmmachine{
    public void deposit(){
        
         }
}
class Abstraction{
    public static void main(String[] args) {
        abc a=new abc();
        a.current();
    }
}