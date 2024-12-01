package songshilong.base;

import org.junit.Test;
import songshilong.clone.shallow.construct.pojo.School;

/**
 * @BelongsProject: bolg-demo
 * @BelongsPackage: songshilong.base
 * @Author: Song shi long
 * @CreateTime: 2024-12-01  18:49
 * @Description: TODO
 * @Version: 1.0
 */
public class ShallowCopyByConstructTest {


    @Test
    public void testShallowCopyByConstructor(){
        School baseSchool = School.init();
        School copySchool = School.shallowCopy(baseSchool);
        System.out.println("被拷贝对象：" + baseSchool);
        System.out.println("拷贝结果" +copySchool);
    }
}
