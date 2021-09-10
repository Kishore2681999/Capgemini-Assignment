package Assignment-7;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Target(ElementType.METHOD)
@Retention(RetentionPolicy.RUNTIME)
@interface Execute{
	//Sequence
	int sequence();
}
public class Assg7_3 {
	
	@Execute(sequence=1)
	void mymethod1() {
		
	}

	@Execute(sequence=3)
	void mymethod2() {
		
	}
	
	@Execute(sequence=2)
	void mymethod3() {
		
	}
}