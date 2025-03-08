public class Student {
    String name;
    int roll;
    char grade;
    Student( String name,int roll,char grade){
        this.name=name;
        this.roll=roll;
        this.grade=grade;
    }
    void  Display(){
        System.out.println("Student details : ");
        System.out.println("Name : "+name);
        System.out.println("Roll");    

    }
    public static void main(String[] args) {
        System.out.println("Hello, World!");
    }
}