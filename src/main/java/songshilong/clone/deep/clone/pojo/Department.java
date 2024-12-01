package songshilong.clone.deep.clone.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.ArrayList;
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
public class Department implements Cloneable{
    /**
     * 部门名称
     */
    private String name;
    /**
     * 部门中的所有人
     */
    private List<People> peopleList;

    @Override
    protected Object clone() throws CloneNotSupportedException {
        Object obj = super.clone();
        Department department = (Department) obj;
        List<People> peopleList = new ArrayList<>();
        for (People people : department.getPeopleList()) {
            peopleList.add((People) people.clone());
        }
        department.setPeopleList(peopleList);
        return obj;
    }
}
