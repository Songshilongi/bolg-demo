package songshilong.clone.deep.serial.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;
import java.util.List;

/**
 * @BelongsProject: bolg-demo
 * @BelongsPackage: songshilong.clone.base.pojo
 * @Author: Song shi long
 * @CreateTime: 2024-11-30  20:34
 * @Description: 学校中的某个部门
 * @Version: 1.0
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Department implements Serializable {

    private static final long SERIAL_VERSION_UID = 564561564848647545L;
    /**
     * 部门名称
     */
    private String name;
    /**
     * 部门中的所有人
     */
    private List<People> peopleList;
}
