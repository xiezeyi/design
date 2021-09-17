package com.xzy.design.structural.adaptor.clazz;

import com.xzy.design.structural.adaptor.Player;
import com.xzy.design.structural.adaptor.Zh_JPtranslator;

/**
 * 继承的方式：类结构模型，适配转换到了翻译器的功能
 */
public class JPMoviePlayerAdapter extends Zh_JPtranslator implements Player {

    private Player target;//类适配对象
    public JPMoviePlayerAdapter(Player target){
        this.target = target;
    }
    @Override
    public String play() {
        String play = target.play();
        // 转换字幕
        play = translate(play);
        System.out.println(play);
        return play;
    }
}
