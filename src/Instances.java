
public class Instances {
    static int c_count=0;
    static int d_count=0;
    Instances(){
        c_count++;
    }
    public static void main(String args[]){
        Instances t1,t2,t3;
        t1=new Instances();
        t2=new Instances();
        t3=new Instances();
        t1=null;
        t2=t1;
        System.gc();
        Runtime.getRuntime().gc();
        System.out.println("Total instances created "+c_count);
        System.out.println("Total instances destroyed "+d_count);
        System.out.println("live instances "+(c_count-d_count));


    }
    protected void finalize()
    {
        d_count++;
    }
}
