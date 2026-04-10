public class lc1518 {
    public static int numWaterBottles(int numBottles, int numExchange) {
        int total=numBottles;
        while(numBottles>=numExchange){
            int empty=numBottles/numExchange;
            total+=empty;
            numBottles=empty+numBottles%numExchange;
        }
        return total;
    }  
    public static void main(String[] args) {
        int numBottles=9;
        int numExchange=3;
        System.out.println(numWaterBottles(numBottles, numExchange));
    } 

}