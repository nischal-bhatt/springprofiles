package spring.profiling;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Component;

@Component
@Profile("sit")
public class SITBean implements EnvInterface{

	public SITBean()
	{
		System.out.println("this is sit bean");
	}
}
