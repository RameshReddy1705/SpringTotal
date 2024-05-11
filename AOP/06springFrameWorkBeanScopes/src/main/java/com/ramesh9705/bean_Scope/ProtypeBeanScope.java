package com.ramesh9705.bean_Scope;

import org.springframework.beans.factory.config.ConfigurableListableBeanFactory;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope(value = ConfigurableListableBeanFactory.SCOPE_PROTOTYPE)
public class ProtypeBeanScope
{
	
}
