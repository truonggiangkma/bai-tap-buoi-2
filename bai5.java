import java.util.Scanner;

public class bai5 {
    public static void main(String[] args) {
        int arr[] = new int[20];
        System.out.print("Nhap vao so luong phan tu cua mang: ");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        for(int i = 0 ; i < n ; i++){
            System.out.print("Nhap vao phan tu + Arr["+ i +"] :");
            arr[i] = sc.nextInt();
        }
        System.out.print("\nNhap vao vi tri so ban muon in ra : ");
        int x = sc.nextInt();
        System.out.println("phan tu o vi tri thu "+x+" la so "+arr[x] );
    }
}
