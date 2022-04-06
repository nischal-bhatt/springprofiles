package spring.profiling;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Component;

@Component
@Profile("prod")
public class ProdBean implements EnvInterface{

	public ProdBean()
	{
		System.out.println("this is prod bean");
	}
}
