package mathAlgorithrmBook.editorial.chap2_1;

public class prob2_1_4_binary_ternary {
    public static void main(String[] args) {
        int decimal = 127;

        String binary = convertToBinary(decimal);
        String ternary = convertToTernary(decimal);

        System.out.println(binary);
        System.out.println(ternary);
    }

    public static String convertToBinary(int decimal) {
        String binary = "";
        while (decimal >= 1) {
            if (decimal % 2 == 0) {
                binary = "0" + binary;
            } else {
                binary = "1" + binary;
            }
            decimal = decimal / 2;
        }
        return binary;
    }

    public static String convertToTernary(int decimal) {
        String ternary = "";
        while (decimal >= 1) {
            if (decimal % 3 == 0) {
                ternary = "0" + ternary;
            } else if (decimal % 3 == 1) {
                ternary = "1" + ternary;
            } else {
                ternary = "2" + ternary;
            }
            decimal = decimal / 3;
        }
        return ternary;
    }
}