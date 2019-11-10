public class Kalkulator {
    public void Addition (int a, int b){
        System.out.println("wynik dodawania: " + (a + b));
    }
    public void Subtraction (int a , int b){
        System.out.println("wynik odejmowania: " + (a - b));
    }
    public static void main (String args[]) {
        Kalkulator calculator = new Kalkulator();
        calculator.Addition(5, 10);
        calculator.Subtraction(20, 3);
    }
}
