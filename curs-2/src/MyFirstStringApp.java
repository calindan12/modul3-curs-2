import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MyFirstStringApp {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");

        BeanExample beanExample = context.getBean("beanExample" , BeanExample.class);
        BeanExample beanExample2 = context.getBean("beanExample" , BeanExample.class);
        System.out.println(beanExample == beanExample2);

        System.out.println(beanExample);

        beanExample.randomPackagePrivateMethod();
        beanExample.randomPublicMethod(1, "test");
        beanExample.loggablePackagePrivateMethod();
    }
}
