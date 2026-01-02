public class math {

    public static int countLast(int n){
        int lastDigit = 0;
        int reverse=0;
        while(n>0){
         lastDigit = n%10;
         n=n/10;
         reverse=reverse*10+lastDigit;
         //System.out.println("Last digit is: " + reverse);
        }
        System.out.println("Reversed number is: " + reverse);
        return reverse; 
    }

    public static int PalindRome(int n){
        int duplicate=n;
        int reverse=0;
        while(n>0){
            int lastDigit = n%10;
            n=n/10;
            reverse=reverse*10+lastDigit;
        }
        if(reverse == duplicate){
            System.out.println("palindrom"+reverse +"="+duplicate);
        }else{
            System.out.println("not palindrom"+reverse +"!="+duplicate);
        }
return 0;
    }




    public static void main(String[] args){
//reverse number
        //countLast(7789);
 //palindrom
 PalindRome(1331);
 
 

    }
}
