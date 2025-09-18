package condicionales;
import javax.swing.*;

public class Condicionales {
    public void parImpar(){
        float numero;
        numero = Float.parseFloat(JOptionPane.showInputDialog("Ingrese el numero"));
        if (numero%2==0){
            System.out.println("El numero es par");
        }else {
            System.out.println("El numero es impar");
        }
    }

    public void calcularTotal(){
        String producto;
        float precio;

        producto = JOptionPane.showInputDialog("Ingresa el producto");
        precio = Float.parseFloat(JOptionPane.showInputDialog("Ingresa el precio"));
        if (precio>100){
            System.out.println("El total a pagar por "+producto+" es: "+(precio - (precio * 0.05f)));
        }else {
            System.out.println("El total a pagar por "+producto+" es: "+precio);
        }
    }

    public void numeroMayor(){
        int n1,n2;
        n1 = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el primer numero"));
        n2 = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el segundo numero"));
        if(n1>n2){
            System.out.println("El numero mayor es: "+n1);
        }else if(n1<n2){
            System.out.println("El numero mayor es: "+n2);
        }else {
            System.out.println("Los numero son iguales");
        }
    }

    public void mayorMenor(){
        int n1,n2,n3;
        n1 = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el primer numero"));
        n2 = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el segundo numero"));
        n3 = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el tercer numero"));

        if(n1>n2 && n1>n3){
            System.out.println("el numero mayor es: "+n1);
        } else if(n2>n1 && n2>n3) {
            System.out.println("el numero mayor es: "+n2);
        } else if (n3>n1 && n3>n2) {
            System.out.println("el numero mayor es: "+n3);
        }

        if(n1<n2 && n1<n3){
            System.out.println("el numero menor es: "+n1);
        } else if(n2<n1 && n2<n3) {
            System.out.println("el numero menor es: "+n2);
        } else if (n3<n1 && n3<n2) {
            System.out.println("el numero menor es: "+n3);
        }
    }

    public void analisisEdad(){
        int edad;
        edad=Integer.parseInt(JOptionPane.showInputDialog("INGRESE SU EDAD"));
        if(edad>=18 && edad <=20){
            System.out.println("Eres mayor de edad");
        }else if(edad>=21 && edad <=64){
            System.out.println( "Tienes la mayoría de edad");
        }else if(edad>=65){
            System.out.println("Eres de la tercera edad");
        }else{
            System.out.println("Es menor de edad");
        }
    }

    public void operacion(){
        String operacion;
        int n1,n2;
        n1 = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el primer numero"));
        n2 = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el segundo numero"));
        operacion = JOptionPane.showInputDialog("Ingrese la operacion a realizar ( +|-|*|/ )");
        if(operacion.equals("+")){
            System.out.println("La suma es: "+(n1+n2));
        }else if(operacion.equals("-")){
            System.out.println("La resta es: "+(n1-n2));
        }else if(operacion.equals("*")){
            System.out.println("La multiplicacion es: "+(n1*n2));
        }else if(operacion.equals("/")){
            if(n2==0){
                System.out.println("No se puede dividir entre 0");
            }else{
                System.out.println("La division es: "+(n1/n2));
            }
        }else{
            System.out.println("Error, La operacion seleccionada no es valida.");
        }
    }

    public void diaSemana(){
        int numero;
        numero = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el numero"));
        if(numero>=1 && numero<=7){
            if(numero == 1){
                System.out.println("Lunes");
            }else if(numero == 2){
                System.out.println("Martes");
            }else if(numero == 3){
                System.out.println("Miercoles");
            }else if(numero == 4){
                System.out.println("Jueves");
            }else if(numero == 5){
                System.out.println("Viernes");
            }else if(numero == 6){
                System.out.println("Sabado");
            }else{
                System.out.println("Domingo");
            }
        }else {
            System.out.println("El numero no es valido.");
        }
    }
}
