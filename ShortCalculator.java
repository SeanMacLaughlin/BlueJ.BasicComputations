import java.util.Scanner;

public class ShortCalculator {
    public static void main() {
    Scanner scan = new Scanner(System.in);
    System.out.println("Enter a Number 0-65535: ");
    short input1 = scan.nextShort();
    System.out.println("Enter another Number");
    short input2=scan.nextShort();
    short add = (short)(input1 + input2);
    short subtract = (short)(input1 - input2);
    short divide = (short)(input1 / input2);
    short multiply = (short)(input1 * input2);
    short modulo = (short)(input1 % input2);
    
    System.out.printf("Sum: " + add + "%n"  + "Difference: " + subtract +
    "%n" + "Quotient: " + divide + "%n" + "Product: " + multiply + "%n" + "Remainder: " + modulo + "%n");
    
    
    
    
    
    
    
    
    
    
}
}
