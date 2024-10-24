package Gabriel.Dev.com.Annotation;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

@Retention(RetentionPolicy.RUNTIME)
public @interface Duals {
    /**
     * Contiene un array de duals lo que permite que se puedan usar más de un dual en un solo metodo
     */
    Dual[] value();
}
