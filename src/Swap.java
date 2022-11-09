import java.util.Scanner;
 class Numbers {
     double a;
     double b;
     Numbers(double a,double b){
         this.a=a;
         this.b=b;
     }
    public static void  swapByvalue(double a,double b){
        System.out.println("Before swap by value x="+a+" y="+b);
        double temp=a;
        a=b;
        b=temp;
        System.out.println("After swap by value  x="+a+" y="+b);
    }

     public static void  swapByreference(Numbers num){
         System.out.println("Before  swap by reference x="+num.a+" y="+num.b);
         double temp=num.a;
         num.a=num.b;
         num.b=temp;
         System.out.println("After  swap by reference x="+num.a+" y="+num.b);
     }
    public static void main(String[]args){
        System.out.println("Enter two numbers x and y");
        Scanner sc=new Scanner(System.in);
        double x= sc.nextDouble();
        double y=sc.nextDouble();
        Numbers sw=new Numbers(x,y);
        sw.swapByvalue(x,y);
        sw.swapByreference(sw);

    }
}
