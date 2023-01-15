import java.util.Queue;

public class Main {
    public static void main(String[] args)
    {
        System.out.println("Test Data");
        EqualityPrinter.printEqual(1, 1, 1);
        EqualityPrinter.printEqual(1, 2, 1);
        EqualityPrinter.printEqual(1, 2, 3);
    }

    public static class EqualityPrinter
    {
        public static void printEqual(int iNumber1, int iNumber2, int iNumber3)
        {
            if(iNumber1 < 0 || iNumber2 < 0 || iNumber3 < 0) System.out.println("Invalid Value");
            else
            {
                if(iNumber1 == iNumber2 && iNumber2 == iNumber3) System.out.println("All numbers are equal.");
                else if(iNumber1 == iNumber2 || iNumber1 == iNumber3 || iNumber2 == iNumber3) System.out.println("Some numbers are equal.");
                else System.out.println("All numbers are different.");
            }
        }
    }
}