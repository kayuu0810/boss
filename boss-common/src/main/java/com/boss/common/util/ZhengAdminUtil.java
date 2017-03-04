package com.boss.common.util;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.web.context.ServletContextAware;

import javax.servlet.ServletContext;

/**
 * 启动解压zhengAdmin-x.x.x.jar到resources目录
 * Created by Kayuu on 2016/12/18.
 */
public class ZhengAdminUtil implements InitializingBean, ServletContextAware {

    private static Logger _log = LoggerFactory.getLogger(ZhengAdminUtil.class);

    @Override
    public void afterPropertiesSet() throws Exception {

    }

    @Override
    public void setServletContext(ServletContext servletContext) {
        _log.info("===== 开始解压boss-ui =====");
        String version = PropertiesFileUtil.getInstance().get("boss-ui.version");
        _log.info("boss-ui.jar 版本: {}", version);
        String jarPath = servletContext.getRealPath("/WEB-INF/lib/boss-ui-" + version + ".jar");
        _log.info("boss-ui.jar 包路径: {}", jarPath);
        String resources = servletContext.getRealPath("/") + "/resources/boss-ui";
        _log.info("boss-ui.jar 解压到: {}", resources);
        JarUtil.decompress(jarPath, resources);
        _log.info("===== 解压boss-ui完成 =====");
    }

}
