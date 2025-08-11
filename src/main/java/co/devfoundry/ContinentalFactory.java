package co.devfoundry;

public class ContinentalFactory implements Factory {
    public Car buildFord(FordModel model) {
        switch (model) {
            case CMAX:
                return new Ford(SteeringWheelPosition.RIGHT);
            case FOCUS:
                return new Ford(SteeringWheelPosition.RIGHT);
            default:
                throw new IllegalArgumentException("Unknown Ford model");
        }
    }

    @Override
    public Car buildBMW(BMWModel model) {
        switch (model) {
            case X5:
                return new BMW(SteeringWheelPosition.RIGHT);
            case E60:
                return new BMW(SteeringWheelPosition.RIGHT);
            default:
                throw new IllegalArgumentException("Unknown BMW model");
        }
    }
}
