import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Target({ElementType.METHOD}) //어노테이션이 적용할 대상 열거상수 (ElementType)를 메서드로 한다. 
@Retention(RetentionPolicy.RUNTIME)//어노테이션 유지 정책을 런타임시간까지 한다.
/* 유지정책이란) 
 * 어노테이션 사용 용도에 따라 어느 범위까지 유지할 것인지를 지정하는 것을 말한다.
 * 즉, 소스상에서만 유지할 건지, 컴파일된 클래스까지 유지할 건지, 런타임 시에도 유지할 것인지를 지정해야한다.
 * 여기서는 런타임시 까지 유지한다.
 * 
 * 런타임 유지 정책은 바이트 코드파이까지 어노테이션 정보를 유지하면서 리플랙션을 이용해서 런타임시에도 어노테이션 정보를 얻을 수 있다.
 * 
 * 리플렉션?)
 * 런타임시에 클래스 메타 정보를 얻는 기능을 말한다. 
 * ex) 클래스가 가지고 있는 필드가 무엇인지, 어떤 생상자를 갖고 있는지, 어떤 메서드를 갖고 있는지, 적용된 어노테이션이 무엇인지 알아내는 것
 */

public @interface PrintAnnotation { //@interface 로 어노테이션 이름 PrintAnnotation 정의 
	
    String value() default "-" ; 
    //엘리먼트 타입 엘리먼트 이름 ()선언, 기본값을 "-" 지정,구분선에서 사용할 문자 
    int number() default 15; // 15는 문자 반복 횟수 
    
    
    
    
}
