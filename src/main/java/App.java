import java.util.Scanner;

public class App {
    public static void main(String[]args){

//        1. Nhập một số nguyên dương n (n > 0).
//                Hãy cho biết:
//        a. Có phải là số đối xứng? Ví dụ: 121, 12321, ...
//        b. Có phải là số chính phương? Ví dụ: 4, 9, 16, ... bài 2 de, bài 4-5

        Scanner sc= new Scanner(System.in);
        System.out.print("Nhập n: ");
        int n = sc.nextInt();
        boolean re = EntryPoint.isPrime(n);

        System.out.println(re);
//        boolean result= EntryPoint.isReverseNumber(n);
//        boolean result1 = EntryPoint.isSquareNumber(n);
//
//        if (result) {
//           System.out.println("Đây là số đảo ngược: " +n);
//        }
//        else {
//            System.out.println("Không phải số đảo ngược: " + n);
//        }
//
//        if (result1) {
//            System.out.println("Đây là số chính phương: " +n);
//        }
//        else {
//            System.out.println("Không phải số chính phương: " + n);
//        }
////        Nhập một số nguyên dương n. Tính:
////        S = 1*2*...*n = n!
//       long nGiaithua= EntryPoint.sumZ(n);
//
//        System.out.format("%d giai thừa. \n", nGiaithua);
//
////        Nhập một số nguyên dương n. Tính:
////        S = 1! + 2! + ... + n!
//
//        long SumGiaiThua = EntryPoint.sumZn(n);
//
//        System.out.format("%d Total giai thừa. \n", SumGiaiThua);


    Long totalPrice= EntryPoint.sumPrime(n);
        System.out.format("%d Tổng số nguyên tố. \n", totalPrice);







//        Scanner sc= new Scanner(System.in);
//        System.out.print("Nhập n: ");
//        int n = sc.nextInt();
//
//        int s2a = sum2a(n);
//        System.out.format("Sum (2a) = %d\n", s2a);
//
//        if(isPrimeNumber(n)){
//            System.out.format("%d là số nguyên tố. \n", n);
//        } else {
//            System.out.format("%d Không là số nguyên tố. \n", n);
//        }
//
//    }
//    public static int sum2a (int n){
//        int s=0;
//        for (int i=1; i<=n; i++)
//        {
//            s+=i;
//         }
//        return s;
//    }
//
//    public static boolean isPrimeNumber (int n){
//        boolean ret=true;
//        for (int i = 2; i<n;i++)
//        {
//            if(n%i==0){
//                ret=false;
//                break;
//            }
//        }
//        return ret;

    }
}
