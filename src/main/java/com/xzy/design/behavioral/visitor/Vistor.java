package com.xzy.design.behavioral.visitor;

public interface Vistor {
    void visitCPU(CPU cpu);

    void visitDisk(Disk disk);

}
