import java.util.Scanner;
public class App{
    private static final Scanner inputScanner = new Scanner(System.in);
    
    private static String getString(String prompt){
        System.out.println(prompt);
        
        return inputScanner.nextLine();
    }
    private static double getDouble(String prompt){
        System.out.println(prompt);
       
        
        return inputScanner.nextDouble();
    }
    public static void main(String[] args) {
        String [] options = new String[6];
        options[0] = "add";
        options[1]=  "subtract";
        options[2] = "divide";
        options[3] = "multiply";
        options [4] = "exit";
        boolean check = false;
       
        
        Calculator test = new Calculator();
        while(check == false){
            for( int i = 0; i < options.length -1; i++){
                System.out.println(options[i]);
            }
            
            String choice = getString("What would you like to do?");
            
            if(choice.equals("add")){
                double num1 = getDouble("Enter your first number");
                double num2 = getDouble("Enter your second number");
                double addNum = test.add(num1, num2);
                System.out.println("Your numbers added: " + addNum);
            }
            else if(choice.equals("subtract")){
                double num1 = getDouble("Enter your first number");
                double num2 = getDouble("Enter your second number");
                double subNum = test.subtract(num1, num2);
                System.out.println("Your numbers subtracted: "+subNum);
            }
            else if(choice.equals("multiply")){
                double num1 = getDouble("Enter your first number");
                double num2 = getDouble("Enter your second number");
                double multNum = test.multiply(num1, num2);
                System.out.println("Your numbers multiplied: "+multNum);
            }
            else if(choice.equals("divide")){
                double num1 = getDouble("Enter your first number");
                double num2 = getDouble("Enter your second number");
                double divNum = test.divide(num1, num2);
                System.out.println("Your numbers divided: " + divNum);
            }
            else if(choice.equals("exit")){
                System.out.println("Goodbye!");
                break;
            }
            
            inputScanner.nextLine();
            String conCheck = getString("Would you like to continue? (y/n)");
            
            if(conCheck.equals("y") ){
                continue;
            }
            else{
                System.out.println("Goodbye!");
                check = true;
            }

        }
        
    }

}