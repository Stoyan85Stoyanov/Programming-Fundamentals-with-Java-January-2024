package BasicSyntaxConditionalStatementsandLoopsLab01;

public class _08_Divisibleby3 {

    public static void main(String[] args) {


        for (int number = 1; number <= 100; number++) {
            if (number % 3 == 0) {

                System.out.println(number);
            }
        }
    }
}
