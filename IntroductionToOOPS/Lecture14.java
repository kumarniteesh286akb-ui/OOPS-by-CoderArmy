package IntroductionToOOPS;

public class Lecture14 {

    public static void main(String[] args) {
//     call by value
//    int x = 4;
//    int y = 5;
//
//        System.out.println(x+","+y);
//        addTen(x,y);
//        System.out.println(x+","+y);
//
//    }
//
//    static void addTen(int x,int y ){
//        x = x+10;
//        y= y+10;




        // call by reference
        Random r1 = new Random(4,5);
        Random r2 = new Random(r1);  //Deep copy
        Random r3 = r1;  //Shallow copy

        System.out.println(r1.x+","+r1.y);
        addTen(r1);
        System.out.println(r1.x + "," + r1.y);


    }
    static void addTen(Random r){
        r.x = r.x+10;
        r.y = r.y+10;
    }
}
class Random{
    int x;
    int y;


    Random(int x,int y){
        this.x = x;
        this.y =y;
    }


    Random(Random r){
        this.x=r.x;
        this.y=r.y;
    }
}
