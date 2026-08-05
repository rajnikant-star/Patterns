//public class One1{
//
//    String name;
//    String breed;
//    int age;
//    String color;
//
//    public One1(String name, String breed, int age, String color){
//        this.name = name;
//        this.breed = breed;
//        this.age = age;
//        this.color = color;
//    }
//
//    public String getName() {return name;}
//    public String getBreed() { return breed;}
//    public int getAge() {return age;}
//    public String getColor() {return color;}
//
//    @Override
//    public String toString() {
//        return "Name is: " + name + "\nBreed age and color are: "+breed+" "+age+" "+color;
//    }
//
//    public static void main(String[] args){
//        One1 tuffy = new One1("tuffy","papillion",5,"Black");
//        System.out.println(tuffy);
//    }
//}








//class One1{
//    public One1() {}
//
//
//public class Main {
//    public static void main(String[] args){
//    try{
//        class<?> c = Class.forName("Student");
//        One1 s = (One1)
//                getClass().getDeclaredConstructor().newInstance();
//
//    }
//    }
//}


//import java.util.Scanner;
//
//public class One1{
//    public static void main(String[] args){
//        Scanner sc = new Scanner(System.in);
//        int n = sc.nextInt();
//        for(int i=1;i<=n;i++){
//            System.out.println(i);
//        }
//    }
//        }


import java.util.*;

public class One1 {
    public static void main(String[] args)
    {
        try {
            System.out.println("Outer try block started");

            // Inner try block 1
            try {
                int n = 10;
                int res = n / 0;
            }
            catch (ArithmeticException e) {
                System.out.println(
                        "Caught ArithmeticException: "
                                + e.getClass().getName());
            }

            // Inner try block 2
            try {
                String s = null;
                System.out.println(s.length());
            }
            catch (NullPointerException e) {
                System.out.println(
                        "Caught NullPointerException: "
                                + e.getClass().getName());
            }
        }
        catch (Exception e) {
            System.out.println(
                    "Caught exception in outer try-catch: "
                            + e);
        }
        finally {
            System.out.println("Finally block executed");
        }

        System.out.println(
                "Program continues after nested try-catch");
    }
}