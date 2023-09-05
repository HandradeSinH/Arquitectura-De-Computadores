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

    public ArrayList<Integer> sumarNumeros(ArrayList<String> cad1, ArrayList<String> cad2, int base) {
        ArrayList<Integer> carry = new ArrayList<Integer>();
        ArrayList<Integer> resultadoFinal = new ArrayList<Integer>();
        ArrayList<Integer> num1 = new ArrayList<Integer>();
        ArrayList<Integer> num2 = new ArrayList<Integer>();
        int tamano = 0;
        //Definir el tamano del resultado.
        if (cad1.size() >= cad2.size()) {
            tamano = cad1.size();
            for (int i = cad2.size(); i < tamano; i++) {
                cad2.add("0");
            }
        }
        if (cad2.size() >= cad1.size()) {
            tamano = cad2.size();
            for (int i = cad1.size(); i < tamano; i++) {
                cad1.add("0");
            }
        }

        //igualar en tamano todas las cadenas.
        for (int i = 0; i < tamano; i++) {
            resultadoFinal.add(0);
            carry.add(0);
            num1.add(0);
            num2.add(0);
        }
        //Pasar a enteros(int) los numeros.
        for (int i = 0; i < tamano; i++) {
            num1.set(i, Integer.parseInt(cad1.get(i)));
        }
        for (int i = 0; i < tamano; i++) {
            num2.set(i, Integer.parseInt(cad2.get(i)));
        }
        //LLamar al metodo de sumar arreglos.
        resultadoFinal = sumaArrays(num1, num2, base, tamano);

        //Ordenar el resultado.
        ArrayList<Integer> resultadoFinalOrdenado = ordenarResultado(resultadoFinal);

        return resultadoFinalOrdenado;
    }

    public ArrayList<Integer> sumaArrays(ArrayList<Integer> num1, ArrayList<Integer> num2, int base, int tamano) {
        ArrayList<Integer> resultado = new ArrayList<Integer>();
        ArrayList<Integer> carry = new ArrayList<Integer>();

        for (int i = 0; i < tamano; i++) {
            carry.add(0);
            resultado.add(0);
            num1.add(0);
            num2.add(0);
        }
        for (int i = 0; i < tamano; i++) {
            int resultadoLocal = num1.get(i) + num2.get(i) + carry.get(i);
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
        return resultado;
    }
}