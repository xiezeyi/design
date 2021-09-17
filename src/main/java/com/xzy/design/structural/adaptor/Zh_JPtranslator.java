package com.xzy.design.structural.adaptor;

public class Zh_JPtranslator implements Translator{
    @Override
    public String translate(String content) {
        if ("你好".equals(content)){
            return "hello";
        }else {
            return "******";
        }
    }
}
