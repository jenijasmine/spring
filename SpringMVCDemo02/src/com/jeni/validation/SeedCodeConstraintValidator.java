package com.jeni.validation;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

public class SeedCodeConstraintValidator implements ConstraintValidator<SeedCode, String>{

//	private String coursePrefix;
//	
//	@Override
//	public void initialize(SeedCode theSeedCode) {
//		coursePrefix = theSeedCode.value();
//	}
//	
	@Override
	public boolean isValid(String theCode, ConstraintValidatorContext theConstraintValidatorContext) {
		// TODO Auto-generated method stub
		boolean result;
		
		if(theCode!=null) {
			result = this.isPrime(Integer.parseInt(theCode));
		}
		else {
			result = true;
		}
		return result;
	}
	
	private boolean isPrime(int num) {
		boolean flag = false;
        for(int i = 2; i <= num/2; ++i)
        {
            // condition for nonprime number
            if(num % i == 0)
            {
                flag = true;
                break;
            }
        }
        if (!flag)
            return true;
        else
           return false;
	}	

}
