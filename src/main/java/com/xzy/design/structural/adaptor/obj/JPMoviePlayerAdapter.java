package com.xzy.design.structural.adaptor.obj;

import com.xzy.design.structural.adaptor.Player;
import com.xzy.design.structural.adaptor.Translator;
import com.xzy.design.structural.adaptor.Zh_JPtranslator;

/**
 * 组合的方式： 对象结构模型，适配转换到了翻译器的功能
 */
public class JPMoviePlayerAdapter implements Player {
    private Translator translate = new Zh_JPtranslator();
    private Player target;//类适配对象
    public JPMoviePlayerAdapter(Player target){
        this.target = target;
    }



    @Override
    public String play() {
        String play = target.play();
        // 转换字幕
        play = translate.translate(play);
        System.out.println(play);
        return play;
    }
}
