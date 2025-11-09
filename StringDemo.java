class Mobile {
    static String name;
    String brand;
    int price;
    String color;

    static {
        name = "Phone";
        System.out.println("in static block");
    }
    public Mobile(){
        brand = "";
        price = 5000;
        color = "White";
        System.out.println("in constructor");
    }

    public void show() {
        System.out.println(name + " : " + brand + " : " + price + " : " + color);
    }
}

public class StringDemo {
    public static void main(String[] args) throws ClassNotFoundException {
        // String example
        // String name = "Yash";
        // name = name + " Kushwaha";
        // System.out.println("Hello " + name);

        // String s1 = "Yash";
        // String s2 = "Yash";
        // System.out.println(s1 == s2);

        // StringBuffer example
        // StringBuffer sb = new StringBuffer("Yash");
        // sb.append(" Kushwaha");
        // sb.insert(5, "Kumar ");
        // sb.setLength(30);
        // sb.ensureCapacity(100);
        // System.out.println(sb);

        // Mobile obj = new Mobile();
        // obj.name = "Vivo Y12s";
        // obj.brand = "Vivo";
        // obj.price = 10000;
        // obj.color = "Black";

        // Mobile obj1 = new Mobile();

    //    Mobile obj1 = new Mobile();
    //     obj1.name = "Vivo Y12s";
    //     obj1.brand = "Vivo";
    //     obj1.price = 10000;
    //     obj1.color = "Black";

    //     Mobile obj2 = new Mobile();
    //     obj2.name = "Vivo Y12s";
    //     obj2.brand = "Vivo";
    //     obj2.price = 10000;
    //     obj2.color = "Black";

    //     obj.show();
    //     obj1.show();
    //     obj2.show();
        

    Class.forName("Mobile");
   
    }
}
