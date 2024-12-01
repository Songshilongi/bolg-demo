package songshilong.clone.shallow.construct.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Objects;

/**
 * @BelongsProject: bolg-demo
 * @BelongsPackage: songshilong.clone.base.pojo
 * @Author: Song shi long
 * @CreateTime: 2024-11-30  20:30
 * @Description: 学校
 * @Version: 1.0
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
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


    public static School shallowCopy(School school) {
        if (Objects.isNull(school)) {
            return null;
        }
        School target = new School();
        target.setName(school.getName());
        target.setLocation(school.getLocation());
        target.setHeadmaster(school.getHeadmaster());
        target.setDepartmentList(school.getDepartmentList());
        return target;
    }

    public static School init() {
        School school = new School();
        school.setName("ECUST");
        school.setLocation("Shanghai, China");
        school.setHeadmaster(new People("Song Shi Long", 23));

        List<Department> departmentList = new ArrayList<>();
        People zhangSan = new People("ZhangSan", 22);
        Department it = new Department("IT", Collections.singletonList(zhangSan));
        departmentList.add(it);
        school.setDepartmentList(departmentList);
        return school;
    }
}
