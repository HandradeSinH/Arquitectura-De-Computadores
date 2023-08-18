package gui;

import operaciones.Calculos;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<String> numero1;
        ArrayList<String> numero2;
        ArrayList<Integer> yo3;

        Calculos calc = new Calculos();
        numero1 = calc.reorganizarNumeros("1110");
        numero2 = calc.reorganizarNumeros("1111");

        System.out.println("---------------------------------------");
        yo3 = calc.sumarNumeros(numero1, numero2, 2);
        for (int jhon : yo3) {
            System.out.print(jhon);
        }
        System.out.println("\u208D"+"\u2082"+"\u208E");
    }
}
