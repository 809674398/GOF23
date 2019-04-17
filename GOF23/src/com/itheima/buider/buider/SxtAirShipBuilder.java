package com.itheima.buider.buider;

/**
 * @author Create by 周思聪
 * @date 2019/4/7 14:20
 */
public class SxtAirShipBuilder implements AirShipBuilder {
    @Override
    public Engine buildEngine() {
        System.out.println("构建发动机");
        return new Engine("发动机生产完成");
    }

    @Override
    public OrbitalModule buildOrbitalModule() {
        System.out.println("构建轨道舱");
        return new OrbitalModule("轨道舱生产完成");
    }

    @Override
    public EscapeTower buildEscapeTower() {
        System.out.println("组装逃离仓");
        return new EscapeTower("逃离仓生产完成");
    }
}
