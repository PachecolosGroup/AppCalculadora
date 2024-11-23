import java.util.Scanner;

public class CalculadoraApp{
    public static void main(String[] args) {
        Scanner consola = new Scanner(System.in);
        while(true){
            System.out.println("**** Aplicacion Calculadora ****");
            //menu
            System.out.println("1. Suma\n2. Resta\n3. Multiplicacion○\n4. Divsion \n5. Salir");
            System.out.print("Que operacion quiere realizar? ");
            try {
                  
            var operacion = Integer.parseInt(consola.nextLine());
            // Revisar que este dentro de las opciones que estan dentro del menu.
            if(operacion >= 1 && operacion <= 4){
                System.out.print("Proporciona el valor Operando1: ");
                var operando1 = Integer.parseInt(consola.nextLine());
                System.out.print("Proporciona el valor Operando2: ");
                var operando2 = Integer.parseInt(consola.nextLine());
                //var resultado= operando1 + operando2;
                //System.out.println("Resultado: " + resultado);
                int resultado;
                switch (operacion) {
                    case 1 -> { //suma
                        resultado = operando1 + operando2;
                        System.out.println("Resultado de la suma es " +resultado);
                    }
                    case 2 -> { //resta
                        resultado = operando1 - operando2;
                        System.out.println("Resultado de la resta es " + resultado);
                    }
                    case 3 -> {//division
                        resultado = operando1 * operando2;
                        System.out.println("Resultado de la multiplicacion es " + resultado);
                    }
                    case 4 -> {//division
                        resultado = operando1 / operando2;
                        System.out.println("Resultado de la division es " + resultado);

                    } 
                    default -> {
                        System.out.println("Opcion es erronea " + operacion);
                    }
                };
        }
        else if (operacion == 5) {
            System.out.println("Hasta Pronto....");
            break;
        } else {
            System.out.println("Ocion erronea " +operacion);
        }
        ///salto de linea
        System.out.println();
    } catch (Exception e){
        System.out.println("Ocurrio un error: " +e.getMessage());
        }// ciera el while    
} // cierra switch
} //cierra el try
}
