package songshilong.base;

import org.junit.Test;
import songshilong.clone.shallow.clone.pojo.School;

/**
 * @BelongsProject: bolg-demo
 * @BelongsPackage: songshilong.base
 * @Author: Song shi long
 * @CreateTime: 2024-12-01  19:17
 * @Description: TODO
 * @Version: 1.0
 */
public class ShallowCopyByCloneTest {


    @Test
    public void test() throws CloneNotSupportedException {
        School baseSchool = School.init();
        School copySchool = (School) baseSchool.clone();
        System.out.println("被拷贝对象：" + baseSchool);
        System.out.println("拷贝结果" +copySchool);
    }
}
