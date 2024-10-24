package Gabriel.Dev.com.Examples;

import Gabriel.Dev.com.Annotation.Dual;
import Gabriel.Dev.com.Annotation.DualHandler;

class Example1 {

    @Dual(name = "var1", type = {String.class, Integer.class, Long.class})
    @Dual(name = "var2", type = {String.class, Integer.class, Long.class})
    private void method(Object var1, Object var2) throws Exception {
        // Corregido para buscar el método con dos parámetros de tipo Object
        DualHandler.handleDuals(new Object[]{var1, var2}, Example1.class.getDeclaredMethod("method", Object.class, Object.class));
    }

    public static void main(String[] args) throws Exception {
        Example1 example = new Example1();
        example.method(1, 2);
        example.method("pepe", "pepa");
        example.method(13L, 46L);
    }
}
