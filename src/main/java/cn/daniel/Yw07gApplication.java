package cn.daniel;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;

@SpringBootApplication
public class Yw07gApplication {

    private static Logger logger = LoggerFactory.getLogger(Yw07gApplication.class);

    @Bean
    protected ServletContextListener listener() {
        return new ServletContextListener() {

            @Override
            public void contextInitialized(ServletContextEvent sce) {
                logger.info("ServletContext initialized");
            }

            @Override
            public void contextDestroyed(ServletContextEvent sce) {
                logger.info("ServletContext destroyed");
            }
        };
    }

    public static void main(String[] args) {
        long now = System.currentTimeMillis();
        SpringApplication.run(Yw07gApplication.class, args);
        logger.info("Application startup coasts {}ms.", (System.currentTimeMillis() - now));
    }
}
