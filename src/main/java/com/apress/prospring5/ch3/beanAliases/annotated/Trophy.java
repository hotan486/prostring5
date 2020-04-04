package com.apress.prospring5.ch3.beanAliases.annotated;

import org.springframework.core.annotation.AliasFor;

@Award
public @interface Trophy {

	@AliasFor(annotation = Award.class, attribute = "value")
	String[] name() default {};
}
