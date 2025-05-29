import java.util.Scanner; 
public class Lesson01 {
    public static void main(String[] args){
        // This is a comment line
        /*
         * this is a multi line comment
         */

        Scanner scanner = new Scanner(System.in);

        int age = 14;
        int yearOfBirth =2010;
        int monthOfBirth =8;
        int dayOfBirth = 7;
        double weight = 80.3;
        boolean marlonClever = true;
        char grade ='A';
        String schoolName = "GMG";
        String marlonEmail = "marlontino@icloud.com";

        System.out.println("Marlon Du bist "+age+" Jahre alt");
        System.out.println("Dein Geburtstag ist der "+dayOfBirth+"."+monthOfBirth+"."+yearOfBirth);
        System.out.println("Dein Gewicht ist " + weight+" kg.");
        System.out.println("Deine Schule ist das " + schoolName);
        System.out.println("Deine letzte Schulnote war ein: "+ grade);
        System.out.println("Deine Email-Adresse ist: "+marlonEmail);
        if (marlonClever){
            System.out.println("Du bist clever");
        }
        else {
            System.out.println("Du bist nicht clever");  
        }
        
        /* 
        System.out.print("Gib Deinen Namen ein:");
        String name=scanner.nextLine();
        System.out.println("Dein Name ist: "+ name);
        System.out.print("Gib Deine Postleitzahl ein:");
        int plz = scanner.nextInt();
        System.out.println("Deine Postleitzahl ist:" +plz);
        */

        System.out.print("Länge Rechteck Seite a: ");
        double a = scanner.nextDouble();
        System.out.print("Länge Rechteck Seite b: ");
        double b = scanner.nextDouble();
        System.out.println("Fläche des Rechtecks: "+ a*b);
        
        scanner.close();
    }
}
