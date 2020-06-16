package com.mini.task;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * @author : WiuLuS
 */
public class SystemRuntimeInformation {

	private static Logger log = LoggerFactory.getLogger(SystemRuntimeInformation.class);
	/**
	 * 定时扫描，详情页或者索引失败的数据并补偿
	 */
	public void rePush(){
		long start = System.currentTimeMillis();
		System.out.println("定时任务开始：---");
		System.out.println("定时任务结束：---");
		System.out.println("共耗时：" + (System.currentTimeMillis()-start));
	}



}
