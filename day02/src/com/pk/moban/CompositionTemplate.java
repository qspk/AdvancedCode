package com.pk.moban;

/**
 * 作文模版  抽象类设计
 */
public abstract class CompositionTemplate {
    public void write() {
        System.out.println("<<我的爸爸>>");

        body();

        System.out.println("啊~这就是我的爸爸");
    }

    public abstract void body();

}
