package main.java.com.xzy.design.creatation.builder;

public class XiaomiBuilder extends AbstractBuilder {
    public XiaomiBuilder() {
        phone = new Phone();
    }

    @Override
    void customCpu(String cpu) {
        phone.cpu = cpu;
    }

    @Override
    void customMem(String mem) {
        phone.mem = mem;
    }

    @Override
    void customDisk(String disk) {
        phone.disk = disk;
    }

    @Override
    void customCam(String cam) {
        phone.cam = cam;
    }
}
