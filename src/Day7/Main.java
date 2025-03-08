class Parent {
    void show() {
        System.out.println("Show method in Parent class");
    }
}

class Child extends Parent {
    @Override
    void show() {
        System.out.println("Show method in Child class");
    }
}

public class Main {
    public static void main(String[] args) {
        Parent obj = new Child(); // Parent reference, Child object
        obj.show(); // Calls Child's show() method (Runtime polymorphism)
        Parent obj1=new Parent();
        obj1.show();
    }
}
