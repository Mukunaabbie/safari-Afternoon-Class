package XYZ;

public class file3 {
    public static void main(String[] args) {
        Integer x;
        x=16;
        if (x<10){
            System.out.println("under age");
        }else if (x>10&&x<20){
            System.out.println("qualified");
        }else if (x>=20 && x<30) {
            System.out.println("over age");
        }else {
            System.out.println("you are dead");
        }
    }
}
