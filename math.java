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

    public static int Amstrong(int n){
          int duplicate=n;
          int sum=0;
          while (n>0) {
            int lastDigit = n%10;
            sum=sum+(lastDigit*lastDigit*lastDigit);
            n=n/10;
          }
          if (duplicate==sum) {
            System.out.println("Amstrong Number"+sum);
            
          }else{
            System.out.println("Not An Amstrong Number"+sum);
          }

        return 0;
    }
    
    public static int Prime(int n){
     int count =0;
     for(int i =1; i*i<=n;i++){
        if(n%i==0){
            count++;
            if((n/i)!=i) count++;
        }
    
     }

     if(count==2){
        System.out.println("prime Number "+n);
     }else{
        System.out.println("Not prime Number "+n);
     }

        return 0;    
    }

    public static void main(String[] args){
//reverse number
        //countLast(7789);
 //palindrom
 //PalindRome(1331);
 //AmStrong number
 //Amstrong(153);
 // Prime(6);

 //insertion shorting 

 int [] a= {8,7,6,5,4,3,2,1};
 int i=0;
 int key=0;
 for(int j = 1;j<a.length;j++){
    key= a[j];
    i=j-1;

    while(i>0&&a[i]>key){
        a[i+1]=a[i];
         i=i-1;
    }
    a[i+1]=key;
 }
     for( int vale : a){
        System.out.print(vale);
     }

    }
}
