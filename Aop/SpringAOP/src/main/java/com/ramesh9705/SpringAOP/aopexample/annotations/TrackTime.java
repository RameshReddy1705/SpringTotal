package com.ramesh9705.SpringAOP.aopexample.annotations;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

//Methods
@Target(ElementType.METHOD)
//Run Time
@Retention(RetentionPolicy.RUNTIME)
public @interface TrackTime
{

}
