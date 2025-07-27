public class EvenOddArr {
     public static void main(String args[]){

        int[] evenNumbers = new int[20];
        int[] oddNumbers = new int[20];
        int evenSum = 0;
        int oddSum = 0;

        for(int i=0; i<20; i++){
            evenNumbers[i]=(i+1)*2;
            oddNumbers[i]=(2*i)+1;

            evenSum += evenNumbers[i];
            oddSum += oddNumbers[i];
        }
        System.out.println("Sum of EvenNumbers :" +evenSum);
        System.out.println("Sum of oddNumbers :" +oddSum);
    }
    
}
