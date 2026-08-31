import org.example.EmpService;
import org.example.EmpService;
import org.junit.jupiter.api.*;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;
public class UserService3Test {
    EmpService es;
    @BeforeEach
    public void init(){
        es=new EmpService();
    }
    @Test
    @DisplayName("测试出生年份计算")
    public void test1(){
        Assertions.assertEquals("1981",es.getYear("411310198103259988"));
        Assertions.assertEquals("1983",es.getYear("411310198303259988"));
    }
    @Test
    @DisplayName("测试出生月份计算")
    public void test2(){
        Assertions.assertEquals("11",es.getMonth("411310198111259988"));
        Assertions.assertEquals("03",es.getMonth("411310198103259988"));
    }
}
