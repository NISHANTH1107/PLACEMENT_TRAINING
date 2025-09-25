// Online Java Compiler
// Use this editor to write, compile and run your Java code online
import java.util.*;
class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a Number :");
        int n = sc.nextInt();
        int pass = 0, maxCapacity = 0;
        for(int i=0; i<n; i++){
            int exit = sc.nextInt();
            int enter = sc.nextInt();
            
            pass -= exit;
            pass += enter;
            
            maxCapacity = Math.max(maxCapacity, pass);
        }
        
        System.out.println(maxCapacity);
        sc.close();
    }
}