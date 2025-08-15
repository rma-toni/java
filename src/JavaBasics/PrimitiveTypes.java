package JavaBasics;

public class PrimitiveTypes {
    public static void main(String[] args) {
        byte byteNum = 127; //-128 127 8bits
        short shortNum = 32767; //-32768 32767 16bits
        int intNum = 32154854; //-2^31 2^31-1 32bits
        long longNum = 523142351; //64bits
        float floatNum = 13.4f;//32 bits single precision
        double doubleNum = 144.412331;//64 bits double precision
        char charType = 'a';

        /*
        String is not a primitive date
        The compiler assign a default value to variables that were not
        initialized.
        */

        long creditCardNumber = 1234_5678_9012_3456L;
        long socialSecurityNumber = 999_99_9999L;
        float pi =  3.14_15F;
        long hexBytes = 0x0F_EC_DE_5E;
        long hexWords = 0x0AFE_BABE;
        long maxLong = 0x7fff_ffff_ffff_ffffL;
        byte nybbles = 0b0010_0101;
        long bytes = 0b11010010_01101001_10010100_10010010;

    }
}