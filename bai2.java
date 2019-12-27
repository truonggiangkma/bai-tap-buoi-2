import java.util.Scanner;

public class bai2 {
    public static void main(String[] args) {
        int arr[] = new int[20];
        int sum = 0;
        System.out.print("Nhap vao so luong phan tu cua mang: ");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        for(int i = 0 ; i < n ; i++){
            System.out.print("Nhap vao phan tu + Arr["+ i +"] :");
            arr[i] = sc.nextInt();
        }
        for(int i = 0 ; i < n ; i++){
            sum += arr[i];
        }
        System.out.println("Tong cua day so tren la: "+ sum);

    }
}
