package com.electroapp.electro_app.infraestructure.utils.validations;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

import jakarta.validation.Constraint;
import jakarta.validation.Payload;

@Target(ElementType.FIELD)
@Constraint(validatedBy = ExistsbyCountrynameValidation.class)
@Retention(RetentionPolicy.RUNTIME)
public @interface ExistsByCountryname {

    String message() default "el nombre del pais ya existe";

    Class<?>[] groups() default {};

    Class<? extends Payload>[] payload() default {};
    

}
