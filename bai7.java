import java.util.Scanner;

public class bai7 {
    public static void main(String[] args) {
        int arr[] = new int[20];
        System.out.print("Nhap so phan tu cua mang : ");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for(int  i = 0 ; i < n ; i++){
            System.out.print("Nhap phan tu Arr[" + i + "] : ");
            arr[i] = sc.nextInt();
        }
        int max = arr[0],sttMax = 0;
        for(int  i = 1 ; i < n ; i++){
            if(arr[i] > max){
                max = arr[i];
                sttMax = i;
            }
        }
        int min = arr[0],sttMin = 0;
        for(int  j = 1 ; j < n ; j++){
            if(arr[j] < min){
                min = arr[j];
                sttMin = j;
            }
        }
        System.out.println("Max = " + max +" o vi tri thu "+sttMax );
        System.out.println("Min = " + min +" o vi tri thu "+sttMin );
    }
}
