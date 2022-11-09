public class Medicine {
    String name,adress;
    Medicine(){
        name="Lifescience Pvt. Ltd. ";
        adress="Industrial Hub,Kochi,231423";
    }
    void displayLabel(){
        System.out.println("\nCompany Name:"+name+"\nAddress:"+adress);
    }
}
class Tablet extends Medicine{
    @Override
    void displayLabel() {
        super.displayLabel();
        System.out.println("store in a cool dry place");
    }
}
class Syrup extends Medicine{
    @Override
    void displayLabel() {
        super.displayLabel();
        System.out.println("to be used only under medical supervision");
    }
}
class Ointment extends Medicine{
    @Override
    void displayLabel() {
        super.displayLabel();
        System.out.println("for external use only");
    }
}
class TestMedicine{
    public static void main(String[] arg){
        double j=Math.random()*4;
        int k=(int)j;
        switch (k){
            case 1:
                Medicine t=new Tablet();
                t.displayLabel();
                break;
            case 2:
                Medicine s=new Syrup();
                s.displayLabel();
                break;
            case 3:
                Medicine o=new Ointment();
                o.displayLabel();
                break;

        }

    }
}
