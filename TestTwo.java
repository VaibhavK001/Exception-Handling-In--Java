public class TestTwo{
    public static void main (String [] args){
        try{
            System.out.println("Try block executed succesfully.");
            return;
        }
        finally{
            System.out.println("Finally block executed succesfully.");
        }
    }
}