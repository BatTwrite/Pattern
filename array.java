public class array {
    //Insert an element at a specific position in an array
    public static void main (String[]args){
        int [] arr={1,2,3,4,5};
//insert 10 at position 2
        int position=1;
        int newElement=10;
//create a new array with size greater by 1
        int [] newArr= new int[arr.length+1];
//copy elements from old array to new array
        for(int i=0;i<position;i++){
            //copying elements before the position
            newArr[i]=arr[i];
           // System.out.println(newArr[i]=arr[i]);
        }
        //insert new element at the specified position
        newArr[position]=newElement;
        //copy remaining elements from old array to new array
         for(int i=position;i<arr.length;i++){
            newArr[i+1]=arr[i];
         }

         //print the new array
         for(int value:newArr){
            System.out.println(value);
         }


    }
}
