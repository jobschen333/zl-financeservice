package com.meizhuliu.zl.finance.service.impl;

import com.meizhuliu.zl.finance.service.Adaptee;
import com.meizhuliu.zl.finance.service.Target;

/**
 * @author chxy
 * @date 2021/6/13 23:30
 */
public class ClassAdapter extends Adaptee implements Target {
    @Override
    public void request() {
        specificRequest();
    }

    public static void main(String[] args) {
        Target target = new ClassAdapter();
        target.request();
    }
}
