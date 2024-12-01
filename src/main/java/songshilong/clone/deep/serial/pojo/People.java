package songshilong.clone.deep.serial.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

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
public class People implements Serializable {
    private static final long SERIAL_VERSION_UID = 74153135415311325L;
    /**
     * 姓名
     */
    private String name;
    /**
     * 年龄
     */
    private Integer age;
}
