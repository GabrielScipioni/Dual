package Gabriel.Dev.com.Examples;

import Gabriel.Dev.com.Annotation.Dual;

class Example2 {

    @Dual(name = "sum1", type = {String.class, Integer.class})
    @Dual(name = "sum2", type = {String.class, Integer.class})
    private void sum(Object sum1, Object sum2) {
        if (sum1 instanceof Integer && sum2 instanceof Integer) {
            // Si ambos son enteros, realiza la suma
            Integer result = (Integer) sum1 + (Integer) sum2;
            System.out.println("Suma de enteros: " + result);
        } else if (sum1 instanceof String && sum2 instanceof String) {
            // Si ambos son cadenas, concatena
            String result = (String) sum1 + (String) sum2;
            System.out.println("Concatenación de cadenas: " + result);
        } else {
            System.out.println("No se puede realizar la operación con los tipos proporcionados.");
        }
    }

    public static void main(String[] args) {
        Example2 example = new Example2();
        example.sum(10, 20);  // Suma de enteros
        example.sum("Hola", " Mundo");  // Concatenación de cadenas
    }
}
