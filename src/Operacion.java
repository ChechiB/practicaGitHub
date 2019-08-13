public class Operacion {

    public static void main(String args[]){

        Suma s = new Suma();
        System.out.println("Resultado suma: "+ s.sumar(2,4));
        Resta r = new Resta();
        System.out.println("Resultado resta: " + r.restar(5,7));
        Multiplicacion m = new Multiplicacion();
        System.out.println("Resultado multiplicacion: " + m.multiplicar(6,7));
        Division d = new Division();
        System.out.println("Resultado division: " + d.dividir(10,3));
        System.out.println("Division por cero: " + d.dividir(3,0));

    }
}
