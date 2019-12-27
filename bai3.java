import java.util.Scanner;

import static java.lang.Math.sqrt;

public class bai3 {
    public static void main(String[] args) {
        int arr[] = new int[20];
        boolean snt;
        System.out.print("Nhap vao so luong phan tu cua mang: ");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for(int i = 0 ; i < n ; i++){
            System.out.print("Nhap vao phan tu + Arr["+ i +"] :");
            arr[i] = sc.nextInt();
        }
        System.out.println("Mang so nguyen to trong day la : ");
        for(int i = 0 ; i < n ; i++){
            snt = true;
            for(int j = 2 ; j < arr[i] ; j++){
                if (arr[i] % j == 0) {
                    snt = false;
                }
            }
            if(arr[i] >= 2 && snt == true){
                System.out.print(" "+arr[i]);
            }
        }
    }
}
