/*
SUBPROGRAMAS METODOS: FUNCTION + PROCEDIMIENTO
CONVERSIONES
 */
package monforte.p17;

import java.util.Scanner;

public class MonforteP17 {

    static Scanner keyboard = new Scanner(System.in);

    public static void main(String[] args) {
        int option = -1;
        int euroInt;
        float moneyFloat;
        double moneyDouble;
        String moneyString;
        String euroString;
        int moneyInt;
        float euroFloat;
        char letterChar;
        int letterInt;
        String letterString;
        String letterString2;
        int numInt;
        String numberCH;
        while (option != 0) {
            userMenu();
            option = keyboard.nextInt();
            switch (option) {//inicio switch
                case 1:
                    System.out.print("Enter the quantity in euros: ");
                    euroInt = keyboard.nextInt();
                    moneyFloat = Conversion(euroInt);
                    System.out.println(moneyFloat);
                    break;
                case 2:
                    System.out.print("Enter the quantity in euros: ");
                    euroInt = keyboard.nextInt();
                    moneyDouble = Conversion2(euroInt);
                    System.out.println(moneyDouble);
                    break;
                case 3:
                    System.out.print("Enter the quantity in euros: ");
                    euroInt = keyboard.nextInt();
                    moneyString = Conversion3(euroInt);
                    System.out.println(moneyString);
                    break;
                case 4:
                    System.out.print("Enter the quantity in euros: ");
                    euroString = keyboard.next();
                    moneyInt = Conversion4(euroString);
                    System.out.println(euroString);
                    break;
                case 5:
                    System.out.print("Enter the quantity in euros: ");
                    euroFloat = keyboard.nextFloat();
                    moneyInt = Conversion5(euroFloat);
                    System.out.println(moneyInt);
                    break;
                case 6:
                    System.out.print("Enter the quantity in euros: ");
                    euroFloat = keyboard.nextFloat();
                    moneyString = Conversion6(euroFloat);
                    System.out.println(moneyString);
                    break;
                case 7:
                    System.out.println("Text a letter: ");
                    letterChar = keyboard.next().charAt(0);
                    letterInt = (int) letterChar;
                    String letterChar2 = Conversion7(letterInt);
                    System.out.println(letterInt + " - " + letterChar2);
                    break;
                case 8:
                    System.out.println("Text a name: ");
                    letterString = keyboard.next();
                    String nameBinary = Conversion8(letterString);
                    System.out.println(nameBinary);
                    break;
                case 9:
                    System.out.println("Say a number between 0 and 255: ");
                    numInt = keyboard.nextInt();
                    numberCH = Conversion9(numInt);
                    System.out.println(numberCH);
                    break;
                case 10:
                    System.out.println("ASCII");
                    for (int I = 32; I < 64; I++) {
                        String numberhexad = Conversion10(I);
                        System.out.print(I + "-" + (char) (I) + "-" + numberhexad + "\t");
                        numberhexad = Conversion10(I + 32);
                        System.out.print((I + 32) + "-" + (char) (I + 32) + "-" + numberhexad + "\t");
                        numberhexad = Conversion10(I + 64);
                        System.out.print((I + 64) + "-" + (char) (I + 64) + "-" + numberhexad + "\t");
                        System.out.println("");
                        }
                    break;
            
        default:
                    System.out.print("Opcion no valida");
            }//fin switch
        }
    }

    

    

    private static void userMenu() {
        System.out.println("Option 1-");
        System.out.println("Option 2-");
        System.out.println("Option 3-");
        System.out.println("Option 4-");
        System.out.println("Option 5-");
        System.out.println("Option 6-");
        System.out.println("Option 7-");
        System.out.println("Option 8-");
        System.out.println("Option 9-");
        System.out.println("Option 10-");
        System.out.print("\nOption? ");
    }

    /*public static void main(String[] args) {
        double price, tax, pvp;
        price=100;
        tax=21;
        pvp = functionGerard(price, tax);
        System.out.println(pvp);
        
    } //FIN DE MAIN 
    
    private static double functionGerard(double precio, double iva){
        double result=0;
        //CALCULO
        result = precio + precio*iva/100;
        return result;*/
    private static float Conversion(int cash) {
        float result = (float) cash;
        return result;
    }

    private static double Conversion2(int cash) {
        double result = (double) cash;
        return result;
    }

    private static String Conversion3(int cash) {
        String money = Integer.toString(cash);
        return money;
    }

    private static int Conversion4(String cash) {
        int result = Integer.parseInt(cash);
        return result;
    }

    private static int Conversion5(float cash) {
        int result = (int) cash;
        return result;
    }

    private static String Conversion6(float cash) {
        String money = Float.toString(cash);
        return money;
    }

    private static String Conversion7(int IntValue) {
        String binary = Integer.toBinaryString(IntValue);
        return binary;
    }

    private static String Conversion8(String StringValue) {
        String result = "";
        char numchar;
        for(int i=0; i<StringValue.length(); i++){
        numchar = StringValue.charAt(i);
        result += Integer.toBinaryString(numchar)+" ";
        }
        
        return result;
    }

    private static String Conversion9(int numberInt) {
        String numChar = new Character((char) numberInt).toString();
        return numChar;
    }

    private static String Conversion10(int numberInt) {
        String numberHex = Integer.toHexString(numberInt);
        return numberHex;
    }
} //FIN DE CLASS

