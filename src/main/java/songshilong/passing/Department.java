package songshilong.passing;

import lombok.Data;

import java.util.List;

/**
 * @BelongsProject: bolg-demo
 * @BelongsPackage: songshilong.passing
 * @Author: Song shi long
 * @CreateTime: 2024-11-30  22:38
 * @Description: demo
 * @Version: 1.0
 */
@Data
public class Department {
    /**
     * 部门名称
     */
    private String name;
    /**
     * 成员
     */
    private List<People> peopleList;
}
