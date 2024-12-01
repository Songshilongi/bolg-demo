package songshilong.base;

import org.junit.Test;
import org.junit.platform.commons.annotation.Testable;
import songshilong.passing.People;
import songshilong.passing.TestMethodUtil;

/**
 * @BelongsProject: bolg-demo
 * @BelongsPackage: songshilong.base
 * @Author: Song shi long
 * @CreateTime: 2024-11-30  21:52
 * @Description: 参数传递测试类
 * @Version: 1.0
 */
public class ParameterPassingTest {
    private final TestMethodUtil testMethodUtil = new TestMethodUtil();
    @Test
    public void testBase() {
        byte a = 2;
        short b = 2;
        int c = 2;
        long d = 2L;
        float e = 3.0f;
        double f = 3.0;
        boolean g = false;
        char h = 's';
        System.out.println("基本数据类型值传递测试：");
        System.out.printf("方法执行之前：a=%d, b=%d, c=%d, d=%d, e=%.1f, f=%.1f, g=%b, h='%c'%n", a, b, c, d, e, f, g, h);
        testMethodUtil.valuePassing(a, b, c, d, e, f, g, h);
        System.out.printf("方法执行之前：a=%d, b=%d, c=%d, d=%d, e=%.1f, f=%.1f, g=%b, h='%c'%n", a, b, c, d, e, f, g, h);

        /*
        基本数据类型值传递测试：
        方法执行之前：a=2, b=2, c=2, d=2, e=3.0, f=3.0, g=false, h='s'
        方法执行之前：a=2, b=2, c=2, d=2, e=3.0, f=3.0, g=false, h='s'
         */
    }



    @Test
    public void testObject(){
        People people = new People();
        people.setName("Test");
        people.setAge(23);
        System.out.println("方法执行之前：" + people.toString());
        testMethodUtil.valuePassing(people);
        System.out.println("方法执行之后：" + people.toString());
    }
    /*
    方法执行之前：People(name=Test, age=23)
    方法执行之后：People(name=Ice.Song, age=18)
     */
}
