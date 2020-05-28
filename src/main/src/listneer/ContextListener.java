package listneer;

import org.springframework.web.context.ContextLoader;

import javax.servlet.ServletContext;
import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;

public class ContextListener  extends ContextLoader implements ServletContextListener {
    public void contextInitialized(ServletContextEvent servletContextEvent) {
        ServletContext servletContext = servletContextEvent.getServletContext();
        this.initWebApplicationContext(servletContext);
    }

    public void contextDestroyed(ServletContextEvent servletContextEvent) {
        this.closeWebApplicationContext(servletContextEvent.getServletContext());
    }
}
