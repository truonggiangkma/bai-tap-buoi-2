import java.util.Scanner;

public class bai1 {
    public static void main(String[] args) {
        int arr[] = new int[20];
        System.out.print("Nhap vao so luong phan tu cua mang: ");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        for(int i = 0 ; i < n ; i++){
            System.out.print("Nhap vao phan tu + Arr["+ i +"] :");
            arr[i] = sc.nextInt();
        }
        System.out.println("XONG !");
        System.out.println(("1:Sap xep theo chieu tang dan."));
        System.out.println(("2:Sap xep theo chieu giam dan."));
        System.out.print("Moi ban chon : ");
        int value = sc.nextInt();
        switch (value){
            case 1: {
                int tg;
                for (int i = 0; i < n - 1; i++) {
                    for (int j = i + 1; j < n; j++) {
                        if (arr[i] > arr[j]) {
                            tg = arr[i];
                            arr[i] = arr[j];
                            arr[j] = tg;
                        }
                    }
                }
                System.out.print("Mang tang dan: ");
                for (int i = 0; i < n; i++) {
                    System.out.print(" "+arr[i]);
                }
                break;
            }
            case 2: {
                for (int i = 0; i < n - 1; i++) {
                    for (int j = i + 1; j < n; j++) {
                        if (arr[i] < arr[j]) {
                            int tg = arr[i];
                            arr[i] = arr[j];
                            arr[j] = tg;
                        }
                    }
                }
                System.out.print("Mang giam dan: ");
                for (int i = 0; i < n; i++) {
                    System.out.print(" "+arr[i]);
                }
                break;
            }
        }
    }
}
