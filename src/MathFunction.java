import java.util.Scanner;

public class MathFunction {
    void multiply(int a,int b){
        int c;
        System.out.println(c=a*b);
    }
    void multiply( float a,float b){
        float c;
        System.out.println(c=a*b);
    }
    void multiply( float a,int b){
        float c;
        System.out.println(c=a*b);
    }
    public static void main(String[] arg){
        MathFunction n1=new MathFunction();
        MathFunction n2=new MathFunction();
        MathFunction n3=new MathFunction();
        n1.multiply(3,5);
        n2.multiply(2.1f,1.2f);
        n3.multiply(3.2f,3);
    }
}
