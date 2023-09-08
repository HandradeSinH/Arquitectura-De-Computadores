package operaciones;

import java.util.ArrayList;

import static java.util.Collections.addAll;
import static java.util.Collections.reverse;

public class Calculos {
    public ArrayList<String> reorganizarNumeros(String numero) {
        ArrayList<String> cadena = new ArrayList<String>();
        addAll(cadena, numero.split(""));
        reverse(cadena);
        return cadena;
    }

    public ArrayList<Integer> ordenarResultado(ArrayList<Integer> cadena) {
        reverse(cadena);
        return cadena;
    }

    public ArrayList<Integer> convertirAEntero(ArrayList<String> cad) {
        ArrayList<Integer> num = new ArrayList<Integer>();
        int tamano = cad.size();
        for (int i = 0; i < tamano; i++) {
            num.add(0);
            num.set(i, Integer.parseInt(cad.get(i)));
        }
        return num;
    }

    public ArrayList<Integer> sumaArrays(ArrayList<String> num1, ArrayList<String> num2, int base) {
        ArrayList<Integer> resultado = new ArrayList<Integer>();
        ArrayList<Integer> carry = new ArrayList<Integer>();
        ArrayList<Integer> numero1 = convertirAEntero(num1);
        ArrayList<Integer> numero2 = convertirAEntero(num2);
        int tamano = 0;
        if (numero1.size() >= numero2.size()) {
            tamano = numero1.size();
            for (int i = numero2.size(); i < tamano; i++) {
                numero2.add(0);
            }
        }
        if (numero2.size() >= numero1.size()) {
            tamano = numero2.size();
            for (int i = numero1.size(); i < tamano; i++) {
                numero1.add(0);
            }
        }
        for (int i = 0; i < tamano; i++) {
            carry.add(0);
            resultado.add(0);
        }
        for (int i = 0; i < tamano; i++) {
            int resultadoLocal = numero1.get(i) + numero2.get(i) + carry.get(i);
            if (i != tamano - 1) {
                if (resultadoLocal < base) {
                    resultado.set(i, resultadoLocal);
                } else {
                    resultado.set(i, resultadoLocal - base);
                    carry.set(i + 1, 1);
                }
            } else {
                if (resultadoLocal < base) {
                    resultado.set(i, resultadoLocal);
                } else {
                    resultado.set(i, resultadoLocal - base);
                    resultado.add(1);
                }
            }
        }
        reverse(resultado);
        return resultado;
    }
}