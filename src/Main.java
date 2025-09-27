import cicloFor.CicloFor;
import condicionales.Condicionales;
import swiches.Swiches;

import javax.swing.*;

public class Main {
    public static void main(String[] args) {
        //condicionales if
        Condicionales co = new Condicionales();
        co.parImpar();
        co.calcularTotal();
        co.numeroMayor();
        co.mayorMenor();
        co.analisisEdad();
        co.operacion();
        co.diaSemana();


        //condicionales swith
        Swiches sw = new Swiches();

        //ciclo for
        CicloFor cf = new CicloFor();

    }
}