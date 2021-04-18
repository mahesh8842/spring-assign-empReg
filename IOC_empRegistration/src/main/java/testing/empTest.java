package testing;
import java.util.*;

import org.springframework.beans.factory.support.DefaultListableBeanFactory;
import org.springframework.beans.factory.xml.XmlBeanDefinitionReader;


import controller.mainController;
import empVO.empVO;

public class empTest {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter employee name:: ");
		String name=sc.next();
		System.out.println("enter employee Address:: ");
		String addr=sc.next();
		System.out.println("enter employee basic salary:: ");
		String sal=sc.next();
		
		empVO vo=new empVO();
		vo.seteName(name);
		vo.seteAddrs(addr);
		vo.setBasicSalary(sal);
		
		DefaultListableBeanFactory factory=new DefaultListableBeanFactory();
		 XmlBeanDefinitionReader reader=new XmlBeanDefinitionReader(factory);
		 reader.loadBeanDefinitions("empCONFG/appContext.xml");
		 mainController controller=factory.getBean("controller",mainController.class);
		 
		 try {
			 String result=controller.processEmployee(vo);
			 System.out.println(result);
			 
		 }catch(Exception e) {
			 e.printStackTrace();
			 System.out.println("error occured !! please try again later");
		 }
		
	}
}
