package com.boss.upms.rpc.service;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * 服务启动类
 */
public class BossUpmsRpcServiceApplication {

	private static Logger _log = LoggerFactory.getLogger(BossUpmsRpcServiceApplication.class);

	public static void main(String[] args) {
		_log.info(">>>>> boss-upms-rpc-service 正在启动 <<<<<");
		new ClassPathXmlApplicationContext("classpath*:applicationContext*.xml");
		_log.info(">>>>> boss-upms-rpc-service 启动完成 <<<<<");
	}

}
