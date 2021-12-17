class Solution {
    public int maximalSquare(char[][] matrix) {
        int r = matrix.length;
        int c = matrix[0].length;
        int maxarea = 0;
        int arr[][] = new int[r][c];
        for(int i=0;i<r;i++)
        {
            arr[i][c-1] = (int)matrix[i][c-1] - 48;
            if(arr[i][c-1] == 1)
                maxarea = 1;
        }
        for(int i=0;i<c;i++)
        {
            arr[r-1][i] = (int)matrix[r-1][i] - 48;
            if(arr[r-1][i] == 1)
                maxarea = 1;
        }
        for(int i=r-2;i>=0;i--)
        {
            for(int j=c-2;j>=0;j--)
            {
                if(matrix[i][j] == '1')
                {
                    arr[i][j] = Math.min(arr[i+1][j] , Math.min(arr[i][j+1],arr[i+1][j+1])) + 1;
                }
                else
                {
                    arr[i][j] = 0;
                }
                if(arr[i][j] > maxarea)
                    maxarea = arr[i][j];
            }
        }
        for(int i=0;i<r;i++)
        System.out.println(Arrays.toString(arr[i]));
        return maxarea*maxarea;
    }
}