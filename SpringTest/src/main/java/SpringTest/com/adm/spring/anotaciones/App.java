package SpringTest.com.adm.spring.anotaciones;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "***************Alineaciones del Partido*************************" );
        
        ApplicationContext context = new ClassPathXmlApplicationContext("beansFutbol.xml");   
		Partido partido = (Partido) context.getBean("juego");
		System.out.println("datos del Partido: " + partido.toString());
        
        

    	
    }
}
