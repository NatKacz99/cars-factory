package co.devfoundry;

public interface Factory
{
    Car buildFord(FordModel model);
    Car buildBMW(BMWModel model);
}
