package com.example.marvelinst.Annotations;

import com.example.marvelinst.validations.EmailValidaror;
import io.jsonwebtoken.Claims;
import jakarta.validation.Constraint;
import jakarta.validation.Payload;

import java.lang.annotation.*;

@Target({ElementType.TYPE, ElementType.FIELD, ElementType.ANNOTATION_TYPE})
@Retention(RetentionPolicy.RUNTIME)
@Constraint(validatedBy = EmailValidaror.class)
@Documented
public @interface ValidEmail {
    String message() default "Invalid email";

    Class<?>[] groups() default{};

    Class<? extends Payload>[] payload() default{};


}
