import java.util.*;
public class CheckPrime{

     public static void main(String []args){
        Scanner sc = new Scanner(System.in);
        for(int num=2; num<100; num++){
            int prime = isPrime(num);
            if(prime == 1){
                System.out.print(num+", ");
            }
        }
     }
     
     public static int isPrime(int val){
         int count = 0;
         for (int i=1; i<val; i++){
            if(val%i == 0){
                count++;
            }
        }
        return count;
     }
}
