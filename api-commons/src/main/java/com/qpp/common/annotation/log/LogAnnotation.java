package com.qpp.common.annotation.log;

import java.lang.annotation.*;


/**
 * @author qipengpai
 * @Title: DataSource
 * @ProjectName misscy
 * @Description: TODO 日志注解
 * @date 10:30 2018/10/22
 */
@Target({ElementType.METHOD, ElementType.TYPE})
@Retention(RetentionPolicy.RUNTIME)
@Documented
public @interface LogAnnotation {

	/**
	 * 模块
	 * @return
	 */
	String module();

	/**
	 * 记录执行参数
	 * @return
	 */
	boolean recordRequestParam() default true;
}
