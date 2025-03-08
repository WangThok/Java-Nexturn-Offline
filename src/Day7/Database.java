public class Database {
    abstract class Database{
        abstract void connecting()
        void disconnect(){
            System.out.println("Disconnected");
        }
    }
    class Mydata extends Database{
        void connecting(){
            System.out.println("Conecting to db");
        }
    }
    public static void main(String[] args) {
        System.out.println("Hello, World!");
    }
}