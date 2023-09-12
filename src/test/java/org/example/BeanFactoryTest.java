package org.example;

import org.example.service.UserService;
import org.example.service.impl.UserServiceImpl;
import org.springframework.beans.factory.support.DefaultListableBeanFactory;
import org.springframework.beans.factory.xml.XmlBeanDefinitionReader;

public class BeanFactoryTest {
    public static void main(String[] args) {
        // 创建工厂对象
        DefaultListableBeanFactory beanFactory = new DefaultListableBeanFactory() ;
        // 创建读取器
        XmlBeanDefinitionReader reader = new XmlBeanDefinitionReader(beanFactory) ;
        // 读取配置文件给工厂
        reader.loadBeanDefinitions("beans.xml") ;
        //
        UserService userService = (UserServiceImpl)beanFactory.getBean("userService");
        System.out.println(userService);
    }
}
