package com.doing;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

/**
 * 启动程序
 *
 * @author doing
 */
@SpringBootApplication(exclude = {
        DataSourceAutoConfiguration.class,
        org.activiti.spring.boot.SecurityAutoConfiguration.class,
})
public class DoingApplication
{
    public static void main(String[] args)
    {
        // System.setProperty("spring.devtools.restart.enabled", "false");
        SpringApplication.run(DoingApplication.class, args);
        System.out.println("(♥◠‿◠)ﾉﾞ  doing启动成功   ლ(´ڡ`ლ)ﾞ ");
    }
}
