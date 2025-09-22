public class Repeated_and_Missing_Number {
    public int[] findMissingAndRepeatedValues(int[][] grid) {
        int n = grid.length;
        int size = n*n;
        int[] count = new int[size+1];
        int a=0,b=0;

        for(int i =0; i<n; i++){
            for(int j=0; j<n; j++)  {count[grid[i][j]]++;}
        }
        
        for(int i =1; i<=size; i++){
            if(count[i]==2)         {a=i;}
            else if(count[i]==0)    {b=i;}
        }
        return new int[] {a,b};
    }
    public static void main(String[] args) {
        Repeated_and_Missing_Number obj = new Repeated_and_Missing_Number();
        int[][] grid = {{1,2,2},{3,4,5},{6,7,8}};
        int[] result = obj.findMissingAndRepeatedValues(grid);
        System.out.println("Repeated Number: " + result[0]);
        System.out.println("Missing Number: " + result[1]);
    }
}
//Time Complexity: O(n^2)
//Space Complexity: O(n^2)

