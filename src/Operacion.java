import java.util.Scanner;

public class Operacion {

    public static void main(String args[]){
        int a = 0,b=0;

        Scanner teclado=new Scanner(System.in);
        System.out.println("Seleccione la operacion a realizar: \\n1.Sumar\\n2.Restar\\n3.Multiplicar\\n4.Dividir" );
        int opcion=teclado.nextInt();

        switch (opcion){
            case 1:
                System.out.println("Ingrese el primer numero:" );
                a =teclado.nextInt();
                System.out.println("Ingrese el segundo numero:" );
                b =teclado.nextInt();
                Suma s = new Suma();
                System.out.println("Resultado suma: "+ s.sumar(a,b));
            case 2:
                System.out.println("Ingrese el primer numero:" );
                a =teclado.nextInt();
                System.out.println("Ingrese el segundo numero:" );
                b =teclado.nextInt();
                Resta r = new Resta();
                System.out.println("Resultado resta: " + r.restar(a,b));
            case 3:
                System.out.println("Ingrese el primer numero:" );
                a =teclado.nextInt();
                System.out.println("Ingrese el segundo numero:" );
                b =teclado.nextInt();
                Multiplicacion m = new Multiplicacion();
                System.out.println("Resultado multiplicacion: " + m.multiplicar(6,7));
            case 4:
                System.out.println("Ingrese el primer numero:" );
                a =teclado.nextInt();
                System.out.println("Ingrese el segundo numero:" );
                b =teclado.nextInt();
                Division d = new Division();
                System.out.println("Resultado division: " + d.dividir(10,3));
        }






    }
}
