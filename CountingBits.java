import java.util.Scanner;

public class CountingBits {
    public void countingBits(int n){
        int[] ans=new int[n+1];
        ans[0]=0;
        for(int i=1;i<=n;i++){
            if(i%2==0){
                ans[i]=ans[i/2];
            }
            else{
                ans[i]=ans[i-1]+1;
            }
        }
        for(int i=0;i<=n;i++){
            System.out.print(ans[i]+" ");
        }
    }
    public static void main(String[] args) {
        @SuppressWarnings("resource")
        Scanner sc=new Scanner(System.in);
        CountingBits cd =new CountingBits();
        System.out.println("Enter the value of n : ");
        int n=sc.nextInt();
        cd.countingBits(n);
    }
}
