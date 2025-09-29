import java.util.*;

public class Short_Substring {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        sc.nextLine();
        for(int i =0; i<t; i++){
        String s = sc.nextLine();
        int len = s.length();
        for(int j = 0;j<len; j++){
            if(j%2 ==0 || j== len-1){
                System.out.print(s.charAt(j));
            }
        }
        System.out.println();
        }
        
    }
}
