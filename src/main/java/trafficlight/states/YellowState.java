package trafficlight.states;

import trafficlight.ctrl.TrafficLightCtrl;

public class YellowState implements State {

    private final TrafficLightCtrl ctrl;

    public YellowState(TrafficLightCtrl ctrl) {
        this.ctrl = ctrl;
    }

    @Override
    public void nextState() {
        if (ctrl.getPreviousState().equals(ctrl.getRedState())) {
            ctrl.setCurrentState(ctrl.getGreenState());
            ctrl.setPreviousState(this);
            System.out.println("GELB --> GRÜN");

        } else {
            ctrl.setCurrentState(ctrl.getRedState());
            ctrl.setPreviousState(this);
            System.out.println("GELB --> ROT");
        }
    }

    @Override
    public TrafficLightColor getState() {
        return TrafficLightColor.YELLOW;
    }
}
