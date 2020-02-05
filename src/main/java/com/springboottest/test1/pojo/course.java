package com.springboottest.test1.pojo;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

/**
 * @ClassName pet
 * @Description: TODO
 * @Author lxl
 * @Date 2020/1/19
 * @Version V1.0
 **/
@Component
public class course {

    @Value("旺财")
    private String name;
    @Value("3")
    private Integer age;

    public course() {
    }

    public course(String name, Integer age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "course{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }

}
