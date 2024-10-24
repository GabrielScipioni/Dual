package Gabriel.Dev.com.Annotation;

import java.lang.reflect.Array;
import java.lang.reflect.Method;
import java.util.Arrays;

public class DualHandler {
    public static void handleDuals(Object[] values, Method method) throws Exception {
        Dual[] duals = method.getAnnotationsByType(Dual.class);

        if (duals.length != values.length){
            throw new IllegalArgumentException("numero de parametros y valores no coincide");
        }
        for (int i = 0; i < duals.length; i++){
            Dual dual = duals[i];
            Object value = values[i];

            Class<?>[] allowedType = dual.type();
            boolean isValidType = Arrays.stream(allowedType).anyMatch(type-> type.isInstance(value));
            if (!isValidType) {
                throw  new IllegalArgumentException("tipo no permitido para "+ dual.name());
            }else {
                System.out.println("valor "+value+ " es valido para "+dual.name());
            }
        }
    }
}
