package ait.diapason;

public class MaxMinPrimitivesAppl2 {
    public static void main(String[] args) {
        if (args.length == 0){
            args = new String[]{"byte", "short", "int", "long", "char", "float", "double" };
        }
        for (int i = 0; i < args.length; i++) {
            printRange(args[i]);
            System.out.println();
        }
    }

    private static void printRange(String type){
        switch (type){
            case "byte":
                System.out.println("Maximal value of the type " + type  + " " + Byte.MAX_VALUE);
                System.out.println("Minimal value of the type " + type + " " + Byte.MIN_VALUE);
                break;
            case "short":
                System.out.println("Maximal value of the type " + type  + " " + Short.MAX_VALUE);
                System.out.println("Minimal value of the type " + type + " " + Short.MIN_VALUE);
                break;
            case "char":
                System.out.println("Maximal value of the type " + type  + " " + (int) Character.MAX_VALUE);
                System.out.println("Minimal value of the type " + type + " " + (int) Character.MIN_VALUE);
                break;
            case "int":
                System.out.println("Maximal value of the type " + type  + " " + Integer.MAX_VALUE);
                System.out.println("Minimal value of the type " + type + " " + Integer.MIN_VALUE);
                break;
            case "long":
                System.out.println("Maximal value of the type " + type  + " " + Long.MAX_VALUE);
                System.out.println("Minimal value of the type " + type + " " + Long.MIN_VALUE);
                break;
            case "float":
                System.out.println("Maximal value of the type " + type  + " " + Float.MAX_VALUE);
                System.out.println("Minimal value of the type " + type + " " + Float.MIN_VALUE);
                break;
            case "double":
                System.out.println("Maximal value of the type " + type  + " " + Double.MAX_VALUE);
                System.out.println("Minimal value of the type " + type + " " + Double.MIN_VALUE);
                break;
            default:
                System.out.println(type + " - wrong type");
        }
    }
}
