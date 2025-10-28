public class Pattern {

    public void print(int n){
        
     for(int i =1;i<=n;i++){
        
        for(int j=1;j<=n;j++){
            System.out.print("* ");
        }
        System.out.println("  ");
     }

    }
    public void Triangle(int n){
        for(int i=0;i<n;i++){
            for(int j=0;j<=i;j++){
                System.out.print("* ");
            }
            System.out.println( );
        }
    }
    public void NumberTriangle(int n){
        for(int i =1;i<=n;i++){
            for(int j=1;j<=i;j++){
                System.out.print(j + " ");
            }
            System.out.println( );
        }
    }
public void NumberTriangle2(int n){
    for(int i =1;i<=n;i++){
            for(int j=1;j<=i;j++){
                System.out.print(i+" ");
            }
            System.out.println(" ");
        }
}
public void NumberTriangleReverse(int n){
//   for(int i =n;i>=1;i--){
//     for(int j=1;j<=i;j++){
//         System.out.print("* ");
//     }
//     System.out.println( );
//   }

for(int i =1;i<=n;i++){
    for(int j=1;j<=n-i+1;j++){

        System.out.print(j + " ");
    }
    System.out.println();
}
}
public void Stickypattern(int n){
    for(int i =0;i<n;i++){
        //space 
        for(int j=0;j<n-i-1;j++){
            System.out.print(" ");
        }
        //stars
        for(int j=0;j<2*i+1;j++){
            System.out.print("*");
        }
        //space
        for(int j=0;j<n-i-1;j++){
            System.out.print(" ");
        }

        System.out.println();
    }
}

public void StickypatternReverse(int n){
    for(int i =0;i<n;i++){
        //space 
        for(int j=0;j<i;j++){
            System.out.print(" ");
        }
        //stars
        for(int j=0;j<2*n-(2*i+1);j++){
            System.out.print("*");
        }
        //space
        for(int j=0;j<i;j++){
            System.out.print(" ");
        }

        System.out.println();
    }
}

//symatrical pattern 
 public void patter10(int n){
   
    for(int i = 1; i <= 2*n-1; i++){
        int stars = i <= n ? i : 2*n - i;
        for(int j = 1; j <= stars; j++){
            System.out.print("* ");
        }
        System.out.println();
    }

    }

// 101 pattern 

public void pattern11(int n){
    int start =1;
    for(int i=0;i<n;i++){
if(i%2==0){
    start=1;
}else{
    start=0;
}
for(int j=0;j<=i;j++){
    System.out.print(start);
    start = (start == 0) ? 1 : 0;
         
}
        System.out.println();
    }
}
public void pattern12(int n){
    
    for(int i=1;i<=n;i++){

        // numbers 
        for(int j=1;j<=i;j++){
            System.out.print(j+" ");
        }
        //spaces
        int  space= 2*(n-1);        
        for(int j =i;j<=space;j++){
            System.out.print(" ");
        }
        //numbers
        for(int j=i;j>=1;j--){
            System.out.print(j+" ");
        }
    

         System.out.println();
    
    }
 }
public void pattern13(int n ){
    int num =1;
    for(int i=1;i<=n;i++){
        for(int j=1;j<=i;j++){
            System.out.print(num+" ");
            num++;

        }
        System.out.println();
    }
}
public void pattern14(int n){
    for(int i=1;i<=n;i++){
        for(char ch = 'A'; ch >'A' + i; ch++){
            System.out.print(ch + " ");
        }
        System.out.println();
    }
}
public void pattern15(int n){
    for(int i=0;i<n;i++){
        for(char ch = 'A'; ch <='A' + (n-i-1); ch++){
            System.out.print(ch + " ");
        }
        System.out.println();
    }
}
public void pattern16(int n){
    for(int i=0;i<n;i++){
        char ch= (char) ('A'+i);
        for(int j=0;j<=i;j++){
            System.out.print(ch + " ");
        }
        System.out.println( );
    }
}

public void pattern17(int n){
    for(int i=0;i<n;i++){
        //space
        for(int j=0;j<n-i-1;j++){
            System.out.print(" ");
        }
        //character
        char ch= (char)'A';
        int breakpoint= (2*i+1)/2;
        for(int j=1;j<=2*i+1;j++){
            System.out.print(ch + " ");
            if(j <= breakpoint) 
                ch++;
            else
            ch--;

        }
         //space
        for(int j=0;j<n-i-1;j++){
            System.out.print(" ");
        }

        System.out.println( );
    }
}
public void pattern18(int n){
   for(int i=1;i<=n;i++){
        //pattern
for(char ch = (char)('A' +n- 1); ch >= ('A'+ n-i) ; ch--){
    System.out.print(ch+ " ");
} 
       System.out.println( );
    }

}

public void pattern19(int n){

    int inis=0;
    for(int i=1;i<=n;i++){
        //stars
         for(int j=1;j<= n-i+1;j++){
            System.out.print("*");
        }
        //spaces
        for(int j=0;j<inis;j++){
            System.out.print(" ");
        }
        //stars
        for(int j=1;j<= n-i+1;j++){
            System.out.print("*");
        }
        inis += 2; // increase the space count by 2 for the next row

        System.out.println();
        }

        inis=2*(n-1);
        for(int i=1;i<=n;i++){
        //stars
         for(int j=1;j<=i;j++){
            System.out.print("*");
        }
        //spaces
        for(int j=0;j<inis;j++){
            System.out.print(" ");
        }
        //stars
        for(int j=1;j<=i;j++){
            System.out.print("*");
        }
        inis -= 2; // increase the space count by 2 for the next row

        System.out.println();
        }
        
    
    }

public void pattern20(int n ){
    
    int spaces= 2*(n-1);
    for(int i=1;i<=2*n-1;i++){
         int stars= i>n? 2*n-i:i; 
         // stars
         for(int j=1;j<=stars;j++){
            System.out.print("*");
         }
         //spaces
         for(int j=1;j<=spaces;j++){
            System.out.print(" ");
         }

            // stars
         for(int j=1;j<=stars;j++){
            System.out.print("*");
         }

         System.out.println();

         if( i<n){ spaces-=2;}else{spaces +=2; }

    }
}
public void pattern21(int n ){
    for(int i =0;i<n;i++){
        for(int j= 0;j<n;j++){
            if(i==0|| j==0 || i==n-1 || j==n-1){
                System.out.print("*");
            }else{
                System.out.print(" ");
            }
        }
        System.out.println();
    }
}
public void patter22(int n){
    for(int i =0;i<2*n-1;i++){
        for(int j =0;j<2*n-1;j++){
            int top = i;
            int left =j;
            int right = (2*n-2)-j;
            int down = (2*n-2) -i;
            System.out.print((n- Math.min(Math.min(top,down),Math.min(left,right))));
        }
        System.out.println();
    }
}

public void pattern23(int n){
    long factorial=1;
    if(n<0){
        System.out.println(1);
    }else {
        for(int i=1;i<=n;i++){
            factorial *= i;
        }
        System.out.println(factorial);
    }
}
public static void main (String[] args) {
        java.util.Scanner scanner = new java.util.Scanner(System.in);
        int t = scanner.nextInt();
        for(int i = 0; i < t; i++) {
            int n = scanner.nextInt();
            Pattern pattern = new Pattern();

            //pattern.Triangle(n);
            //pattern.NumberTriangle(n);
            //pattern.NumberTriangle2(n);
            //pattern.NumberTriangleReverse(n);
            //pattern.Stickypattern(n);
            //pattern.StickypatternReverse(n);
            //pattern.patter10(n);
            //pattern.pattern11(n);
            //pattern.pattern12(n);
            //pattern.pattern13(n);
            //pattern.pattern14(n);
            //pattern.pattern15(n);
            //pattern.pattern16(n);
            //pattern.pattern17(n);
            //pattern.pattern18(n);
            //pattern.pattern19(n);
            //pattern.pattern20(n);
            //pattern.pattern21(n);
            //pattern.patter22(n);
            pattern.pattern23(n);
        }
    }

}