package operaciones;

import org.w3c.dom.ls.LSOutput;

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
    private static boolean isNumeric(String cadena){
        try {
            Integer.parseInt(cadena);
            return true;
        } catch (NumberFormatException nfe){
            return false;
        }
    }

    public ArrayList<Integer> convertirAEntero(ArrayList<String> cad) {
        ArrayList<Integer> num = new ArrayList<Integer>();
        int tamano = cad.size();
        for (int i = 0; i < tamano; i++) {
            if (isNumeric(cad.get(i))){
                num.add(Integer.parseInt(cad.get(i)));
            }else{
                switch (cad.get(i)){
                    case "A":
                        num.add(10);
                        break;
                    case "B":
                        num.add(11);
                        break;
                    case "C":
                        num.add(12);
                        break;
                    case "D":
                        num.add(13);
                        break;
                    case "E":
                        num.add(14);
                        break;
                    case "F":
                        num.add(15);
                        break;
                }
            }
        }
        return num;
    }

    public int sumaArrays(String num1, String num2, String base) {
        ArrayList<Integer> resultado = new ArrayList<Integer>();
        ArrayList<Integer> carry = new ArrayList<Integer>();
        ArrayList<Integer> numero1 = convertirAEntero(reorganizarNumerosString(num1));
        ArrayList<Integer> numero2 = convertirAEntero(reorganizarNumerosString(num2));
        int baseInt = Integer.parseInt(base);
        int resultadoInt = 0;
        boolean seguir = true;
        for (int i = 0; i < numero1.size(); i++) {
            if (numero1.get(i) > baseInt || numero2.get(i) > baseInt) {
                JOptionPane.showMessageDialog(null, "Error de digitacion.", "Advertencia", JOptionPane.WARNING_MESSAGE);
                seguir = false;
            }
            break;
        }
        if (seguir) {
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
            for (int i = 0; i < resultado.size(); i++) {
                resultadoInt = (int) ((resultado.get(i) * Math.pow(10, i)) + resultadoInt);
            }
        }
        return resultadoInt;
    }
    public int restaArrays(String num1, String num2, String base) {
        int numeroConvertido1 = Integer.parseInt(num1);
        int numeroConvertido2 = Integer.parseInt(num2);
        int baseInt = Integer.parseInt(base);
        int resultadoInt = 0;
        boolean seguir = true;
        ArrayList<Integer> resultado = new ArrayList<Integer>();
        ArrayList<Integer> numero1 = convertirAEntero(reorganizarNumerosInt(numeroConvertido1));
        ArrayList<Integer> numero2 = convertirAEntero(reorganizarNumerosInt(numeroConvertido2));
        for (int i = 0; i < numero1.size(); i++) {
            if (numero1.get(i) > baseInt || numero2.get(i) > baseInt) {
                JOptionPane.showMessageDialog(null, "Error de digitacion.", "Advertencia", JOptionPane.WARNING_MESSAGE);
                seguir = false;
            }
            break;
        }
        if (seguir) {
            int numero1Int = 0;
            int numero2Int = 0;
            ArrayList<Integer> numArriba = new ArrayList<>();
            ArrayList<Integer> numAbajo = new ArrayList<>();
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
            if (numero2.size() == numero1.size()) {
                tamano = numero1.size();
            }
            for (int i = 0; i < tamano; i++) {
                resultado.add(0);
            }
            int resultadoLocal = 0;
            for (int i = 0; i < tamano; i++) {
                if (i != tamano - 1) {
                    if (numArriba.get(i) < numAbajo.get(i)) {
                        int temp1 = numArriba.get(i + 1);
                        numArriba.set(i + 1, temp1 - 1);
                        int temp2 = numArriba.get(i);
                        numArriba.set(i, temp2 + baseInt);
                        resultadoLocal = numArriba.get(i) - numAbajo.get(i);
                    } else if (numArriba.get(i) > numAbajo.get(i)) {
                        resultadoLocal = numArriba.get(i) - numAbajo.get(i);
                    } else if (numArriba.get(i) == numAbajo.get(i)) {
                        resultadoLocal = 0;
                    }
                } else {
                    resultadoLocal = numArriba.get(i) - numAbajo.get(i);
                }
                resultado.set(i, resultadoLocal);
            }

            for (int i = 0; i < resultado.size(); i++) {
                resultadoInt = (int) ((resultado.get(i) * Math.pow(10, i)) + resultadoInt);
                numero1Int = (int) ((numero1.get(i) * Math.pow(10, i)) + numero1Int);
                numero2Int = (int) ((numero2.get(i) * Math.pow(10, i)) + numero2Int);
            }
            if (numero1Int < numero2Int) {
                resultadoInt = resultadoInt * -1;
            }
        }
        return resultadoInt;
    }

    public int convertirADecimal(String numero, String base) {
        ArrayList<Integer> numeroArray = convertirAEntero(reorganizarNumerosString(numero));
        int baseInt = Integer.parseInt(base);
        int numeroConvertido = 0;
        for (int i = 0; i < numeroArray.size(); i++) {
            numeroConvertido = (int) (numeroArray.get(i)*Math.pow(baseInt,i)+numeroConvertido);
        }
        System.out.println(numeroConvertido);
        return numeroConvertido;
    }
    public int convertirABase(int numero,String base){
        int baseInt = Integer.parseInt(base);
        int numeroConvertido = 0;
        ArrayList<Integer> resultado = new ArrayList<Integer>();
        for (int i = 0; numero>=baseInt; i++) {
            resultado.add(i, numero % baseInt);
            numero = numero / baseInt;
        }
        resultado.add(resultado.size(),numero);
        int numeroConvertidoInt = 0;
        for (int i = 0; i < resultado.size(); i++) {
            numeroConvertidoInt = (int) ((resultado.get(i) * Math.pow(10, i)) + numeroConvertidoInt);
        }
    return numeroConvertidoInt;
    }
}
