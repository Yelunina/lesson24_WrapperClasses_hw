package ait.diapason;

public class MaxMinValuePrimitiveTypesAppl {
    static private String[] types = {"byte", "short", "int", "long", "char", "float", "double"};
    static private String[] maxValue = {Byte.toString(Byte.MAX_VALUE), Short.toString(Short.MAX_VALUE),
            Integer.toString(Integer.MAX_VALUE), Long.toString(Long.MAX_VALUE), Integer.toString(Character.MAX_VALUE),
            Float.toString(Float.MAX_VALUE), Double.toString(Double.MAX_VALUE)};
    static private String[] minValue = {Byte.toString(Byte.MIN_VALUE), Short.toString(Short.MIN_VALUE),
            Integer.toString(Integer.MIN_VALUE), Long.toString(Long.MIN_VALUE), Integer.toString(Character.MIN_VALUE),
            Float.toString(Float.MIN_VALUE), Double.toString(Double.MIN_VALUE)};

    public static void main(String[] args) {
        if (args.length == 0) {
            printMinMaxValuePrimitiveTypes();
        } else {
            for (int i = 0; i < args.length; i++) {
                printMinMaxValuePrimitiveTypes(args[i]);
            }
        }
    }

    private static void printMinMaxValuePrimitiveTypes() {
        for (int i = 0; i < types.length; i++) {
            printRes(i);
        }

    }

    private static void printMinMaxValuePrimitiveTypes(String type) {
        int n = findType(type);
        if (n >= 0) {
            printRes(n);
        } else {
            System.out.println();
            System.out.println( type + " - wrong type");
        }
    }

    private static void printRes(int i) {
        System.out.println();
        System.out.println("maximal value of type " + types[i] + ": " + maxValue[i]);
        System.out.println("minimal value of type " + types[i] + ": " + minValue[i]);

    }

    private static int findType(String type) {
        for (int i = 0; i < types.length; i++) {
            if (type.equals(types[i])) {
                return i;
            }
        }
        return -1;
    }
}