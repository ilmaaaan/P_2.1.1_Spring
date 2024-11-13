import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App {
    public static void main(String[] args) {
        ApplicationContext applicationContext =
                new AnnotationConfigApplicationContext(AppConfig.class);
        HelloWorld helloOne =
                applicationContext.getBean("helloworld", HelloWorld.class);
        HelloWorld helloTwo =
                applicationContext.getBean("helloworld", HelloWorld.class);
        System.out.println(helloOne.getMessage());
        System.out.println(helloOne == helloTwo);

        Cat catOne = applicationContext.getBean("catBean", Cat.class);
        Cat catTwo = applicationContext.getBean("catBean", Cat.class);

        System.out.println(catOne == catTwo);
    }
}