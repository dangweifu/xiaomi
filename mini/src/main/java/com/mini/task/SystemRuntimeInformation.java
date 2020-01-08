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
//        boolean b = ConcurrentUtil.bindHibernateSessionToThread(sessionFactory);
//        try {
            log.info("定时补偿发布失败数据------------start-------------");
//            serviceI.rePush();
            log.info("定时补偿发布失败数据------------end 耗时：{}-------------",(System.currentTimeMillis()-start));
//        }finally {
//            ConcurrentUtil.closeHibernateSessionFromThread(b,sessionFactory);
//        }

	}



}
