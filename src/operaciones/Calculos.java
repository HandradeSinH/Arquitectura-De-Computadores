package operaciones;

import java.lang.reflect.Array;
import java.util.ArrayList;

import static java.lang.Integer.parseInt;
import static java.util.Collections.*;

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
        int tamaño;
        //Definir el tamaño del resultado.
        if (cad1.size() >= cad2.size()) {
            tamaño = cad1.size();
            for (int i = cad2.size(); i < tamaño; i++) {
                cad2.add("0");
            }
        } else {
            tamaño = cad2.size();
            for (int i = cad1.size(); i < tamaño; i++) {
                cad2.add("0");
            }
        }
        //igualar en tamaño todas las cadenas.
        for (int i = 0; i < tamaño; i++) {
            resultadoFinal.add(0);
            carry.add(0);
            num1.add(0);
            num2.add(0);
        }
        //Pasar a enteros(int) los numeros.
        for (int i = 0; i < tamaño; i++) {
            num1.set(i, Integer.parseInt(cad1.get(i)));
            num2.set(i, Integer.parseInt(cad2.get(i)));
        }
        //LLamar al metodo de sumar arreglos.
        resultadoFinal = sumaArrays(num1,num2);

        //Ordenar el resultado.
        ArrayList<Integer> resultadoFinalOrdenado = ordenarResultado(resultadoFinal);
        return resultadoFinalOrdenado;
    }
    public ArrayList<Integer> sumaArrays(ArrayList<Integer> num1, ArrayList<Integer> num2) {
        ArrayList<Integer> resultado = new ArrayList<Integer>();
        ArrayList<Integer> carry = new ArrayList<Integer>();
        int tamaño;
        //Definir el tamaño del resultado.
        if (num1.size() >= num2.size()) {
            tamaño = num1.size();
            for (int i = num2.size(); i < tamaño; i++) {
                num2.add(0);
            }
        } else {
            tamaño = num2.size();
            for (int i = num1.size(); i < tamaño; i++) {
                num2.add(0);
            }
        }
        //igualar en tamaño todas las cadenas.
        for (int i = 0; i < tamaño; i++) {
            carry.add(0);
            resultado.add(0);
            num1.add(0);
            num2.add(0);

        }
        for (int i = 0; i < tamaño; i++) {
            int resultadolocal = num1.get(i) + num2.get(i) + carry.get(i);
            if(i!=tamaño-1) {
                if (resultadolocal < 2) {
                    resultado.set(i, resultadolocal);
                } else {
                    resultado.set(i, 0);
                    carry.set(i + 1, 1);
                }
            }else{
                if (resultadolocal < 2) {
                    resultado.set(i, resultadolocal);
                } else {
                    resultado.set(i,0);
                    resultado.add(1);
                }
            }
        }


    return resultado;}
}