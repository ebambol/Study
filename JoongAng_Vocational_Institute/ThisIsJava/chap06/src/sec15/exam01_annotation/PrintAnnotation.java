package sec15.exam01_annotation;

import java.lang.annotation.*;

@Target({ElementType.METHOD})	//메소드만 적용
@Retention(RetentionPolicy.RUNTIME)	//어노테이션 유지정책 RUNTIME (런타임시 어노테이션 정보 얻기)
public @interface PrintAnnotation {
	String value() default "-";
	int number() default 15;
}
