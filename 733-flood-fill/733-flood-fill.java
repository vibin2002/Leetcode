class Solution {
    public int[][] floodFill(int[][] image, int sr, int sc, int newColor) {
        int color = image[sr][sc];
        if(color != newColor){
            traverse(image,sr,sc,color,newColor);
        }
        return image;
    }
    
    public void traverse(int[][] image,int i,int j,int color,int newColor){
        if(image[i][j] == color){
            image[i][j] = newColor;
            if(i-1 >= 0){
                traverse(image,i-1,j,color,newColor);
            }
            if(i+1 < image.length){
                traverse(image,i+1,j,color,newColor);
            }
            if(j-1 >= 0){
                traverse(image,i,j-1,color,newColor);
            }
            if(j+1 < image[0].length){
                traverse(image,i,j+1,color,newColor);
            }
        }
    }
}