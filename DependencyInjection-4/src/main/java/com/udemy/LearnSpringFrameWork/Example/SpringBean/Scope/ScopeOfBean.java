package com.udemy.LearnSpringFrameWork.Example.SpringBean.Scope;
import java.util.Arrays;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;
@Component
class NormalClass
{
	
}
@Scope(value = ConfigurableBeanFactory.SCOPE_PROTOTYPE)
@Component
class ProtoTypeClass
{
	
}

@Configuration
@ComponentScan

public class ScopeOfBean {
	
	
	
	public static void main(String[] args)
	{
		try(var context=new AnnotationConfigApplicationContext(ScopeOfBean.class);)
		{
			System.out.println(context.getBean(NormalClass.class));
			System.out.println(context.getBean(NormalClass.class));
			System.out.println("...................");
			System.out.println(context.getBean(ProtoTypeClass.class));
			System.out.println(context.getBean(ProtoTypeClass.class));
		} 
		
	}

}
