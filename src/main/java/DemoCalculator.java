import java.util.Scanner;


public class DemoCalculator {
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        System.out.println("Введите арифметическое выражение ");
        var input = s.nextLine();

        try{
            var result = Main.calc(input);
            System.out.printf("%s = %s%n", input, result);
        }
        catch (Exception e){
            System.err.println(e.getMessage());
            System.exit(-1);
        }
    }
}
