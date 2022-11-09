import java.util.Scanner;

public class Employee {
    private String Name,result;
     int EmpId,ass1,ass2,ass3;
    Employee(int ass1,int ass2,int ass3){
        this.ass1=ass1;
        this.ass2=ass2;
        this.ass3=ass3;
    }
    void display(){
        float total=ass1+ass2+ass3;
        float percentage=(total/300)*100;
       System.out.println("\nTotal:" +total+"\nPercentage:"+percentage);
       if (ass1>75&&ass2>75&&ass3>75){
           this.result="Promotrd";
           System.out.println(result);
       }
       else{
           this.result="Demoted";
           System.out.println(result);
       }
    }
    public static void main(String[] args){
        System.out.println("Enter the Assesment values");
        Scanner sc=new Scanner(System.in);
        int a1=sc.nextInt();
        int a2=sc.nextInt();
        int a3=sc.nextInt();
        Employee E=new Employee( a1, a2, a3);
        E.display();
    }


}
