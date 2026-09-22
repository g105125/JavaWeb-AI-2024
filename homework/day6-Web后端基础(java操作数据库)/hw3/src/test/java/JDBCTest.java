import org.junit.jupiter.api.Test;
import pojo.User;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

public class JDBCTest {
    public List<User> selectUser(Integer age, Integer id) throws Exception{
        // 连接信息
        String url = "jdbc:mysql://localhost:3306/java_web_hw_day6_02?useSSL=false&serverTimezone=Asia/Shanghai";
        String user = "javaweb";
        String pwd = "";

        try (Connection conn = DriverManager.getConnection(url, user, pwd);
             PreparedStatement pstmt = conn.prepareStatement("select id,username,password,name,age from user where age >= ? and id <= ? ;")){
            pstmt.setInt(1,age);
            pstmt.setInt(2,id);
            // 用传入的函数参数填充占位符
            ResultSet resultset=pstmt.executeQuery();
            ArrayList<User>users=new ArrayList<>() ;
            while(resultset.next()){
                Integer sid=resultset.getInt("id");
                String sname=resultset.getString("name");
                String susername=resultset.getString("username");
                String spassword=resultset.getString("password");
                Integer sage=resultset.getInt("age");
                users.add(new User(sid,susername,spassword,sname,sage));
            }

            return users;
        }
    }


    @Test
    public void testJdbc() throws Exception{
        // 调用方法，在这里传参，每次测试可以改成不同的值
        List<User> users=selectUser(20,4);
        System.out.println(users);
    }
}