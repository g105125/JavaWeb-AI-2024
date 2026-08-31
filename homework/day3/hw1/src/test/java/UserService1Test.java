import org.example.EmpService;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.DisplayName;

public class UserService1Test {
    EmpService es;
    @BeforeEach
    public void init(){
        es=new EmpService();
    }
    @Test
    @DisplayName("是否是北京人")
    public void userServiceTest1(){
        String data="112312200606190032";
        System.out.println("测试1:");
        System.out.println(data);
        System.out.print("正确结果:true");
        System.out.println("测试结果"+es.isBeijing(data));
        data="411324200501190054";
        System.out.println(data);
        System.out.print("正确结果:false");
        System.out.println("测试结果"+es.isBeijing(data));
    }
    @Test
    @DisplayName("计算年龄")
    public void userServiceTest2(){
        String data="112312200606190032";
        System.out.println("测试2:");
        System.out.println(data);
        System.out.print("正确结果:20");
        System.out.println("测试结果"+es.getAge(data));
        data="411324200501190054";
        System.out.println(data);
        System.out.print("正确结果:21");
        System.out.println("测试结果"+es.getAge(data));
    }
}
