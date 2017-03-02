package com.boss.oms.rpc.service;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * 服务启动类
 * Created by ZhangShuzheng on 2017/2/3.
 */
public class BossOmsRpcServiceApplication {

	private static Logger _log = LoggerFactory.getLogger(BossOmsRpcServiceApplication.class);

	public static void main(String[] args) {
		_log.info(">>>>> boss-oms-rpc-service 正在启动 <<<<<");
		new ClassPathXmlApplicationContext("classpath*:applicationContext*.xml");
		_log.info(">>>>> boss-oms-rpc-service 启动完成 <<<<<");
	}

}
