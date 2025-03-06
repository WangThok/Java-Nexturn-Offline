
public class ConstructorEx {

    String person;
    int age;

    ConstructorEx() {
        System.out.println("Default constructor");
    }

    ConstructorEx(String person) {
        this.person = person;
        System.out.println("Name is : " + person);
    }

    ConstructorEx(String person, int age) {
        this.person = person;
        this.age = age;
        System.out.println("My name is : " + person + " and my age is : " + age);
    }

    public static void main(String[] args) {
        ConstructorEx p1 = new ConstructorEx("John");
        ConstructorEx p2 = new ConstructorEx("Wang", 20);
        ConstructorEx p3 = new ConstructorEx();

    }
}
