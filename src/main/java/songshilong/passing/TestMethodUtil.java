package songshilong.passing;

/**
 * @BelongsProject: bolg-demo
 * @BelongsPackage: songshilong.passing
 * @Author: Song shi long
 * @CreateTime: 2024-11-30  22:08
 * @Description: 值传递测试方法
 * @Version: 1.0
 */
public class TestMethodUtil {
    /**
     * 值传递测试方法 - 将传入的参数修改为指定值
     * @param a byte
     * @param b short
     * @param c int
     * @param d long
     * @param e float
     * @param f double
     * @param g boolean
     * @param h char
     */
    public void valuePassing(byte a, short b, int c, long d, float e, double f, boolean g, char h) {
        a = 1;
        b = 1;
        c = 1;
        d = 1L;
        e = 2.1f;
        f = 2.1;
        g = true;
        h = 'a';
    }
    /**
     * 值传递测试方法-传入对象
     * @param people {@link People}
     */
    public void valuePassing(People people) {
        people.setName("Ice.Song");
        people.setAge(18);
    }






}
