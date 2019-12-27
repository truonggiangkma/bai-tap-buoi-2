import java.util.Scanner;

public class bai8 {
    public static void main(String[] args) {
        int arr[] = new int[50];
        System.out.print("Nhap so phan tu cua day Fibonacci : ");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        arr[0] = 0; arr[1] = 1;
        for(int i = 2 ; i < n ; i++ ){
            arr[i] = arr[i-1] + arr[i-2];
        }
        System.out.print("\nDay Fibonacci voi " + n + " phan tu la : ");
        for(int  i = 0 ; i < n ; i++){
            System.out.print(" " + arr[i]);
        }

    }
}
