package co.devfoundry;

public class CommonwealthFactory implements Factory{
    public Car buildFord(FordModel model) {
        switch (model) {
            case CMAX:
                return new Ford(SteeringWheelPosition.LEFT);
            case FOCUS:
                return new Ford(SteeringWheelPosition.LEFT);
            default:
                throw new IllegalArgumentException("Unknown Ford model");
        }
    }

    @Override
    public Car buildBMW(BMWModel model) {
        switch (model) {
            case X5:
                return new BMW(SteeringWheelPosition.LEFT);
            case E60:
                return new BMW(SteeringWheelPosition.LEFT);
            default:
                throw new IllegalArgumentException("Unknown BMW model");
        }
    }
}
