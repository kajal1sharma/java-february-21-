public class Circle {
    private double radius=1.0;
    private String color="red";
    Circle(){
        System.out.println("the object has been created");
    }
    Circle(double radius){
        this.radius=radius;
    }
    Circle(double radius, String color){
        this.radius=radius;
        this.color=color;
    }
   
    public double getRadius(){
        return this.radius;
    }
    public String getColor(){
        return this.color;
    } 
    public void setRadius(double radius){
        this.radius=radius;
    }
    public void setColor(String color){
        this.color=color;
    }
    //class description
    //@Override
    public String toString(){
        return this.getClass()+"  props:  radius ="+this.radius+" color ="+this.color;
    }
    
    public double getArea(){
        return this.radius*this.radius*3.14;
    }

    public static void main(String[] args) {
        Circle c1=new Circle();
        System.out.println(c1.toString());
        Circle c2=new Circle(12);
        Circle c3=new Circle(5,"purple");
        c2.setColor("pink");
        c3.setRadius(13);
        System.out.println("obj c1:  "+c1.toString()+"  area:  "+c1.getArea()+"  color:: "+c1.getColor());
    
    //Author a=new Author();
    //Book b=new Book("name of the bool",a...);
    }
}
