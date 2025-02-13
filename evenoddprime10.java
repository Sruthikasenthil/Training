public class Main{
    public static void main(String[] args){
        int val=123456;int oddSum=0;int evensum=0;int primesum=0;
        while (val>0)
        {
            int digit=val%10;
            val=val/10;
            if(digit%2==1){
                oddSum=oddSum+digit;
            }
            else
            {
                evenSum=evensum+digit;
                if(if prime(digit));
                primeSum=primeSum+digit;
            }
            system.out.println("oddSum"+oddSum+"\tEvenSum"+evensum+"\tprimesum"+primesum);
        }
    }
}