package com.jeni.validation;

import java.lang.annotation.ElementType;
import java.lang.annotation.Target;
import java.lang.annotation.*;
import javax.validation.Constraint;
import javax.validation.Payload;


@Constraint(validatedBy = CourseCodeConstraintValidator.class)
@Target({ ElementType.METHOD, ElementType.FIELD })
@Retention(RetentionPolicy.RUNTIME)
public @interface CourseCode {

	//define default source code
	public String value() default "VZ";
	
	public String message() default "Must start with VZ";
	
	public Class<?>[] groups() default{};
	
	//define default payloads
	public Class<? extends Payload>[] payload() default {};
}
