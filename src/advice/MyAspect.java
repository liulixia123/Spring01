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
		System.out.println("ǰ����ǿ"+joinPoint.getSignature().getName());
	}
	public void after() {
		System.out.println("������ǿ");
	}
	public void afterReturning() {
		System.out.println("������ǿ");
	}
	//������ǿ�����ֶ����÷���
    public void around(ProceedingJoinPoint  joinPoint){
      //�ֶ����÷��� 
      try {
    	 System.out.println("ǰ��ǿ");  
		joinPoint.proceed();
		System.out.println("������ǿ"); 
	} catch (Throwable e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
		System.out.println("�쳣��ǿ"); 
	}finally {
		System.out.println("������ǿ"); 
	}
      System.out.println("������ǿ");
    }
}
