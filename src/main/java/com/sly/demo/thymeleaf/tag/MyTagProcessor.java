package com.sly.demo.thymeleaf.tag;

import org.springframework.stereotype.Component;
import org.thymeleaf.Arguments;
import org.thymeleaf.dom.Element;
import org.thymeleaf.processor.element.AbstractConditionalVisibilityElementProcessor;

/**
 * _处理器
 * 
 * @author sly
 * @time 2019年1月24日
 */
@Component
public class MyTagProcessor extends AbstractConditionalVisibilityElementProcessor {

	private static final int PRECEDENCE = 1000;
	private static final String TAG_NAME = "mytag";

	public MyTagProcessor() {
		super(TAG_NAME);
	}

	

	@Override
	public int getPrecedence() {
		return PRECEDENCE;
	}




	@Override
	protected boolean isVisible(Arguments arguments, Element element) {
		System.out.println("isVisible");
		String value = element.getAttributeValue("url");
		System.out.println(value);
		return true;
	}



	@Override
	protected boolean removeHostElementIfVisible(Arguments arguments, Element element) {
		System.out.println("removeHostElementIfVisible");
		return false;
	}
	

}
