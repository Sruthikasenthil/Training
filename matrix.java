import java.util.*;
class Main {
    public static void main(String[] args) {
    Scanner in=new Scanner(System.in);
    System.out.print("Enter the row value:");
    int row=in.nextInt();
    System.out.print("Enter the column value:");
    int col=in.nextInt();
    int[][]mat=new int[row][col];
    for(int i=0;i<mat.length;i++){
        for(int j=0;j<mat[0].length;j++){
            System.out.print("enter:"+i+" "+j+" ");
            mat[i][j]=in.nextInt();
        }
    }
    for(int i=0;i<mat.length;i++){
        for( int j=0;j<mat[0].length;j++){
            System.out.print(mat[i][j]+ " ");
        }
        System.out.println();
    }
}
}