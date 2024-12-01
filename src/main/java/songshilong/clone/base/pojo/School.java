package songshilong.clone.base.pojo;

import lombok.Data;
import songshilong.passing.People;

import java.util.List;

/**
 * @BelongsProject: bolg-demo
 * @BelongsPackage: songshilong.clone.base.pojo
 * @Author: Song shi long
 * @CreateTime: 2024-11-30  20:30
 * @Description: 学校
 * @Version: 1.0
 */
@Data
public class School {
    /**
     * 学校名称
     */
    private String name;
    /**
     * 学校地点
     */
    private String location;
    /**
     * 校长
     */
    private People headmaster;
    /**
     * 学校中的所有部门
     */
    private List<Department> departmentList;

}
