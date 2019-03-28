package com.sly.demo.thymeleaf.tag;

import java.util.HashSet;
import java.util.Set;

import org.springframework.stereotype.Component;
import org.thymeleaf.dialect.AbstractDialect;
import org.thymeleaf.processor.IProcessor;

/**
 * _声明方言
 * @author sly
 * @time 2019年1月24日
 */
@Component
public class MyTagDialect extends AbstractDialect{

	private static final String PREFIX = "mytag";


	@Override
	public Set<IProcessor> getProcessors() {
		System.out.println("111");
		Set<IProcessor> processors = new HashSet<IProcessor>();
		processors.add(new MyTagProcessor());
		return processors;
	}

	@Override
	public String getPrefix() {
		return PREFIX;
	}

}
