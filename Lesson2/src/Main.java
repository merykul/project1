public class Main {
    public static void main(String[] args) {

        byte b2 = 0b1000;
        byte b8 = 010 ;
        byte b16 = 0xC ;
        byte b10 = 2;
        int sumByte = b2 + b8 + b16 + b10;

        short s2 = 0b11;
        short s8 = 010;
        short s16 = 0xD;
        short s10 = 6;
        int sumShort = s2 + s8 + s16 + s10;

        int i2 = 0b01;
        int i8 = 03;
        int i16 = 0xBA;
        int i10 = 6;
        int sumInt = i2 + i8 + i16 + i10;

        long l2 = 0b10L;
        long l8 = 011L;
        long l16 = 0x2L;
        long l10 = 5L;
        int sumLong =(int) (l2 + l8 + l10 + l16);

        char c2 = 0b1011;
        char c8 = 011;
        char c16 = 0xB;
        char c10 = 4;
        int sumChar = c2 + c8 + c16 + c10;


        float f16 = 0x3F;
        float f10 = 3F;
        int sumFloat = (int) (f16 + f10);

        double d16 = 0xABF;
        double d10 = 2003.0;
        int sumDouble =(int) (d16 + d10);

        //first task result
        long result = sumByte+sumInt+sumShort+sumChar+sumLong+sumFloat+sumDouble;
        System.out.println("First task result: " + result);

        //Конвертація градусів Фарангейта в градуси Цельсії:
        double degreeFahrenheit = 298;
        convertToCelsius (degreeFahrenheit);

        //конвертація дюймів у сантиметри:
        double inch = 20;
        convertToCm(cmConverting);

    }

    public static double convertToCelsius(double degreeFahrenheit) {
        System.out.println("Fahrenheit degree convinced to the Celsius degree: " + degreeFahrenheit);
        return (degreeFahrenheit - 32)*5/9;
    }

    public static double convertToCm(double cmConverting) {
        System.out.println("Inch convinced to cm: " + cmConverting);
        return inch*2.54;
    }
}
