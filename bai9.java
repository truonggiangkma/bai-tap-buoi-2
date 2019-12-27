import java.util.Scanner;

public class bai9 {
    public static void main(String[] args) {
        int col ,row;
        Scanner sc = new Scanner(System.in);
        int arr[][] = new int[3][4];
        for(int i = 0 ; i < 3 ; i++){
            for(int j = 0 ; j < 4 ; j++){
                System.out.print("Nhap vao phan tu Arr["+i+","+j+"] : ");
                arr[i][j] = sc.nextInt();
            }
        }
        boolean snt;
        System.out.print("Cac so nguyen to trong mang la : ");
        for(int i = 0 ; i < 3 ; i++){
            for(int j = 0 ; j < 4 ; j++){
                snt = true;
                for(int q = 2 ; q < arr[i][j] ; q++){
                    if (arr[i][j] % q == 0) {
                        snt = false;
                    }
                }
                if(arr[i][j] >= 2 && snt == true){
                    System.out.print(" "+arr[i][j]);
                }
            }
        }
    }
}
