import java.util.Scanner;

class Tile {
    int edge;
    int area;
    Tile(int edge){
        this.edge=edge;
        this.area=edge*edge;
    }
    int getArea(){
        return area;
    }
}
class Floor{
    int width;
    int length;
    Floor(int length,int width){
        this.length=length;
        this.width=width;
    }
    void totalTiles(Tile t){
        double tileArea=t.getArea();
        double floorArea=length*width;
        double numberofTiles=floorArea/tileArea;
        System.out.println("Total number of tiles needed to cover the floor completely is:"+numberofTiles);
    }
}
class Tf{
    public static void main(String []arg){
        System.out.println("Enter the length of Tile ");
        Scanner sc=new Scanner(System.in);
        int e=sc.nextInt();
        Tile t=new Tile(e);

        System.out.println("Enter the length and width of floor");
        int fl=sc.nextInt();
        int fw=sc.nextInt();
        Floor f=new Floor(fl,fw);
        f.totalTiles(t);
    }
}