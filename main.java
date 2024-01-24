
import java.util.Scanner;

public class main {
    public static void main(String args[]) {
        print function
        System.out.print("Hello Hiren\n");
        System.out.println("1 2 3 4 5 6");

        Variables
        int a =10;
        int b = 25;
        String name = "Hiren";
        System.out.println(a);
        System.out.println(b);
        System.out.println(name);

        Data types in java
        short a = 240;
        System.out.println(a);
        byte b = 8;
        System.out.println(b);
        char c = 'h';
        System.out.println(c);
        boolean flag = true;
        System.out.println(flag);
        int age = 25;
        System.out.println(age);
        long num = 12221;
        System.out.println(num);
        double pr = 1222.123;
        System.out.println(pr);

        Inputs in java
        String a;
        Scanner sc = new Scanner(System.in);
        a = sc.next();
        System.out.println(a);
        
        String name = sc.nextLine();
        System.out.println(name);

        sum of 2 numbers take input from user
        int a = sc.nextInt();
        int b = sc.nextInt();
        int sum = a+b;
        System.out.println("Sum of two numbe is: " + (a+b));

        product of 2 numbers take input from user
        System.out.println("Sum of two numbe is: " + (a * b));

        find area of circle
        float radius = sc.nextFloat();
        System.out.println("Area of circle is: "+ (3.14*radius*radius));

        Type conversion in java
        byte > short > int > float > long > double
        long a = 32;
        int b = a;
        System.out.println(b); // this will raise an error because we are
        implementing long value in int

        implicit type conversion / widenning conversion
        float f = sc.nextInt(); // we are taking int from user and assign it into a
        float datatype
        System.out.println(f); // this will return float value which is implicit type
        casting

        Explicit type casting / Narrowing conversion
        float fr = 3.95;
        float a = 3.14f;
        int b = (int) a;
        System.out.println(b);
        String s = "Hiren";
        int s2 = (String) s;

        char c1 = 'A';
        int con = c1;
        System.out.println(con);

        Find average of 4 numbers 
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        System.out.println("Average of given number is: "+((a+b+c)/3));

        find area of square
        int side = sc.nextInt();
        System.out.println("Area of square is: "+(side*side));


        Count GST and total bill  of given values
        float pencil = sc.nextFloat();
        float eraser = sc.nextFloat();
        float pen = sc.nextFloat();
        float total = pencil + eraser + pen;
        System.out.println("Enter GST Rate: ");
        float gst = sc.nextFloat();
        float bill = ((gst/100)*total);
        System.out.println("Your total bill including GST is: "+(bill+total)+"Rs.");
        sc.close();
    }
}
