import java.util.Locale;
import java.util.Random;
import java.util.Scanner;

public class Lesson02 {  

    public static void main(String[] args) throws InterruptedException
    {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        boolean isActive = false;

   
    // -----------------------------------------------------------------------------
    // (1) Read User Input
    if (isActive){
        System.out.print("Insert outside Tempereratue:");
        double temperature = scanner.nextDouble();
        System.out.println("\n Outside temperature is:" + temperature+"\n");
    }
    
    // -----------------------------------------------------------------------------
    // (2) Arithmetic operators

    /* 
            a+b Addition        
            a-b Subtraction
            a*b Multiplication
            a/b Division
            a%b Modulus (remainder of division a/b)

            a += b  short for a=a+b
            a -= b  short for a=a-b
            a *= b  short for a=a*b
            a /= b  short for a=a/b
            a %= b  short for a=a%b

            a++  short for a+=1 as short for a=a+1
            a-- short for a-=1 as short for a=a-1

            note: if a or b are integer then double z=a/b gives integer value
        */
        if (isActive){
            int a=10;
            int b=3;
            double z;

            System.out.println("Modulus a%b: "+ a%b + "\n");

            a/=b;
            System.out.println("Division a/=b: " + a + "\n");
        }

    // -----------------------------------------------------------------------------
    // (3) If-Else-Statements   
        if (isActive) {
            System.out.print("Enter your name: ");
            String name = scanner.nextLine();

            if (name.isEmpty()){
                System.out.println("You haven't entered a name");
            }

            int age = 0;

            if (age>=18){
                System.out.println("You are an adult ");
            }
            else if (age<0){
                System.out.println("You haven't been born yet.");
            }
            else if (age ==0){
                System.out.println("You are a baby.");
            }
            else {
                System.out.println("You are a child.");
            }

        }

    // -----------------------------------------------------------------------------
    // (4) Random numbers
        if (isActive){
            int rInteger = random.nextInt(1,7); // gives integer numbers between 1 and 6, bound is not included
            double rDouble =random.nextDouble(); // gives random double numbers between 0 and 1
            boolean rBoolean =random.nextBoolean();
            System.out.println(rInteger);
            System.out.println(rDouble);
            System.out.println(rBoolean);

            int i=0;
            while(i<10){
                i++;
                rDouble =random.nextDouble(); 
                rBoolean=random.nextBoolean();
                System.out.println(i+ "," + rDouble +","+rBoolean);
            }
        }

    // -----------------------------------------------------------------------------
    // (5) Math functions and constants
        if (isActive){
            System.out.println(Math.PI);
            System.out.println(Math.E);

            double result;
            result =Math.pow(2,10);
            result =Math.sqrt(24);
            result =Math.abs(-2);
            result =Math.round(2.3423413);
            result =Math.ceil(2.6573);
            result =Math.floor(2.67756);
            result =Math.min(10,20);
            result =Math.max(10,20);
            System.out.println(result);
        }

    // -----------------------------------------------------------------------------
    // (6) Formatted printing
        /*  https://springframework.guru/java-output-printf-method/
            %[flags][width][.precision][specifier-character]
                flags: + - gives plus sign if positive number; , - adds 1000er separator
                width: 0 - zero padding, positive number: width at left padding, negative number: width at right padding
                specifier-characters: %s - String, %c - Character %i - Integer, %f - Double, %b - Boolean
        */
        if (isActive){
            System.out.print("Radius:");
            double radius = scanner.nextDouble();

            double area = Math.PI*Math.pow(radius,2);
            System.out.printf(Locale.UK,"Area of circle with radius %.2f cm is %3.1f cm^2,\n", radius, area);
            System.out.printf(Locale.UK,"Area of circle with radius %.2e cm is %3.1e cm^2,\n", radius, area);

        }

    // -----------------------------------------------------------------------------
    // (7) Sting methods
        if (isActive){
            String Username = "   Tino Fuchs  ";
            int length = Username.length();
            int index =Username.indexOf("i"); // first index of occurrance starting counting with 0 
            int lastIndex =Username.lastIndexOf("i"); // last index of occurrance
            System.out.println(Username);
            System.out.println(index);
            System.out.println(lastIndex);

            String usernameUC=Username.toUpperCase();
            String usernameLC=Username.toLowerCase();
            String usernameTrim=Username.trim();  // removes leading and tailing space characters
            String usernameReplace=Username.replace("o", "a");

            System.out.println(length);
            System.out.println(usernameUC);
            System.out.println(usernameLC);     
            System.out.println(usernameTrim);   
            System.out.println(usernameReplace);  
            
            if (usernameTrim.equals("Tino Fuchs")){
                System.out.println("Your are the master himself");
            }
        

            // Substring method ----------------------

            String firstName=usernameTrim.substring(0,4);
            System.out.printf("First name: %s\n",firstName);

            String email, accountName, domain;
            System.out.print("Enter your email address:");
            scanner.nextLine();
            email = scanner.nextLine();

            if (email.contains("@")){
                accountName = email.substring(0,email.indexOf("@"));
                domain = email.substring(email.indexOf("@")+1);
                System.out.printf("Account: %s   Domain: %s\n", accountName, domain);
        
            }
            else {
                System.out.println("Not a valid email");
            }
        }

    // -----------------------------------------------------------------------------
    // EXAMPLE : Weight conversion
        if (isActive) {
            double weight, newweight;
            int option;

            System.out.println("Weight conversion program");
            System.out.println("Option 1: lbs to kg");
            System.out.println("Option 2: kg to lbs");
            System.out.print("Enter your choice:");
            option = scanner.nextInt();

            if (option == 1){
                System.out.print("Weight in lbs: ");
                weight= scanner.nextDouble();
                newweight=weight*0.4535;
                System.out.printf(Locale.UK,"Weight in kg: %.2f\n",newweight);
            }
            else if (option == 2){
                System.out.print("Weight in kg: ");
                scanner.nextLine();
                weight= scanner.nextDouble();
                newweight=weight*1/0.4535;
                System.out.printf(Locale.UK,"Weight in lbs: %.2f\n",newweight);    
            }
            else {
                System.out.println("Not a valid choice");
            }
        }

    // -----------------------------------------------------------------------------
    // (8) Ternary operator (as alternative to if-else statement)
        /* variable = (condition) ? ifTrue : ifFalse */
  
        if (isActive) {
            int score = 10;

            String scoreMessage =(score >=10) ? "You are a winner" : "You are a looser";
            System.out.println(scoreMessage);
            String evenOrOdd =(score%2 ==0)? "Even number": "Odd number";
            System.out.println(evenOrOdd);
        }
        
    // -----------------------------------------------------------------------------
    // EXAMPLE: Celsius to Farenheit converter
        if (isActive) {
            double temp, newtemp;
            String unit;
            scanner.nextLine();

            System.out.print("Temperature value:");
            temp = scanner.nextDouble();
            System.out.print("to Farenheit (F) or Cenlsius (C): ");
            unit = scanner.next().toUpperCase();

            newtemp =  (unit.equals("C")) ? (temp-32)*5/9 : temp*9/5+32;
            System.out.printf("Temperature in deg %s: %.1f \n", unit, newtemp);
        
        }
        
    // -----------------------------------------------------------------------------
    // (9) Enhanced switch statement
        if (isActive){

            String day;
            System.out.print("Enter a weekday: ");
            day = scanner.nextLine();

            switch (day){
            case "Monday" -> System.out.println("It's a weekday. 😔");
            case "Tuesday" -> System.out.println("It's a weekday. 😔");
            case "Wednesday" -> System.out.println("It's a weekday. 😔");
            case "Thursday" -> System.out.println("It's a weekday. 😔");
            case "Friday" -> System.out.println("It's a weekday. 😔");
            case "Saturday" -> System.out.println("It's the weekend. 😊");
            case "Sunday" -> System.out.println("It's the weekend. 😊");
                default -> System.out.printf("%s is not a valid day \n", day);
            }

            // more compact variant
            switch (day){
                case "Monday","Tuesday","Wednesday","Thursday","Friday" -> System.out.println("It's a weekday. 😔");
                case "Saturday", "Sunday" -> System.out.println("It's the weekend. 😊");
                default -> System.out.printf("%s is not a valid day \n", day);
            }
        }
    // -----------------------------------------------------------------------------
    // EXAMPLE: Calculator

        if (isActive){
            double num1, num2, result=0;
            char operator;
            boolean validOperation = true;

            System.out.print("First number: ");
            num1 = scanner.nextDouble();
            System.out.print("Operator (+, -,  *,  / ): ");
            operator = scanner.next().charAt(0);
            System.out.print("Second number: ");
            num2 = scanner.nextDouble();

            switch (operator){
                case '+' -> result = num1+num2;
                case '-' -> result = num1-num2;
                case '*' -> result = num1*num2;
                case '/' -> { 
                        if (num2 == 0){
                            validOperation=false;
                            System.out.println("Division by Zero not allowed");
                        }
                        else { 
                            result = num1/num2;}
                    }
                case '^' -> result = Math.pow(num1, num2);
                default -> {
                    System.out.println("Operator not valid");
                    validOperation=false;
                }
             }

            if (validOperation) {
                System.out.printf("%f %s %f = %f\n", num1,operator, num2, result);
            }
        }


    // -----------------------------------------------------------------------------
    // (10) Logical operators    
        /*  
        && - AND, || - OR,  ! - NOT
        */
        if (isActive){
            double temperature=20;
            boolean isSunny = false;

            if (temperature >= 20 && temperature <=30 && isSunny){
                System.out.printf(Locale.UK, "It is a perfect weather @ %.1f ☀️\n", temperature);
            }
            if (temperature >= 20 && temperature <=30 && !isSunny){
                System.out.printf(Locale.UK, "It is warm at @ %.1f but not sunny ☁️\n", temperature);
            }
            else if (temperature < 20 || temperature > 30){
                System.out.printf(Locale.UK, "At T=%.1f it is either too cold or too hot 🌧️\n", temperature);
            }
        }
    // -----------------------------------------------------------------------------
    // EXAMPLE: Check validity of username
        // length of username must be between 4 and 12 characters
        // no spaces and underscores allowed
        if (isActive){
            String username;
            boolean isValidUsername=true;

            System.out.print("Enter new username:");
            username =scanner.nextLine();

            if (username.length()< 4 || username.length()>12){
                System.out.println("Username either too short or too long");
                isValidUsername=false;
            }
            else if (username.contains(" ") || username.contains("_")) {
                System.out.println("Username must not contain spaces or underscores");
                isValidUsername=false;
            }
            else {
                System.out.println("Welcome: " + username);
            }
        }

    // -----------------------------------------------------------------------------
    // (11) While loop  and do while loop  
        if (isActive){ 
            String name="";
            String answer="", correctAnswer="2";

            while (name.isEmpty()){
                System.out.print("Your name: ");
                name = scanner.nextLine();
            }
            System.out.println("Hello "+name);

            System.out.println("Was ist 1 + 1 ?");
            while ( !answer.equals(correctAnswer) ){
                answer = scanner.next().toUpperCase();
            }
            System.out.println("The answer ist correct");

            do { 
                System.out.print("What is 1 + 1 ?");
                answer = scanner.next().toUpperCase();
            } while (!answer.equals(correctAnswer));
            System.out.println("The answer is correct");
        }
    // -----------------------------------------------------------------------------
    // (12) Random numbers

        if (isActive){
            int min =1, max =10;
            int guess, attempts=0, randomNumber=random.nextInt(min, max+1);


            System.out.println("Number guessing game");
            System.out.printf("Guess a number between %d and %d .\n", min, max);

            do{
                System.out.print("Your guess: ");
                guess=scanner.nextInt();
                attempts +=1;
                if (guess < randomNumber){
                    System.out.println("Too low!");
                }
                else if (guess > randomNumber){
                    System.out.println("Too high");
                }
                else {
                    System.out.printf("Correct. - You have won after %d attempts\n", attempts);
                }
            } while (guess != randomNumber);
        }
    // -----------------------------------------------------------------------------
    // (13) For loop
    /* execute a code for a certain amount of times
        EXAMPLE: countdown
    */
        if (isActive){
            for (int i=1; i < 11; i++){
                System.out.printf("%d\n", i);
            }

            int start;
            System.out.print("How many seconds to countdown: ");
            start = scanner.nextInt();
            for (int i=start; i>0; i--){
                System.out.println(i);
                Thread.sleep(1000); // needs "throws InterruptedException" in declaration of public static void main()
            }
            System.out.println("Happy NEW YEAR 🎊");
        }
    // -----------------------------------------------------------------------------
    // (14) break and continue (in for loop)
        if (isActive){
            for (int i=0; i<10; i++){
                if (i==5){
                    break;
                }
                System.out.print( i +"  ");
            }
            System.out.println();
            for (int i=0; i<10; i++){
                if (i==5){
                    continue;
                }
                System.out.print( i +" "); 
            }
            System.out.println();
        }
    // -----------------------------------------------------------------------------
    // (15) nested loops
    /* EXAMPLE: generate a mxn matrix output */
        if (isActive){
            int columns = 10, rows = 5;
            int val = 0;
            for (int i=1; i<rows+1; i++){
                for (int j=1; j<columns+1; j++){
                    //System.out.printf("i: %d, j: %d \n", i,j);
                    System.out.print(val);
                }
                System.out.println();
            }
        }

    // (16) methods
        /*
        have to be declared outside public static void main
        */
        if (isActive){
            String name ="Marlon";
            int age = 14;

            HappyBirthdaySong(name, age);
        }

     // (16) functions
        /*
        have to be declared outside public static void main
        */      
        if (isActive){
            double number = 5;
            int age =14;

            System.out.printf(Locale.UK, "The cube of %.1f is: %.1f \n", number, Cube(number));
            System.out.printf("Full name is: %s \n",fullName("Spongebob","Squarepants"));
            if (ageCheck(age)){
                System.out.println("Age check passed");
            }
            else {
                System.out.println("Age check failed");
            }
        }

    // EXAMPLE: Bank transactions program 

        if (!isActive){
            double balance=1000;
            int choice;
            boolean isRunning=true;
            while (isRunning){
                System.out.println("****************************");
                System.out.println("*** BANKING PROGRAM ********");
                System.out.println("****************************");
                System.out.printf("* Current balance: $%.2f\n",balance);
                System.out.println("****************************");


                System.out.println("1. Show Balance");
                System.out.println("2. Deposit");
                System.out.println("3. Withdraw");
                System.out.println("4. Exit");
                System.out.println("****************************");
        
                System.out.print("Enter your choice (1-4): ");
                choice = scanner.nextInt();
        
                switch (choice){
                    case 1 -> reportBalance(balance);
                    case 2 -> balance =depositMoney(balance);
                    case 3 -> balance =withdrawMoney(balance);
                    case 4 -> {
                        System.out.println("EXIT");
                        isRunning=false;
                    }
                    default -> System.out.println("Invalid choice");
                }

            }
        }

        

        scanner.close();
    }


    //==================================================================================
    // Declaration of methods 
        /*  methods and functions can share the same name but they must differ in their arguments (name+arguments = signature)
            no two methods can have the same signatue
        */

    static void HappyBirthdaySong(String name, int age){
        System.out.println("Happy birthday to you");
        System.out.printf("Happy birthday dear %s\n", name);
        System.out.printf("You are %d years old.\n", age);
        System.out.println("Happy birthday to you");
        System.out.println();
        }
    
    static void reportBalance(double balance){
        System.out.printf("Your Balance is: $%.2f\n", balance);
    }
    
    //==================================================================================
    // Declaration of functions

    static double Cube(double x){
        return Math.pow(x, 3);
    }

    static String fullName(String first, String last){
        return first + " " + last;
    }

    static boolean ageCheck(int age){
        if (age>=18){
            return true;
        }
        else {
            return false;
        }
    }


    static double depositMoney(double balance){
        Scanner scanner = new Scanner(System.in);
        double depositAmount;
        System.out.print("Amount ($) to deposit : ");
        depositAmount = scanner.nextDouble();
        return balance + depositAmount;
    }

    static double withdrawMoney(double balance){
        Scanner scanner = new Scanner(System.in);
        double withdrawAmount;
        System.out.print("Amount($) to withdraw: ");
        withdrawAmount = scanner.nextDouble();
        return balance - withdrawAmount;

    }
}