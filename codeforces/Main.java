import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        sc.nextLine();
        for(int i =0; i<t; i++){
        String s = sc.nextLine();
        int len = s.length();
        if(len%2 != 0){
            System.out.println("NO");
        }
        else{
            String first = s.substring(0, len/2);
            String sec = s.substring(len/2);
            if(first.equals(sec)){
                System.out.println("YES");
            }
            else{
                System.out.println("NO");
            }
        }
        }
        
    }
}