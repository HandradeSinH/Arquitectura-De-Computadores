package operaciones;

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

    public ArrayList<Integer> sumaArrays(String num1, String num2, int base) {
        ArrayList<Integer> resultado = new ArrayList<Integer>();
        ArrayList<Integer> carry = new ArrayList<Integer>();
        ArrayList<Integer> numero1 = convertirAEntero(reorganizarNumerosString(num1));
        ArrayList<Integer> numero2 = convertirAEntero(reorganizarNumerosString(num2));
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

    public ArrayList<Integer> restaArrays(String num1, String num2, int base) {
        int numeroConvertido1 = Integer.parseInt(num1) * -1;
        int numeroConvertido2 = Integer.parseInt(num2) * -1;
        ArrayList<Integer> resultado = new ArrayList<Integer>();
        ArrayList<Integer> carry = new ArrayList<Integer>();
        ArrayList<Integer> numero1 = convertirAEntero(reorganizarNumerosInt(numeroConvertido1));
        ArrayList<Integer> numero2 = convertirAEntero(reorganizarNumerosInt(numeroConvertido2));
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

    public int baseVariableaDecimal(String numero, String base) {
        ArrayList<Integer> numeroArray = convertirAEntero(reorganizarNumerosString(numero));
        int baseInt = Integer.parseInt(base);
        int numeroConvertido = 0;
        for (int i = 0; i < numero.length(); i++) {
            numeroConvertido = (int) ((numeroArray.get(i) * Math.pow(baseInt, i)) + numeroConvertido);
            System.out.println((int) (numeroArray.get(i) * Math.pow(baseInt, i)) + " = " + numeroArray.get(i) + " x " + (int) Math.pow(baseInt, i));
            if (i == numero.length() - 1) {
                System.out.println("=");
            } else {
                System.out.println("+");
            }
        }
        return numeroConvertido;
    }
    public ArrayList<Integer> decimalABaseVariable(String numero, String base) {
        int numeroInt = Integer.parseInt(numero);
        int baseInt = Integer.parseInt(base);
        ArrayList<Integer> numeroConvertido = new ArrayList<Integer>();
        for (int i = 0; numeroInt>=baseInt; i++) {
            numeroConvertido.add(i, numeroInt % baseInt);
            System.out.print(numeroInt+" / "+baseInt+" = ");
            numeroInt = numeroInt / baseInt;
            System.out.println(numeroInt);
            System.out.println(" Residuo = "+numeroConvertido.get(i)+"\n----------------------");
        }
        numeroConvertido.add(numeroConvertido.size(),numeroInt);
    return numeroConvertido;
    }
}
