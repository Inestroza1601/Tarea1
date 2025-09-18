import cicloFor.CicloFor;
import condicionales.Condicionales;
import swiches.Swiches;

import javax.swing.*;

public class Main {
    public static void main(String[] args) {
        //Considionales simples
        //Ejercicio 1
        int num = Integer.parseInt(JOptionPane.showInputDialog("Ingresa un numero"));
        if(num>10){
            System.out.println("El numero es mayor a 10");
        }
        //Ejercicio 2
        int edad = Integer.parseInt(JOptionPane.showInputDialog("Ingresa su edad"));
        if(edad>18){
            System.out.println("Es mayor de edad");
        }
        //Ejercicio 3
        String nombre = JOptionPane.showInputDialog("Ingrese su nombre");
        if(nombre.equals("Carlos")){
            System.out.println("La palabra es correcta");
        }
        //Considionales compuestas
        int numero;
        numero = Integer.parseInt(JOptionPane.showInputDialog("Ingresa el numero"));
        if(numero>0){
            System.out.println("El numero es positivo");
        }else if(numero<0){
            System.out.println("El numero es negativo");
        }else {
            System.out.println("El numero es 0");
        }

        Condicionales co = new Condicionales();
        co.parImpar();
        co.calcularTotal();
        co.numeroMayor();
        co.mayorMenor();
        co.analisisEdad();
        co.operacion();
        co.diaSemana();

        Swiches sw = new Swiches();


        CicloFor cf = new CicloFor();


    }
}