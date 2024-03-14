import java.util.*;
class matrixadd{
public static void main(String[]args)
{
System.out.println("AFNA ASSIS\n 23MCA005\n 13-2-2024");
int row,col,i,j;
Scanner sc=new Scanner(System.in);
System.out.print("enter the no of rows:");
row=sc.nextInt();
System.out.print("enter the no of columns:");
col=sc.nextInt();
int mat1[][]=new int[row][col];
int mat2[][]=new int[row][col];
int mat3[][]=new int[row][col];
System.out.print("enter the elements of matrix1:\n");
for(i=0;i<row;i++)
{
for(j=0;j<col;j++)
{
mat1[i][j]=sc.nextInt();
}
System.out.println();
}
System.out.print("enter the elements of matrix2:\n");
for(i=0;i<row;i++)
{
for(j=0;j<col;j++)
{
mat2[i][j]=sc.nextInt();
}
System.out.println();
}
for(i=0;i<row;i++)
{
for(j=0;j<col;j++)
{
mat3[i][j]=mat1[i][j]+mat2[i][j];
}
}
System.out.print("sum of matrix:\n");
for(i=0;i<row;i++)
{
for(j=0;j<col;j++)
{
System.out.print(mat3[i][j]+"\t");
}
System.out.println();
}
}
}

