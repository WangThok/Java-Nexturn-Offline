

class PrivateEx{
    private int secretCode=123;
    void showcode(){
        System.err.println(secretCode);
    }
}

    public class Privateaccess {
        public static void main (String []args){
            PrivateEx obj =new PrivateEx();
            obj.showcode();
        }
    }
