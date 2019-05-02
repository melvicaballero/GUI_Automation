package com.jala.main;

public class RomanNumber {
    public static int roman_value(char roman) {
        int result = 0;
        switch (roman) {
            case 'I':
                result = 1;
                break;
            case 'V':
                result = 5;
                break;
            case 'X':
                result = 10;
                break;
            case 'L':
                result = 50;
                break;
            case 'C':
                result = 100;
                break;
            case 'D':
                result = 500;
                break;
            case 'M':
                result = 1000;
                break;
            default:
                result = 0;
                break;
        }
        return result;
    }

    public int invalidRomanoVLD(String romano) {
        int contadorV = 0;
        int contadorL = 0;
        int contadorD = 0;
        char anterior = ' ';
        for (int i = 0; i < romano.length(); i++) {
            if (romano.charAt(i) == 'V') {
                contadorV++;
            }
            if (romano.charAt(i) == 'L') {
                contadorL++;
            }
            if (romano.charAt(i) == 'D') {
                contadorD++;
            }
        }
        if (contadorV > 1 || contadorL > 1 || contadorD > 1) {
            return 0;
        }
         else
             return 1;
    }




    public int invalidRomanoIXCM(String romano){
        int contador = 0;
        char anterior = ' ';
        for(int i=0; i<romano.length(); i++){
            if (romano.charAt(i) == anterior){
                contador++;
            }
            else {
                contador = 1;
                anterior = romano.charAt(i) ;
            }

            if (contador>3){
                return 0;
            }
            if((anterior=='V' || anterior=='L' || anterior=='D') && contador>1){
                return 0;
            }

            if (i<romano.length()-1) {
                if (contador == 3 && roman_value(anterior) < roman_value(romano.charAt(i + 1))) {
                    return 0;
                }

                if (roman_value(anterior) == (roman_value(romano.charAt(i+1))/2))
                {
                    return 0;
                }
            }
        }
        return 1;
    }
    public int convert(String romano){
        if (invalidRomanoIXCM(romano)==0 || invalidRomanoVLD(romano)==0){
            return 0;
        }
        int num = 0;
        int bandera = 0;
        if (romano.length() == 1){
            return (roman_value(romano.charAt(0)));
        }
        else {
            for (int i=romano.length()-1; i>=1;i--){
                if (romano.length()-1 == i){
                    num = roman_value(romano.charAt(i));
                }
                if (roman_value(romano.charAt(i)) > roman_value(romano.charAt(i - 1))) {
                    num -= roman_value(romano.charAt(i - 1));

                } else {
                    num += roman_value(romano.charAt(i - 1));

                }

            }
            return (num);
        }
    }
  }

