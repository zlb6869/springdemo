package com.zlb.spring.servlet.impl;

import com.zlb.spring.entity.Haha;
import com.zlb.spring.servlet.Ha;

public class Haimpl implements Ha {
    @Override
    public void show(Haha haha) {
        System.out.println(haha);
    }
}
