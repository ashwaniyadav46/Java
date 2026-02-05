import java.util.*;

public class Print {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String name = sc.nextLine();   // take input once
        //next
        //nextInt
        //nextFloat
        int a,b;
        int sum;
       
        a = sc.nextInt();
        b = sc.nextInt();
        sum = a+b;
        
        System.out.println(name);
        System.out.println(sum);
    }
}
