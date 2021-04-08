package trafficlight.states;

import trafficlight.ctrl.TrafficLightCtrl;

public class GreenState implements State {

    private final TrafficLightCtrl ctrl;

    public GreenState(TrafficLightCtrl ctrl) {
        this.ctrl = ctrl;
    }

    @Override
    public void nextState() {
        ctrl.setPreviousState(this);
        ctrl.setCurrentState(ctrl.getYellowState());
        System.out.println("GRÜN --> GELB");
    }

    @Override
    public TrafficLightColor getState() {
        return TrafficLightColor.GREEN;
    }
}
