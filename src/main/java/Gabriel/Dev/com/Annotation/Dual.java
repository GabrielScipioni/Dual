package Gabriel.Dev.com.Annotation;

import java.lang.annotation.Repeatable;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

/**
 *
 */
@Retention(RetentionPolicy.RUNTIME)
@Repeatable(Duals.class)
public @interface Dual {
    /**
     * el nombre de la variable dual.
     * @return un String.
     */
    String name();

    /**
     * Array que permitira definir los tipos permitidos.
     * @return un array de clases.
     */
    Class<?>[] type();
}
