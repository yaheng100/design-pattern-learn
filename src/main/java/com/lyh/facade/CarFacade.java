package com.lyh.facade;


/**
 * @description: 自动挡汽车
 * 外观类：调用端提供统一的调用接口，外观类知道哪些子系统负责处理请求，从而将调用端的请求代理给适当子系统对象。
 *
 * @author: yaheng
 * @date: 2022/11/20 23:22
 */
public class CarFacade {

    private AutoClutch autoClutch;

    private DriveControl driveControl;

    private Engine engine;

    private Energy energy;


    public CarFacade() {
        this.autoClutch = AutoClutch.getInstance();
        this.driveControl = DriveControl.getInstance();
        this.engine = Engine.getInstance();
        this.energy = Energy.getInstance();
    }


    public void carReady(){
        energy.on();
        energy.out();
        driveControl.on();
        autoClutch.on();
        engine.startUp();
        System.out.println("汽车准备就绪...");
    }

    public void carRun(){
        driveControl.throttleIncrease();
        autoClutch.inGear();
        energy.out();
        engine.speedUp();
        System.out.println("汽车开始行驶...");
    }

    public void carTurn(){
        driveControl.throttleReduce();
        autoClutch.changeGear();
        engine.speedDown();
        driveControl.steering();
        System.out.println("汽车开始转弯...");
    }

    public void carPark(){
        driveControl.throttleReduce();
        autoClutch.changeGear();
        driveControl.brake();
        autoClutch.changeGear();
        engine.stop();
        autoClutch.off();
        driveControl.off();
        energy.off();
        System.out.println("汽车停车...");
    }

}
