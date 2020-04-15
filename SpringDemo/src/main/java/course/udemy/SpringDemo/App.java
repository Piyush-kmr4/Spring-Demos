package course.udemy.SpringDemo;

//import org.springframework.beans.factory.BeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
//import org.springframework.beans.factory.xml.XmlBeanFactory;
//import org.springframework.core.io.FileSystemResource;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    	//@SuppressWarnings("deprecation")
		//BeanFactory factory=new XmlBeanFactory(new FileSystemResource("spring.xml"));
        ApplicationContext factory = new ClassPathXmlApplicationContext("spring.xml");
    	
    	Alien obj=(Alien)factory.getBean("alien");
        //obj.code();
        
        obj.getLap().compile();
        
      
    }
}
