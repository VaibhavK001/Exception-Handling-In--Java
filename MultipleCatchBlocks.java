public class MultipleCatchBlocks{
    public static void main(String[] args) {
        try {
              String s = null;
              System.out.println(s.length());
          } 
        catch (ArithmeticException e) {
              System.out.println("Arithmetic");
        } 
        catch (NullPointerException e) {
              System.out.println("Null handled");
        }
    }
}