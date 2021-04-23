interface Atm{//methods =>body  abstract 
    public void amount();
    public void current();
    public void savings();
    public void deposit();
    public void play();
}
interface machine{
    public void abc();
    public void play();
}
interface machine2 extends Atm,machine{
    public void abc();
    public void play();
}
// interface machine extends Atm{
//     public void abc();
//     public void play();
// }
abstract class atmmachine implements machine,Atm{
    public void abc(){

    }
    public void play(){

    }
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