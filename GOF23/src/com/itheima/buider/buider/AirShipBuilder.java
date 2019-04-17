package com.itheima.buider.buider;

/**
 * 构建子组件的接口
 * @author Create by 周思聪
 * @date 2019/4/7 14:10
 */
public interface AirShipBuilder {
    Engine buildEngine();
    OrbitalModule buildOrbitalModule();
    EscapeTower buildEscapeTower();
}
