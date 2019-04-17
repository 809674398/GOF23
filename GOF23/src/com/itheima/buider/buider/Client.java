package com.itheima.buider.buider;

/**
 * 客户端调用构建者模式的对象
 * @author Create by 周思聪
 * @date 2019/4/7 14:29
 */
public class Client {
    public static void main(String[] args) {
        AirShipDirector airShipDirector = new SxtAirShipDirector(new SxtAirShipBuilder());
        AirShip airShip = airShipDirector.directAirShip();
        System.out.println(airShip.getEngine().getName());
    }

}
