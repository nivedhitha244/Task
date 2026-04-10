public class lc2600 {
    public static int kItemsWithMaximumSum(int numOnes, int numZeros, int numNegOnes, int k) {
        int sum=0;
        if(k<=numOnes){
            sum=k;
        }
        else if(k>numOnes && k<=numOnes+numZeros){
            sum=numOnes;
        }
        else{
            sum=numOnes-(k-numOnes-numZeros);
        }
        return sum;
    }  
    public static void main(String[] args) {
        int numOnes=3;
        int numZeros=2;
        int numNegOnes=0;
        int k=2;
        System.out.println(kItemsWithMaximumSum(numOnes, numZeros, numNegOnes, k));
    }
    
}