package com.annotation;

public @interface MyAnno1 {
        String aaa();
        int bbb();
        MyEnum ccc();

//        void ddd();
        //返回值有限制，只能为基本数据类型、String、枚举,以及以上类型的数组
//        Integer bbb();

}
