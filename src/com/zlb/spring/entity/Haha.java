package com.zlb.spring.entity;

import org.springframework.stereotype.Component;

//组件扫描有component、repository、service、controller
//属性注入 autowired、qualifier、resource
@Component
public class Haha {
    private String name;
    public void said(){
        System.out.println("wo shi haha");
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}
