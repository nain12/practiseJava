package concert;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Pointcut;

public class AudienceAround {

	@Pointcut("execution (** concert.Performance.perform(..))")
	public void performance() {
	}

	@Around("performance()")
	public void watchPerformance(ProceedingJoinPoint jp) {
		try {
			System.out.println("Silencing cell phones");
			System.out.println("Taking seats");
			jp.proceed();
		} catch (Throwable e) {
			System.out.println("Demanding a refund");
		}
	}
}
