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
        sw.menus();
        sw.menu2();
        sw.calificaciones();
        sw.operacionesMatematicas();
        sw.diasSemana();
        sw.mesesDelAnio();
        sw.esVocal();
        sw.coloresPrimarios();
        sw.menuMascotas();
        sw.cajeroAutomatico();
        sw.numerosRomanos();

        //ciclo for
        CicloFor cf = new CicloFor();
        cf.mensaje();
    }
}