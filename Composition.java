class Author{
    String name;
    String email;
    char gender;

    Author(String name, String email, char gender){
        this.name=name;
        this.email=email;
        this.gender=gender;
    }

    public String getName(){
        return this.name;
    }
    public String getEmail(){
        return this.email;
    }
    public char getGender(){
        return this.gender;
    }

    public void setEmail(String email){
        this.email=email;
    }

    public String toString(){
        return this.getClass()+"[name: "+this.name+" email: "+this.email+
                " gender: "+this.gender+"]";
    }
}

class Book{
    String name;
    Author author;
    double price;
    int qty=0;
    Book(String name, Author author, double price){
        this.name=name;
        this.author=author;
        this.price=price;
    }
    Book(String name, Author author, double price, int qty){
        this.name=name;
        this.author=author;
        this.price=price;
        this.qty=qty;
    }
    public String getName(){
        return this.name;
    }
    public Author getAuthor(){
        return this.author;
    }
    public double getPrice(){
        return this.price;
    }
    public void setPrice(double price){
            this.price=price;
    }
    public int getQty(){
        return this.qty;
    }
    public void setQty(int qty){
        this.qty=qty;
    }
    public String toString(){
        return this.getClass()+"[name: "+this.name+","+
        this.author.getClass()+"[name: "+this.author.name+", email: "+
        this.author.email+",gender: "+this.author.gender+"],price : "
        +this.price+", qty : "+this.qty+"]";
    }
}

public class Composition {
    public static void main(String[] args) {
        Author ahTeck = new Author("Tan Ah Teck", "ahteck@nowhere.com", 'm');
System.out.println(ahTeck);  // Author's toString()

Book dummyBook = new Book("Java for dummy", ahTeck, 19.95, 99);  // Test Book's Constructor
System.out.println(dummyBook);  // Test Book's toString()

// Test Getters and Setters
dummyBook.setPrice(29.95);
dummyBook.setQty(28);
System.out.println("name is: " + dummyBook.getName());
System.out.println("price is: " + dummyBook.getPrice());
System.out.println("qty is: " + dummyBook.getQty());
System.out.println("Author is: " + dummyBook.getAuthor());  // Author's toString()
System.out.println("Author's name is: " + dummyBook.getAuthor().getName());
System.out.println("Author's email is: " + dummyBook.getAuthor().getEmail());

// Use an anonymous instance of Author to construct a Book instance
Book anotherBook = new Book("more Java", 
      new Author("Paul Tan", "paul@somewhere.com", 'm'), 29.95);
System.out.println(anotherBook);
    }
}
