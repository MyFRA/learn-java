public class DataTypeNumber {

    public static void main(String[] args) {

        // Number
        byte thisIsMaximumByte = 127;
        byte thisIsMinimumByte = -128;
        short thisIsMaximumShort = 32767;
        short thisIsMinimumShort = -32767;
        int thisIsMaximumInt = 2147483647;
        int thisIsMinimumInt = -2147483647;
        long thisIsSamplePositiveLong = 9000000000000000L;
        long thisIsSampleNegativeLong = -9000000000000000L;

        // Floating Point Number
        float thisIsSampleFloat = 10.10F; // Range for float its like int in number
        double thisIsSampleDouble = 10.10; // Range for double its like long in number

        // Literals
        int decimalInt = 34;
        int hexInt = 0xFFFFFF;
        int binInt = 0b10101010;

        // Underscore
        int underscoreInt = 1_000_000_000;
        long underscoreLong = 1_000_000_000_000_000L;

        // Number Data Type Conversion
        // Automatic
        byte sampleByteAutomaticConversion = 10;
        short sampleShortAutomaticConversion = sampleByteAutomaticConversion;

        // Manual
        short sampleShortManualConversion = 10;
        byte sampleByteManualConversion = (byte) sampleShortManualConversion;
    }

}
