package operaciones;

import javax.swing.*;
import java.util.ArrayList;

import static java.util.Collections.addAll;
import static java.util.Collections.reverse;

public class Calculos {
    public ArrayList<String> reorganizarNumerosString(String numero) {
        ArrayList<String> cadena = new ArrayList<String>();
        addAll(cadena, numero.split(""));
        reverse(cadena);
        return cadena;
    }

    public ArrayList<String> reorganizarNumerosInt(int numero) {
        String numeroConv = String.valueOf(numero);
        ArrayList<String> cadena = new ArrayList<String>();
        addAll(cadena, numeroConv.split(""));
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

    public int sumaArrays(String num1, String num2, String base) {
        ArrayList<Integer> resultado = new ArrayList<Integer>();
        ArrayList<Integer> carry = new ArrayList<Integer>();
        ArrayList<Integer> numero1 = convertirAEntero(reorganizarNumerosString(num1));
        ArrayList<Integer> numero2 = convertirAEntero(reorganizarNumerosString(num2));
        int baseInt = Integer.parseInt(base);
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
        //Operacion en tal
        for (int i = 0; i < tamano; i++) {
            int resultadoLocal = numero1.get(i) + numero2.get(i) + carry.get(i);
            if (i != tamano - 1) {
                if (resultadoLocal < baseInt) {
                    resultado.set(i, resultadoLocal);
                } else {
                    resultado.set(i, resultadoLocal - baseInt);
                    carry.set(i + 1, 1);
                }
            } else {
                if (resultadoLocal < baseInt) {
                    resultado.set(i, resultadoLocal);
                } else {
                    resultado.set(i, resultadoLocal - baseInt);
                    resultado.add(1);
                }
            }
        }
        int resultadoInt = 0;

        for (int i = 0; i < resultado.size(); i++) {
            resultadoInt = (int) ((resultado.get(i) * Math.pow(10, i)) + resultadoInt);
        }
        return resultadoInt;
    }

    public int restaArrays(String num1, String num2, String base) {
        int numeroConvertido1 = Integer.parseInt(num1);
        int numeroConvertido2 = Integer.parseInt(num2);
        ArrayList<Integer> resultado = new ArrayList<Integer>();
        ArrayList<Integer> numero1 = convertirAEntero(reorganizarNumerosInt(numeroConvertido1));
        ArrayList<Integer> numero2 = convertirAEntero(reorganizarNumerosInt(numeroConvertido2));
        ArrayList<Integer> numArriba = new ArrayList<>();
        ArrayList<Integer> numAbajo = new ArrayList<>();
        int baseInt = Integer.parseInt(base);
        int tamano = 0;
        if (numero1.size() > numero2.size()) {
            tamano = numero1.size();
            numArriba = numero1;
            numAbajo = numero2;
            for (int i = numero2.size(); i < tamano; i++) {
                numero2.add(0);
            }
        }
        if (numero2.size() > numero1.size()) {
            tamano = numero2.size();
            numArriba = numero2;
            numAbajo = numero1;
            for (int i = numero1.size(); i < tamano; i++) {
                numero1.add(0);
            }
        }
        if (numero2.size()==numero1.size()){
            tamano = numero1.size();
        }
        for (int i = 0; i < tamano; i++) {
            resultado.add(0);
        }
        int resultadoLocal = 0;
        for (int i = 0; i < tamano; i++) {
            if (i != tamano - 1) {
                if (numArriba.get(i)<numAbajo.get(i)){
                    int temp1 = numArriba.get(i+1);
                    numArriba.set(i+1,temp1-1);
                    int temp2 = numArriba.get(i);
                    numArriba.set(i,temp2+baseInt);
                    resultadoLocal=numArriba.get(i)-numAbajo.get(i);
                } else if (numArriba.get(i)>numAbajo.get(i)){
                    resultadoLocal = numArriba.get(i)-numAbajo.get(i);
                }else if (numArriba.get(i)==numAbajo.get(i)){
                    resultadoLocal = 0;
                }
            }else{
                resultadoLocal=numArriba.get(i)-numAbajo.get(i);
            }
            resultado.set(i,resultadoLocal);
        }
        int resultadoInt = 0;
        int numero1Int = 0;
        int numero2Int = 0;
        for (int i = 0; i < resultado.size(); i++) {
            resultadoInt = (int) ((resultado.get(i) * Math.pow(10, i)) + resultadoInt);
        }
        for (int i = 0; i < numero1.size(); i++) {
            numero1Int = (int) ((numero1.get(i) * Math.pow(10, i)) + numero1Int);
        }
        for (int i = 0; i < numero2.size(); i++) {
            numero2Int = (int) ((numero2.get(i) * Math.pow(10, i)) + numero2Int);
        }
        if (numero1Int<numero2Int){
            resultadoInt=resultadoInt*-1;
        }

        return resultadoInt;
    }
    public int baseVariableaDecimal(String numero, String base) {
        ArrayList<Integer> numeroArray = convertirAEntero(reorganizarNumerosString(numero));
        int baseInt = Integer.parseInt(base);
        int numeroConvertido = 0;
        for (int i = 0; i < numero.length(); i++) {
            numeroConvertido = (int) ((numeroArray.get(i) * Math.pow(baseInt, i)) + numeroConvertido);
        }
        return numeroConvertido;
    }
    public void baseVariableaDecimalProcedimiento(String numero, String base){

    }
    public int decimalABaseVariable(String numero, String base) {
        int numeroInt = Integer.parseInt(numero);
        int baseInt = Integer.parseInt(base);
        ArrayList<Integer> numeroConvertido = new ArrayList<Integer>();
        for (int i = 0; numeroInt>=baseInt; i++) {
            numeroConvertido.add(i, numeroInt % baseInt);
            numeroInt = numeroInt / baseInt;
        }
        numeroConvertido.add(numeroConvertido.size(),numeroInt);
        int numeroConvertidoInt = 0;
        for (int i = 0; i < numeroConvertido.size(); i++) {
            numeroConvertidoInt = (int) ((numeroConvertido.get(i) * Math.pow(10, i)) + numeroConvertidoInt);
        }
    return numeroConvertidoInt;
    }

}
