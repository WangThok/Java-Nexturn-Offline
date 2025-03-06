

public class Book {
    String title;
    String author;
    int price;

    Book(String title,String author, int price){
        this.title=title;
        this.author=author;
        this.price=price;
        System.out.println("Title : "+title);
        System.out.println("Author : "+author);
        System.out.println("Price : $"+price);
    }

        Book(Book b){
            this.title=b.title;
            this.author=b.author;
            this.price=b.price;

   }
    public static void main(String[] args) {
        Book b1=new Book("Java Programming","James Gosling",30);
        Book b2=new Book(b1);

            System.out.println("Copied Title : "+b2.title);
            System.out.println("Copied Author : "+b2.author);
            System.out.println("Copied Price : $"+b2.price);
        }
        
    }
