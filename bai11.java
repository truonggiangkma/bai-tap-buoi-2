import java.util.Scanner;

public class bai11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int rowA,colA,rowB,colB;
        do {
            System.out.print("\nMuon nhan 2 ma tran thi so cot cua ma tran A phai bang so hang cua ma tran B !\n");
            System.out.print("\nNhap vao so hang cua ma tran A : ");
            rowA = sc.nextInt();
            System.out.print("\nNhap vao so cot cua ma tran A : ");
            colA = sc.nextInt();
            System.out.print("\nNhap vao so hang cua ma tran B : ");
            rowB = sc.nextInt();
            System.out.print("\nNhap vao so cot cua ma tran B : ");
            colB = sc.nextInt();
        }while( colA != rowB );
        int a[][] = new int[rowA][colA];
        int b[][] = new int[rowB][colB];
        int c[][] = new int[rowA][colB];
        System.out.print("\n=========MA TRAN A=========");
        for (int i = 0 ; i < rowA ; i++){
            for(int j = 0 ; j < colA ; j++){
                System.out.print("\nNhap vao phan tu A["+i +","+j+"] : ");
                a[i][j] = sc.nextInt();
            }
        }
        System.out.print("\n=========MA TRAN B=========");
        for (int i = 0 ; i < rowA ; i++){
            for(int j = 0 ; j < colA ; j++){
                System.out.print("\nNhap vao phan tu B["+i +","+j+"] : ");
                b[i][j] = sc.nextInt();
            }
        }
        for (int i = 0; i < rowA; i++) {
            for (int j = 0; j < colB; j++) {
                c[i][j] = 0;
                for (int k = 0; k < colB; k++) {
                    c[i][j]  = c[i][j]  + a[i][k] * b[k][j];
                }
            }
        }
        System.out.print("\n=========MA TRAN A=========\n");
        for (int i = 0 ; i < rowA ; i++){
            for(int j = 0 ; j < colA ; j++){
                System.out.print(" "+ a[i][j]);
            }
            System.out.println("\n");
        }
        System.out.print("\n=========MA TRAN B=========\n");
        for (int i = 0 ; i < rowB ; i++){
            for(int j = 0 ; j < colB ; j++){
                System.out.print(" "+b[i][j]);
            }
            System.out.println("\n");
        }
        System.out.print("\n=========TICH CUA 2 MA TRAN=========\n");
        for (int i = 0 ; i < rowA ; i++){
            for(int j = 0 ; j < colB ; j++){
                System.out.print(" " + c[i][j]);
            }
            System.out.println("\n");
        }

    }
}
