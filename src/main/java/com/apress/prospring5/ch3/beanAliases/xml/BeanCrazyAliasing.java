package com.apress.prospring5.ch3.beanAliases.xml;

import java.util.Arrays;
import java.util.Map;

import org.springframework.context.support.GenericXmlApplicationContext;

public class BeanCrazyAliasing {

	public static void main(String[] args) {
		
		// 컨테이너 생성 
		GenericXmlApplicationContext ctx = new GenericXmlApplicationContext();
		// 컨테이너 로드 
		ctx.load("classpath:spring/beanAliases/app-context-03.xml");
		// 컨테이너 객체 생성 
		ctx.refresh();
		
		
		Map<String, String> beans = ctx.getBeansOfType(String.class);
		beans.entrySet().stream().forEach(b ->
				System.out.println(
						"id: " + b.getKey() + "\n 별칭: "
								+ Arrays.toString(ctx.getAliases(b.getKey())) + "\n")
		);
		
		//id="jon johnny,jonathan;jim"
		//id: jon johnny,jonathan;jim
		// 별칭: []

		//name="jon johnny,jonathan;jim"
		//id: jon
		// 별칭: [jonathan, jim, johnny]
		
		// 별칭을 만드는것은 유용하다 
		// 다수에 빈 이름을 변경 해야 할 작업시 유용하다 
		
	}

}
