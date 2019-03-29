/**
 * @ClassName HasPath
 * @Description
 * @Author HAHA
 * @Version V1.0.0
 * @Date 2019/3/29 9:48
 */
package sword2offer;

public class HasPath {
    public boolean hasPath(char[] matrix, int rows, int cols, char[] str) {
        if(matrix==null||rows<1||cols<1||str==null){
            return false;
        }
        boolean[] flag=new boolean[matrix.length];
        for(int i=0;i<rows;i++){
            for(int j=0;j<cols;j++){
                //循环遍历二维数组，找到起点等于str第一个元素的值，再递归判断四周是否有符合条件的----回溯法
                if(judge(matrix,i,j,rows,cols,flag,str,0)){
                    return true;
                }
            }
        }
        return false;
    }

    private boolean judge(char[] matrix, int i, int j, int rows, int cols, boolean[] flag, char[] str, int k) {
        int index=i*cols+j;
        if(i<0 || j<0 || i>=rows || j>=cols || matrix[index] != str[k] || flag[index] == true){
            return false;
        }
        if(k==str.length-1){
            return true;
        }
        flag[index] =true;
        if(judge(matrix,i-1,j,rows,cols,flag,str,k+1)||
                judge(matrix,i+1,j,rows,cols,flag,str,k+1) ||
                judge(matrix,i,j-1,rows,cols,flag,str,k+1) ||
                judge(matrix,i,j+1,rows,cols,flag,str,k+1)){
            return true;
        }
        flag[index] = false;
        return false;



    }
}
