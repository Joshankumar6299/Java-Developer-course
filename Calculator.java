
class Computer{

    // public void playMusic(){
       
    //      System.out.println("Playing music");
    // }

    // public String getMeAPen(int cost){
    //     if(cost >= 10)
    //         return "pen";
    //     else
    //         return "No pen";
    // }

    // Method Overloding 
    // public int add(int n1,int n2,int n3){
    //     return n1+n2+n3;
    // }
    // public int add(int n1,int n2){
    //     return n1+n2;
    // }
    // public double add(double n1,int n2){
    //     return n1 + n2;
    // }


    public int add(int n1,int n2){
        return n1+n2;
    }

}


public class Calculator {
    public static void main(String[] args) {

        // Computer obj = new Computer();
        // obj.playMusic();
        // String pen = obj.getMeAPen(5);
        // System.out.println(pen);
        
        Computer obj = new Computer();
        int r1 = obj.add(4,3);
        System.err.println(r1);

        
    }
}
