package songshilong.base;

import org.junit.Test;
import songshilong.clone.deep.serial.pojo.School;

import java.io.*;

/**
 * @BelongsProject: bolg-demo
 * @BelongsPackage: songshilong.base
 * @Author: Song shi long
 * @CreateTime: 2024-12-01  19:59
 * @Description: TODO
 * @Version: 1.0
 */
public class DeepCopyBySerializeTest {
    
    
    @Test
    public void test(){
        School baseSchool = School.init();
        School copySchool = School.copyBySerial(baseSchool);
        System.out.println("被拷贝对象：" + baseSchool);
        System.out.println("拷贝结果" +copySchool);

    }
}
