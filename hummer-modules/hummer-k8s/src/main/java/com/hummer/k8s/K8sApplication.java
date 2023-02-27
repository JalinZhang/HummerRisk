package com.hummer.k8s;

import com.hummer.common.security.annotation.EnableHrFeignClients;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

/**
 * 云原生模块
 *
 * @author harris1943
 */
@EnableHrFeignClients
@SpringBootApplication(exclude={DataSourceAutoConfiguration.class})
public class K8sApplication {
    public static void main(String[] args) {
        SpringApplication.run(K8sApplication.class, args);
        System.out.println("    {HTTP/1.1, (http/1.1)}{0.0.0.0:9500}");
        System.out.println("    (♥◠‿◠)ﾉﾞ  云原生模块启动成功   ლ(´ڡ`ლ)ﾞ  \n" +
                "  \n" +
                "  ██╗  ██╗██╗   ██╗███╗   ███╗███╗   ███╗███████╗██████╗     ██╗  ██╗ █████╗ ███████╗\n" +
                "  ██║  ██║██║   ██║████╗ ████║████╗ ████║██╔════╝██╔══██╗    ██║ ██╔╝██╔══██╗██╔════╝\n" +
                "  ███████║██║   ██║██╔████╔██║██╔████╔██║█████╗  ██████╔╝    █████╔╝ ╚█████╔╝███████╗\n" +
                "  ██╔══██║██║   ██║██║╚██╔╝██║██║╚██╔╝██║██╔══╝  ██╔══██╗    ██╔═██╗ ██╔══██╗╚════██║\n" +
                "  ██║  ██║╚██████╔╝██║ ╚═╝ ██║██║ ╚═╝ ██║███████╗██║  ██║    ██║  ██╗╚█████╔╝███████║\n" +
                "  ╚═╝  ╚═╝ ╚═════╝ ╚═╝     ╚═╝╚═╝     ╚═╝╚══════╝╚═╝  ╚═╝    ╚═╝  ╚═╝ ╚════╝ ╚══════╝");
    }
}
