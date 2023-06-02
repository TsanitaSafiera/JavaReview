package review7;

public class E1 {
    double temp(double a){
        System.out.println((a*9/5)+32);
        return a;
    }

    public static void main(String[] args) {
        E1 obj= new E1();
        obj.temp(20);
    }
}
