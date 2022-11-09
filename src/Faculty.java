import java.util.Scanner;

public class Faculty {
    int facultyid;
    double salary;
}
    class FullTimeFaculty extends Faculty {
        float basic;
        float allowance;
        void method(int facultyid,float basic,float allowance){
            this.facultyid=facultyid;
            this.salary=basic+allowance;
        }
        void display(){
            System.out.println("Faculty Id :"+facultyid);
            System.out.println("Full Time Salary:"+salary);
        }
    }
    class PartTimeFaculty extends Faculty {
        float hour;
        float rate;

        void method(int facultyid,float hour, float rate) {
            this.facultyid = facultyid;
            this.salary = hour * rate;
        }

        void display() {
            System.out.println("Faculty Id :" + facultyid);
            System.out.println("Part Time Salary:" + salary);
        }
    }
class Driver {
    public static void main(String[] args){
        FullTimeFaculty f1=new FullTimeFaculty();
        FullTimeFaculty f2=new FullTimeFaculty();
        PartTimeFaculty p1=new PartTimeFaculty();
        PartTimeFaculty p2=new PartTimeFaculty();
        f1.method(200,1200,1300);
        f2.method(201,2000,4500);
        p1.method(100,4,500);
        p2.method(101,3,400);
        f1.display();
        f2.display();
        p1.display();
        p2.display();
    }
}