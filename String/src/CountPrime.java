public class CountPrime {
    public static void main(String[] args){
        int n = 10;
        int sum = 0;
        if(n==0 || n==1)
            System.out.print("0");
        for(int i=2;i<n;i++){
            boolean isPrime = true;
            for(int k=2;k<=i;k++){
                if(i%k==0){
                    isPrime = false;
                    break;
                }
            }
            if(!isPrime){
                sum++;
            }
        }
        System.out.print(sum);
    }
}
