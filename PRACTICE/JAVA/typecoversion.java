class typeconversion{
    public static void main(String[] args) {
        int i = 100;
        long l = i; // automatic type conversion
        float f = l; // automatic type conversion
        System.out.println("Int value " + i);
        System.out.println("Long value " + l);
        System.out.println("Float value " + f);
        String s = Integer.toString(i);
        System.out.println("String value " + s);
        System.out.println();
        //print the datatypes
    }
}