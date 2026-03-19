class YoungerAgeException extends RuntimeException{
     YoungerAgeException(String msg) {
        super(msg);
    }
}
class Voting{
    void vote(){
        int age = 15;
        if(age<18){
            throw new YoungerAgeException("You are not eligible to vote");
        }
        else{
            System.out.println("Vote successful");
        }
    }
}
public class Throw{
     public static void main(String[] args){
        Voting vt = new Voting();
        try {
            vt.vote();
        } catch (Exception e) {
            System.out.println("Error handled");
        } 
        System.out.println("Hello...");
    }
}