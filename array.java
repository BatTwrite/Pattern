import java.util.ArrayList;
import java.util.Scanner;

public class array {
    //Insert an element at a specific position in an array
    public static void main (String[]args){
//         int [] arr={1,2,3,4,5};
// //insert 10 at position 2
//         int position=1;
//         int newElement=10;
// //create a new array with size greater by 1
//         int [] newArr= new int[arr.length+1];
// //copy elements from old array to new array
//         for(int i=0;i<position;i++){
//             //copying elements before the position
//             newArr[i]=arr[i];
//            // System.out.println(newArr[i]=arr[i]);
//         }
//         //insert new element at the specified position
//         newArr[position]=newElement;
//         //copy remaining elements from old array to new array
//          for(int i=position;i<arr.length;i++){
//             newArr[i+1]=arr[i];
//          }

//          //print the new array
//          for(int value:newArr){
//             System.out.println(value);
//          }

// find a duplicate element in an array 

// String [] arr ={"car","bike","car","car","bus","train","bike","van","cycle","cycle"};

// int count=0;
// for(int i =0;i<arr.length;i++){
//         for(int j =i+1;j<arr.length;j++){
//                 if(arr[i].equals(arr[j])){
//                   count++;
//                   //System.out.println("Duplicate element Counts : "+count +"  Dcuplicate elements : "+  arr[i]);
//                 }
//         }

//         if(count>0){
//             System.out.print("Duplicate element Counts : "+count +"  Dcuplicate elements : "+  arr[i] +"\n");
//             count=0;    
//         }
// }

  //Find the reverse a string;
//  String str= "Tamil";
//     String reversedStr="";
//     for(int i=str.length()-1;i>=0;i--){
//         reversedStr+=str.charAt(i);
//     }
//     System.out.println(reversedStr);

// enter amount based on target amount
    //insert scanner class
    Scanner sc= new Scanner(System.in);
    System.out.print("Enter the target amount : ");
    int enterAmount= sc.nextInt();
    int targetAmount=1000;
    if (enterAmount== targetAmount) {
        System.out.println("Succesfully Reached The minumBalance: "+ enterAmount);
    }else if(enterAmount< targetAmount){
        while(enterAmount< targetAmount){
            System.out.println("Failed to reach the minumBalance Please enter the correct amount again: ");
            int Amount= sc.nextInt();
            if(enterAmount< targetAmount){
            enterAmount+= Amount;
        }else if(enterAmount== targetAmount){   
            break;
        }
    }
    System.out.println("Succesfully Reached The minumBalance: "+ enterAmount);
}
    else{
        System.out.println("You have exceeded the target amount");
    }
    sc.close();
}
}
