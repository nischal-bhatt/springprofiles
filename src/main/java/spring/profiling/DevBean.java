package spring.profiling;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Component;

@Component
@Profile("default")
public class DevBean implements EnvInterface{

	public DevBean()
	{
		System.out.println("devbean is being printed");
	}
}
