public class AbstractEx {
    abstract class trainer{
        abstract void teach();
    }
    class student extends trainer{
        void teach(){
            System.out.println("Teaching is going on ! ");
        }

    }
    public static void main(String[] args) {
        System.out.println("Hello, World!");
    }
}//.......