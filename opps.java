
class Human{
    private  String name = "Yash";
    private  int age = 20;

    // Constructor
    public Human(){            // Default constructor
        name = "Joshan";
        age = 20;
    }

    public Human (int age,String name){ // Parameterize Constructor
        this.name = name;
        this.age = age;
    }

    // Encapsulation in java

    public String getName(){
        return name;
    }
    public void setName(String name){
        // name = str;
        this.name = name;
    }

    public int getAge(){
        return age;
    }
    public void setAge(int age){
        // age = a;
        this.age = age;
    }

    

}


public class opps {
    public static void main(String[] args) {

        Human obj = new Human();
        Human obj1 = new Human(19,"Kushwaha");
        System.out.println(obj.getName() + ":" + obj.getAge());
         System.out.println(obj1.getName() + ":" + obj1.getAge());
        // obj.name = "Yash";
        // obj.age = 20;

        // obj.setName("Yash");
        // obj.setAge(20);

        // System.out.println(obj.getName() + ":" + obj.getAge());
        
    }

}
