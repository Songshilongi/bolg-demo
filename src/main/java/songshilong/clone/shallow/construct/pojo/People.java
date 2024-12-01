package songshilong.clone.shallow.construct.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @BelongsProject: bolg-demo
 * @BelongsPackage: songshilong.clone.base.pojo
 * @Author: Song shi long
 * @CreateTime: 2024-11-30  20:34
 * @Description: 人
 * @Version: 1.0
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class People {
    /**
     * 姓名
     */
    private String name;
    /**
     * 年龄
     */
    private Integer age;
}
