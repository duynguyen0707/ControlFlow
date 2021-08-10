import java.security.PublicKey;

public class EntryPoint {

    public static boolean isReverseNumber (int n){
        boolean result;
        int reverNumber=0;
        int orgNumber=n;
          while (n>0){
            reverNumber=reverNumber*10 +n%10;
            n/=10;
        }

        if (reverNumber==orgNumber){
            result= true;
        }
        else {
            result= false;
        }

        return result;
    }

    public static boolean isSquareNumber (double n){
        boolean result = true;
        double sqr = Math.sqrt(n);
        double sqr1=Math.floor(sqr);
        if(sqr-sqr1==0){
        return result=true;
        }
        else {
            return result = false;
        }
    }

    //   Nhập một số nguyên dương n. Tính:
    //        S = 1*2*...*n = n!

    public static long sumZ (long n){
           long sub=1;
        for (long i = 1; i <=n ; i++) {
            sub=sub*i;
         }
        return sub;
    }

    //   S = 1! + 2! + ... + n!
    public static long sumZn (long n){
        long sub=1;
        long sum=0;
        for (long i = 1; i <=n ; i++) {
            sub=sub*i;
            sum=sum+sub;
        }
        return sum;
    }

    //Tính tổng các số nguyên tố nhỏ hơn n (0 < n < 50)

    public static boolean isPrime (int n){
        boolean result=true;
        int sqr=(int)Math.sqrt(n);
        if (n<2){
          return false;
        }

        for (int i = 2; i <=sqr ; i++) {
            if (n%i==0){
               result=false;
              break;
            }
            else {
               result=true;
            }
        }
    return result;
    }

    public static long sumPrime (long n){
        long sum=0;
     if (n<=0){
         System.out.println("Please enter valid number");
     }
     if (n>50){
         System.out.println("Please enter valid number > 50");
     }
     else {
         for (int i = 1; i <n ; i++) {
             boolean re = isPrime(i);
             if (re) {
                 sum=sum+i;

             }
             else {
                 continue;
             }
         }


         }
        return sum;
     }


    }

