package fr.iskills.web.publicapi.genericModel;

import java.lang.annotation.*;

/**
 * Indicates that a given field will never be null
 */

@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.FIELD)
public @interface NotNull {
}