package com.itheima.buider.buider;

/**
 * @author Create by 周思聪
 * @date 2019/4/7 14:23
 */
public class SxtAirShipDirector implements AirShipDirector {

    private AirShipBuilder builder;

    public SxtAirShipDirector(AirShipBuilder builder) {
        this.builder = builder;
    }

    @Override
    public AirShip directAirShip() {
        Engine engine = builder.buildEngine();
        OrbitalModule orbitalModule = builder.buildOrbitalModule();
        EscapeTower escapeTower = builder.buildEscapeTower();
        AirShip airShip = new AirShip();
        airShip.setEngine(engine);
        airShip.setEscapeTower(escapeTower);
        airShip.setOrbitalModule(orbitalModule);
        return airShip;
    }
}
