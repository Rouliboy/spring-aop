package org.jvi.lib.aop.config;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;
import org.springframework.context.annotation.ImportResource;

@Aspect
@Configuration
@ConditionalOnProperty("nexity.wgl.logging.poincut")
@ImportResource("classpath:/org/jvi/lib/aop/aop-config.xml")
@EnableAspectJAutoProxy
public class LoggingAopAspectConfiguration {

	private Logger logger = LoggerFactory.getLogger(getClass().getName());

	public Object logAllMethods(final ProceedingJoinPoint pjp) throws Throwable {

		try {
			logger.info("start method : " + pjp.getSignature().getName());
			return pjp.proceed();
		} finally {
			logger.info("stop method : " + pjp.getSignature().getName());
		}
	}
}