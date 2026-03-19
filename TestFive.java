import java.util.Scanner;

class InvalidAgeException extends Exception{
    public InvalidAgeException(String message){
        super(message);
    }
}

class Voting{
    void vote() throws InvalidAgeException{
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your age : ");
        int age = sc.nextInt();
        if(age<18){
            throw new InvalidAgeException("You are not eligible to vote.");
        }
        else{
            System.out.println("You can vote.");
        }
    }
}
public class TestFive{
    public static void main (String [] args){
        Voting vt = new Voting();
        try{
            vt.vote();
        }
        catch(InvalidAgeException e){
            e.printStackTrace();
        }
        System.out.println("Program continues...");

    }
}