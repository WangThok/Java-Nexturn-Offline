
    class Animal{
        void eat(){
            System.out.println("This animal eats food");
        }
    }
    class dog extends Animal{
        void bark(){
            System.out.println("Dog barks");
        }
    }
    
        public class Inheritance {
    public static void main(String[] args) {
        dog dog1=new dog();
        dog1.bark();
        dog1.eat();
        
    }
}
    
