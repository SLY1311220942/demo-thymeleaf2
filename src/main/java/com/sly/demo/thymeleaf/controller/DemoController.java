package com.sly.demo.thymeleaf.controller;

import java.util.ArrayList;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.sly.demo.thymeleaf.model.DemoModel;

/**
 * demo controller类
 * @author sly
 * @time 2019年1月10日
 */
@Controller
@RequestMapping("/demo")
public class DemoController {
	
	/**
	 * 
	 * @return
	 * @author sly
	 * @time 2019年1月10日
	 */
	@RequestMapping("/index1")
	public String index1(HttpServletRequest request,HttpServletResponse response) {
		
		List<DemoModel> demoModels = new ArrayList<>();
		demoModels.add(new DemoModel("1", "第一条数据"));
		demoModels.add(new DemoModel("2", "第二条数据"));
		demoModels.add(new DemoModel("3", "第三条数据"));
		demoModels.add(new DemoModel("4", "第四条数据"));
		demoModels.add(new DemoModel("5", "第五条数据"));
		
		request.setAttribute("title", "Thymeleaf模板文件");
		request.setAttribute("demoModels", demoModels);
		request.setAttribute("type", 1);
		return "index1";
	}
}
