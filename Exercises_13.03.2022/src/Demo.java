public class Demo {
    public static void main(String[] args) {

        int a;
        boolean b;

        a=7;
        b= true;

        if((a == 10) ^ (b == true)){
            System.out.println("Success");
        }else {
            System.out.println("Fail");
        }
    }
}
