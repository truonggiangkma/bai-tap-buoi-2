import java.util.Scanner;

public class bai10 {
    public static void main(String[] args) {
        int arr[][] = new int[3][3];
        Scanner sc = new Scanner(System.in);
        for(int i = 0 ; i < 3 ; i++){
            for(int j = 0 ; j < 3 ; j++){
                System.out.print("Nhap vao phan tu Arr["+i+","+j+"] (>0) : ");
                arr[i][j] = sc.nextInt();
            }
        }
        int tg;
        for(int i = 0 ; i < 3 ; i++){
            for(int j = 0 ; j < 2 ; j++){
                for(int q = j + 1 ; q < 3 ; q++){
                    if(arr[i][j] > arr[i][q]){
                        tg = arr[i][j];
                        arr[i][j] = arr[i][q];
                        arr[i][q] = tg;
                    }
                }
            }
        }
        System.out.println("Sap xep theo thu tu tang dan : ");
        for(int i = 0 ; i < 3 ; i++){
            for(int j = 0 ; j < 3; j++){
                System.out.print(" " + arr[i][j]);
            }
        }
    }
}
