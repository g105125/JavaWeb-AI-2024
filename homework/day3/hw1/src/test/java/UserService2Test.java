import org.example.EmpService;
import org.example.EmpService;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

public class UserService2Test {
    EmpService es;

    @BeforeEach
    public void init() {
        es = new EmpService();
    }

    @DisplayName("测试getGender方法")
    @ParameterizedTest
    @ValueSource(strings = {"610110201909091231", "510310198812120931"})
    public void userServiceTest1(String idcard) {
        Assertions.assertEquals("男", es.getGender(idcard), "测试失败");
    }
}
