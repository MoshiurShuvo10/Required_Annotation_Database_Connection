package driver;

import java.sql.SQLException;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

import bean.DBClass;

public class Client {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		
		Resource resource = new ClassPathResource("configuration/configure.xml");
		BeanFactory bfactory = new XmlBeanFactory(resource);
		DBClass dbClass = (DBClass)bfactory.getBean("dbc");
		dbClass.displayConnectionInfo();
	}

}
