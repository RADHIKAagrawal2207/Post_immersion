package Post_immersion.Day13;
public class RotateImage {
    public void rotate(int[][] matrix) {
        trans(matrix);
        rev(matrix);
    }
    static void trans(int[][] matrix){
        for(int i=0;i<matrix.length;i++){
            for(int j=0;j<=i;j++){
                int temp=matrix[i][j];
                matrix[i][j]=matrix[j][i];
                matrix[j][i]=temp;
            }
        }
    }
    static void rev(int[][] matrix){
        for(int i=0;i<matrix.length;i++){
            int l=0;
            int r=matrix.length-1;
            while(l<r){
                int temp=matrix[i][l];
                matrix[i][l]=matrix[i][r];
                matrix[i][r]=temp;
                l++;
                r--;
            }
        }
    }
}
// Input: matrix = [[1,2,3],[4,5,6],[7,8,9]]
// Output: [[7,4,1],[8,5,2],[9,6,3]]