import org.junit.jupiter.api.Test;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

public class JDBCTest {

    /**
     * 抽取的更新方法：参数由外部传入，不再写死
     * @param password 新密码
     * @param name 新名字
     * @param age 新年龄
     * @param id 要修改记录的id
     * @return 受影响行数
     * @throws Exception
     */
    public int updateUser(String password, String name, Integer age, Integer id) throws Exception{
        // 连接信息
        String url = "jdbc:mysql://localhost:3306/java_web_hw_day6_02?useSSL=false&serverTimezone=Asia/Shanghai";
        String user = "javaweb";
        String pwd = "";

        try (Connection conn = DriverManager.getConnection(url, user, pwd);
             PreparedStatement pstmt = conn.prepareStatement("update user set password = ? , name = ?, age = ? where id = ?")){

            // 用传入的函数参数填充占位符
            pstmt.setString(1, password);
            pstmt.setString(2, name);
            pstmt.setInt(3, age);
            pstmt.setInt(4, id);

            return pstmt.executeUpdate();
        }
    }



    @Test
    public void testJdbc() throws Exception{
        // 调用方法，在这里传参，每次测试可以改成不同的值
        int rows = updateUser("666888", "关羽", 32, 4);
        System.out.println("影响行数 = " + rows);
    }
}