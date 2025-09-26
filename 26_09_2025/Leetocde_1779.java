class Solution {
    public int nearestValidPoint(int x, int y, int[][] points) {
        int res = -1;
        int temp = 100000;
        for(int i=0; i<points.length; i++){
            if(points[i][0]==x || points[i][1]==y){
                int val = Math.abs(points[i][0]-x) + Math.abs(points[i][1]-y);
                if(val < temp){
                    temp = val;
                    res = i;
                }
            }
        }
        return res;

    }
}