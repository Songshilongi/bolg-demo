package songshilong.clone.base.pojo;

import lombok.Data;

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
public class Department {
    /**
     * 部门名称
     */
    private String name;
    /**
     * 部门中的所有人
     */
    private List<People> peopleList;
}
