package org.jvi.app.aspect;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.context.annotation.Configuration;

@Aspect
@Configuration
public class CustomAroundAspect {

	@Around("within(org.jvi.app.service..*)")
	public Object employeeAroundAdvice(final ProceedingJoinPoint proceedingJoinPoint) {
		System.out.println("Before invoking getName() method");
		Object value = null;
		try {
			value = proceedingJoinPoint.proceed();
		} catch (final Throwable e) {
			e.printStackTrace();
		}
		System.out.println("After invoking getName() method. Return value=" + value);
		return value;
	}
}