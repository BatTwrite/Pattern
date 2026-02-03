public class arraytwo {
    
    public static void main(String[] args) {
        // basic array 
      //  int []covidCase = {123,456,789,1010};
        // basic default for loop 
       // for(int value : covidCase){
           // System.out.println(value);
       // }
        // new examples with covid cases

        String [] Name = {"USA","India","France","Germany"};

        int totalcases =0;
        int totalrecoverycases=1;
        int activecases=2;
        int [][] covidCases = {{111820082,109814428,786167},{45035393,39970918,786167},{45035393,39970918,786167},{45035393,39970918,786167} };
    
        for(int i =0; i<covidCases.length;i++){
            System.out.println(Name[i]);
            System.out.println("--------------");

            for(int j =0;j<covidCases[i].length;j++){
                System.err.print(covidCases[i][j]+"\t");
            }
            
        }
    }
}
