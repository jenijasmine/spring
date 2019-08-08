package com.jeni.validation;

import java.lang.annotation.ElementType;
import java.lang.annotation.Target;
import java.lang.annotation.*;
import javax.validation.Constraint;
import javax.validation.Payload;


@Constraint(validatedBy = SeedCodeConstraintValidator.class)
@Target({ ElementType.METHOD, ElementType.FIELD })
@Retention(RetentionPolicy.RUNTIME)
public @interface SeedCode {

	//define default source code
	public String value() default "2";
	
	public String message() default "Must be a prime number";
	
	public Class<?>[] groups() default{};
	
	//define default payloads
	public Class<? extends Payload>[] payload() default {};
}
