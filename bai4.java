import java.util.Scanner;

public class bai4 {
    public static void main(String[] args) {
        int arr[] = new int[20];
        int dem = 0;
        System.out.print("Nhap vao so luong phan tu cua mang: ");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        for(int i = 0 ; i < n ; i++){
            System.out.print("Nhap vao phan tu + Arr["+ i +"] :");
            arr[i] = sc.nextInt();
        }
        System.out.println("\nNhap vao so muon kiem tra : ");
        int x = sc.nextInt();
        boolean kt;
        kt = true;
        for(int i = 0 ; i < n ; i++){
            if(arr[i] == x){
                dem++;
            }
            else
                continue;
        }
        if(dem != 0){
            System.out.println("So " + x +" co trong mang . xuat hien " +dem+" lan");
        }
        else
            System.out.println("So " + x + " khong ton tai trong mang");
    }
}