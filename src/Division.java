public class Division {
    public int dividir(int a, int b){
        int d = 0;
        try{
            d = a/b;
        }catch (ArithmeticException ex){
            d = 0;
            System.out.println("Error: " + ex.getMessage());
        }
        return d;
    }
}
