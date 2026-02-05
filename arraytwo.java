import java.util.Scanner;

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
        
        // Filter covid cases based on the country name,Total cases,RecoveryCases,Active cases.
        
        System.out.println("Filter covid case Data ");
        System.out.println("1. Name");
        System.out.println("2. Total Cases");
        System.out.println("3. Recoverd Cases");
        System.out.println("4. Active Cases");

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your choise");
        int choise = scanner.nextInt();


        switch (choise) {
            case 1:
                scanner.nextLine();
                System.out.println("Enter name of the country");
                String countryName = scanner.nextLine();
                  int idx = -1;
                  for(int i =0;i<Name.length;i++){
                    if(countryName.equalsIgnoreCase(Name[i])){
                        idx=i;
                        break;
                    }
                  }
                  if(idx==-1){
                    System.out.println("Sorry Country Not Found"); 
                  }else{
                    for(int element : covidCases[idx]){
                        System.out.println(element+"\t");
                    }
                    System.out.println();
                  }

                break;
            case 2:
                System.out.println("Total Cases ");
                System.out.println(".......................");
                for(int i =0; i<covidCases.length;i++){
            System.out.println(Name[i]);
            System.out.println("--------------");
                System.out.print(covidCases[i][totalcases]+"\t");
               

                System.out.println();
            }
                
                break;
            case 3:
            System.out.println("Total Recovered Cases");
                System.out.println(".......................");
                for(int i =0; i<covidCases.length;i++){
            System.out.println(Name[i]);
            System.out.println("--------------");
                System.out.print(covidCases[i][totalrecoverycases]+"\t");
               
                
                System.out.println();
            }    
            
                break;
            case 4:
                System.out.println("Total Active Cases ");
                System.out.println(".......................");
                for(int i =0; i<covidCases.length;i++){
            System.out.println(Name[i]);
            System.out.println("--------------");
                System.out.print(covidCases[i][activecases]+"\t");
               
                
                System.out.println();
            }
                
                break;        
            default:
                break;
        }
        scanner.close();





    }
}
