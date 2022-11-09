class OneBHK {
    double roomArea;
    double hallArea;
    double price;

    OneBHK(){
        roomArea=0;
        hallArea=0;
        price=0;
    }
    OneBHK(double roomArea,double hallArea,double price){
        this.roomArea=roomArea;
        this.hallArea=hallArea;
        this.price=price;
    }
    void show(){
        System.out.println("\nRoom Area :"+roomArea+"\nHall Area :"+hallArea+"\nPrice:"+price);
    }
}
class TwoBHK extends OneBHK{
    double room2Area;

    TwoBHK(){
        room2Area=0;
    }
    TwoBHK(double roomArea,double hallArea,double price,double room2Area){
        super(roomArea,hallArea,price);
        this.room2Area=room2Area;
    }
    void show() {
        System.out.println("\nRoom Area :"+roomArea+"\nHall Area :"+hallArea+"\nPrice:"+price+"\nRoom2 Area :"+room2Area);


    }
}
class DriverClass{
    public static void main(String []args){
        TwoBHK ob1=new TwoBHK(10,20,2000,20);
        TwoBHK ob2=new TwoBHK(20,15,3000,30);
        TwoBHK ob3=new TwoBHK(10,10,1000,20);
        ob1.show();
        ob2.show();
        ob3.show();
        double p= ob1.price+ob2.price+ob3.price;
        System.out.println("\nTotal Price:"+p);
    }
}