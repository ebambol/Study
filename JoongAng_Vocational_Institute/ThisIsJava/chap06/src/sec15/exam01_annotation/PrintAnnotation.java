package sec15.exam01_annotation;

import java.lang.annotation.*;

@Target({ElementType.METHOD})	//�޼ҵ常 ����
@Retention(RetentionPolicy.RUNTIME)	//������̼� ������å RUNTIME (��Ÿ�ӽ� ������̼� ���� ���)
public @interface PrintAnnotation {
	String value() default "-";
	int number() default 15;
}
