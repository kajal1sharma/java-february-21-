
class Car{
    int modelno;
    int height;
    int weight;
    int engine;
    int speed;

    Car(int modelno,int height,int weight, int engine,int speed){
        this.modelno=modelno;
        this.height=height;
        this.weight=weight;
        this.engine=engine;
        this.speed=speed;
    }
    Car(int modelno){
        this.modelno=modelno;
    }
}

class newGenCar extends Car{

    int dashboard;
    int light;

    newGenCar(int dashboard,int light,int modelno, int height, int weight, int engine, int speed){
       // super(modelno,height,weight,engine,speed);
        super(modelno);
        this.dashboard=dashboard;
        this.light=light;
       
    }
}

class newgen2 extends Car{
    int wipers;

    newgen2(int wipers,int modelno, int height, int weight, int engine, int speed){
        //Car();//this can not be used
        super(modelno,height,weight,engine,speed);
        this.wipers=wipers;
    }
}

class newgen3 extends newGenCar{
    int seats;
    newgen3(int seats,int dashboard,int light,int modelno, int height, int weight, int engine, int speed){

        super(dashboard,light,modelno,height,weight,engine,speed);
        this.seats=seats;
    }
}

public class superkey{
    public static void main(String[] args) {
     newGenCar ng=new newGenCar(1,1,1,1,1,1,1); 
     System.out.println(ng.modelno+" "+ng.dashboard);  
     
     newgen3 ng3=new newgen3(1,1,1,13,3,2,1,3);
     System.out.println(ng3.modelno+" "+ng3.dashboard+" "+ng3.seats);  
    }
}