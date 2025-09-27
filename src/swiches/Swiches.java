package swiches;

import javax.swing.*;

public class Swiches {
    public void menus() {
        int op;
        String bebida;
        System.out.println("Menu de opciones");
        System.out.println("1.- Pupusas");
        System.out.println("2.- Baleadas");
        System.out.println("3.- Pollo");

        op = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingrese la opcion"));

        switch (op) {
            case 1:
                System.out.println("Producto agregado");
                bebida = JOptionPane.showInputDialog(null, "Desea agregar una bebida (si/no)");
                if (bebida.equals("si")) {
                    System.out.println("Producto agregado");
                    System.out.println("Pedido completado");
                } else {
                    System.out.println("Pedido completado");
                }
                break;
            case 2:
                System.out.println("Producto agregado");
                bebida = JOptionPane.showInputDialog(null, "Desea agregar una bebida (si/no)");
                if (bebida.equals("si")) {
                    System.out.println("Producto agregado");
                    System.out.println("Pedido completado");
                } else {
                    System.out.println("Pedido completado");
                }
                break;
            case 3:
                System.out.println("Producto agregado");
                bebida = JOptionPane.showInputDialog(null, "Desea agregar una bebida (si/no)");
                if (bebida.equals("si")) {
                    System.out.println("Producto agregado");
                    System.out.println("Pedido completado");
                } else {
                    System.out.println("Pedido completado");
                }
                break;
            default:
                break;
        }
    }

    public void menu2() {
        System.out.println("Menu");
        System.out.println("1. Pupusas");
        System.out.println("2. Baleadas");
        System.out.println("3. Pollo ");
        String op = JOptionPane.showInputDialog("Ingrese la opcion");
        switch (op) {
            case "Baleadas":
                System.out.println("Producto agregado");
                String opci = JOptionPane.showInputDialog("Desea agregar bebida?(Si/No)");
                if ("Si".equals(opci)) {
                    System.out.println("Bebida agregada");
                    System.out.println("Pedido: ");
                    System.out.println("1.Baleadas");
                    System.out.println("2.Bebdia: Si");
                } else {
                    System.out.println("Pedido completo");
                    System.out.println("Pedido: ");
                    System.out.println("1.Baleadas");
                    System.out.println("2.Bebdia: No");
                }
                break;
            case "Pupusas":
                System.out.println("Producto agregado");
                String opci0 = JOptionPane.showInputDialog("Desea agregar bebida?(Si/No)");
                if ("Si".equals(opci0)) {
                    System.out.println("Bebida agregada");
                    System.out.println("Pedido: ");
                    System.out.println("1.Baleadas");
                    System.out.println("2.Bebdia: Si");
                } else {
                    System.out.println("Pedido completo");
                    System.out.println("Pedido: ");
                    System.out.println("1.Baleadas");
                    System.out.println("2.Bebdia: No");
                }
                break;

            case "Pollo":
                System.out.println("Producto agregado");
                String opcii = JOptionPane.showInputDialog("Desea agregar bebida?(Si/No)");
                if ("Si".equals(opcii)) {
                    System.out.println("Bebida agregada");
                    System.out.println("Pedido: ");
                    System.out.println("1.Baleadas");
                    System.out.println("2.Bebdia: Si");
                } else {
                    System.out.println("Pedido completo");
                    System.out.println("Pedido: ");
                    System.out.println("1.Baleadas");
                    System.out.println("2.Bebdia: No");
                }
                break;
            default:
                System.out.println("Opcion no valida");

                break;
        }

    }

    public void calificaciones(){
        // Calificaciones A-F
        String letra = JOptionPane.showInputDialog("Ingrese su calificacion con una letra.");

        letra = letra.toUpperCase();

        switch (letra)
        {
            case "A":
                JOptionPane.showMessageDialog(null, "Sobresaliente.");
                break;
            case "B":
                JOptionPane.showMessageDialog(null, "Bueno.");
                break;
            case "C":
                JOptionPane.showMessageDialog(null, "Regular.");
                break;
            case "D":
                JOptionPane.showMessageDialog(null, "Deficiente.");
                break;
            case "E":
                JOptionPane.showMessageDialog(null, "Insatisfactorio.");
                break;
            case "F":
                JOptionPane.showMessageDialog(null, "Reprobado.");
                break;
            default:
                JOptionPane.showMessageDialog(null, "Opcion no valida.");
        }
    }

    public void operacionesMatematicas(){
        float numero1 = Float.parseFloat(JOptionPane.showInputDialog("Ingrese el numero 1: "));
        float numero2 = Float.parseFloat(JOptionPane.showInputDialog("Ingrese el numero 2: "));

        int opcion = Integer.parseInt(JOptionPane.showInputDialog("Operaciones matematicas\n1.Suma\n2.Resta\n3.Multiplicacion\n4.Division\nOpcion:"));

        switch (opcion) {
            case 1:
                JOptionPane.showMessageDialog(null, "El resultado es " + (numero1 + numero2));
                break;
            case 2:
                JOptionPane.showMessageDialog(null, "El resultado es " + (numero1 - numero2));
                break;
            case 3:
                JOptionPane.showMessageDialog(null, "El resultado es " + (numero1 * numero2));
                break;
            case 4:
                JOptionPane.showMessageDialog(null, "El resultado es " + (numero1 / numero2));
                break;
            default:
                JOptionPane.showMessageDialog(null, "Opcion no valida.");
        }
    }

    // 1. Día de la semana
    public void diasSemana() {
        int num = Integer.parseInt(JOptionPane.showInputDialog("Ingrese un número (1-7):"));
        switch (num) {
            case 1: JOptionPane.showMessageDialog(null, "Lunes"); break;
            case 2: JOptionPane.showMessageDialog(null, "Martes"); break;
            case 3: JOptionPane.showMessageDialog(null, "Miércoles"); break;
            case 4: JOptionPane.showMessageDialog(null, "Jueves"); break;
            case 5: JOptionPane.showMessageDialog(null, "Viernes"); break;
            case 6: JOptionPane.showMessageDialog(null, "Sábado"); break;
            case 7: JOptionPane.showMessageDialog(null, "Domingo"); break;
            default: JOptionPane.showMessageDialog(null, "Número fuera de rango (1-7)");
        }
    }

    // 2. Meses del año
    public void mesesDelAnio() {
        int mes = Integer.parseInt(JOptionPane.showInputDialog("Ingrese un número (1-12):"));
        switch (mes) {
            case 1: JOptionPane.showMessageDialog(null, "Enero"); break;
            case 2: JOptionPane.showMessageDialog(null, "Febrero"); break;
            case 3: JOptionPane.showMessageDialog(null, "Marzo"); break;
            case 4: JOptionPane.showMessageDialog(null, "Abril"); break;
            case 5: JOptionPane.showMessageDialog(null, "Mayo"); break;
            case 6: JOptionPane.showMessageDialog(null, "Junio"); break;
            case 7: JOptionPane.showMessageDialog(null, "Julio"); break;
            case 8: JOptionPane.showMessageDialog(null, "Agosto"); break;
            case 9: JOptionPane.showMessageDialog(null, "Septiembre"); break;
            case 10: JOptionPane.showMessageDialog(null, "Octubre"); break;
            case 11: JOptionPane.showMessageDialog(null, "Noviembre"); break;
            case 12: JOptionPane.showMessageDialog(null, "Diciembre"); break;
            default: JOptionPane.showMessageDialog(null, "Número fuera de rango (1-12)");
        }
    }

    // 3. Vocales
    public void esVocal() {
        String letra = JOptionPane.showInputDialog("Ingrese una letra:");
        letra = letra.toLowerCase();

        switch (letra) {
            case "a":
            case "e":
            case "i":
            case "o":
            case "u":
                JOptionPane.showMessageDialog(null, "Es una vocal.");
                break;
            default:
                JOptionPane.showMessageDialog(null, "No es una vocal.");
        }
    }

    // 4. Colores primarios de la luz
    public void coloresPrimarios() {
        String color = JOptionPane.showInputDialog("Ingrese un color (Rojo, Verde, Azul):");
        color = color.toLowerCase();

        switch (color) {
            case "rojo": JOptionPane.showMessageDialog(null, "Es un color primario de la luz."); break;
            case "verde": JOptionPane.showMessageDialog(null, "Es un color primario de la luz."); break;
            case "azul": JOptionPane.showMessageDialog(null, "Es un color primario de la luz."); break;
            default: JOptionPane.showMessageDialog(null, "No es un color primario de la luz.");
        }
    }

    // 5. Menú de mascotas
    public void menuMascotas() {
        int op = Integer.parseInt(JOptionPane.showInputDialog(
                "Menú de mascotas\n1. Perro\n2. Gato\n3. Conejo\nSeleccione opción:"));

        switch (op) {
            case 1: JOptionPane.showMessageDialog(null, "Has adoptado un Perro."); break;
            case 2: JOptionPane.showMessageDialog(null, "Has adoptado un Gato."); break;
            case 3: JOptionPane.showMessageDialog(null, "Has adoptado un Conejo."); break;
            default: JOptionPane.showMessageDialog(null, "Opción inválida.");
        }
    }

    // 6. Cajero automático
    public void cajeroAutomatico() {
        int saldo = 1000;
        int op = Integer.parseInt(JOptionPane.showInputDialog(
                "Cajero Automático\n1. Consultar saldo\n2. Depositar dinero\n3. Retirar dinero\n4. Salir\nOpción:"));

        switch (op) {
            case 1:
                JOptionPane.showMessageDialog(null, "Su saldo es: $" + saldo);
                break;
            case 2:
                int deposito = Integer.parseInt(JOptionPane.showInputDialog("Ingrese la cantidad a depositar:"));
                if (deposito > 0 && deposito <= 1000) {
                    saldo += deposito;
                    JOptionPane.showMessageDialog(null, "Depósito exitoso. Nuevo saldo: $" + saldo);
                } else {
                    JOptionPane.showMessageDialog(null, "Cantidad inválida para depositar.");
                }
                break;
            case 3:
                int retiro = Integer.parseInt(JOptionPane.showInputDialog("Ingrese la cantidad a retirar:"));
                if (retiro > 0 && retiro <= saldo) {
                    saldo -= retiro;
                    JOptionPane.showMessageDialog(null, "Retiro exitoso. Nuevo saldo: $" + saldo);
                } else {
                    JOptionPane.showMessageDialog(null, "Fondos insuficientes o cantidad inválida.");
                }
                break;
            case 4:
                JOptionPane.showMessageDialog(null, "Gracias por usar el cajero.");
                break;
            default:
                JOptionPane.showMessageDialog(null, "Opción no válida.");
        }
    }

    // 7. Números romanos
    public void numerosRomanos() {
        int num = Integer.parseInt(JOptionPane.showInputDialog("Ingrese un número (1-10):"));
        switch (num) {
            case 1: JOptionPane.showMessageDialog(null, "I"); break;
            case 2: JOptionPane.showMessageDialog(null, "II"); break;
            case 3: JOptionPane.showMessageDialog(null, "III"); break;
            case 4: JOptionPane.showMessageDialog(null, "IV"); break;
            case 5: JOptionPane.showMessageDialog(null, "V"); break;
            case 6: JOptionPane.showMessageDialog(null, "VI"); break;
            case 7: JOptionPane.showMessageDialog(null, "VII"); break;
            case 8: JOptionPane.showMessageDialog(null, "VIII"); break;
            case 9: JOptionPane.showMessageDialog(null, "IX"); break;
            case 10: JOptionPane.showMessageDialog(null, "X"); break;
            default: JOptionPane.showMessageDialog(null, "Número fuera de rango (1-10)");
        }
    }
}