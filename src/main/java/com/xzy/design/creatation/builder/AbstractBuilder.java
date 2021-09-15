package com.xzy.design.creatation.builder;

/**
 * 抽象建造者
 */
public abstract class AbstractBuilder {

    Phone phone;

    abstract void customCpu(String cpu);

    abstract void customMem(String mem);

    abstract void customDisk(String disk);

    abstract void customCam(String cam);

    Phone getProduct() {
        return phone;
    }
}
