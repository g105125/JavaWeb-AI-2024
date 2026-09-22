package pojo;

import lombok.ToString;

@ToString
public class User {
    public Integer id;
    public String username;
    public String password;
    public String name;
    public Integer age;
    public User(Integer id,String username,String password,String name,Integer age){
        this.id=id;
        this.username=username;
        this.password=password;
        this.name=name;
        this.age=age;
    }
}
