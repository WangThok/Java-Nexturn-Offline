
interface class1{
    
    void dog();
    //abstract
}
interface class2{
    void cat();
}
class Animal implements class1, class2{
     public void dog(){
  System.out.println("dog barks");
    }
     public void  cat(){
        System.out.println("meaw");
    }

}


public class InterfaceEx {
    public static void main(String[] args) {
        Animal obj=new Animal();
        obj.dog();
        System.out.println("Hello, World!");
         
    }
}