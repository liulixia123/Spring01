package advice;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Component;

@Component("myAspect")
@Aspect
class MyAspect {
	@Pointcut(value="execution( * service ..*(..))")
    private void servicePointCut(){
        
    }
	@Before(value="servicePointCut()")
	public void before(JoinPoint joinPoint) {
		System.out.println("前置增强"+joinPoint.getSignature().getName());
	}
	public void after() {
		System.out.println("最终增强");
	}
	public void afterReturning() {
		System.out.println("后置增强");
	}
	//环绕增强必须手动调用方法
    public void around(ProceedingJoinPoint  joinPoint){
      //手动调用方法 
      try {
    	 System.out.println("前增强");  
		joinPoint.proceed();
		System.out.println("后置增强"); 
	} catch (Throwable e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
		System.out.println("异常增强"); 
	}finally {
		System.out.println("最终增强"); 
	}
      System.out.println("环绕增强");
    }
}
