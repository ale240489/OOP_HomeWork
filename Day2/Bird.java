package HomeWork.Day2;

abstract class Bird extends Animal implements Affection{
    private String flightAltitude; //высота полета
    public Bird(int height, int weight, String eyeCollor) {
        super(height, weight, eyeCollor);
    }

    public void setFlightAltitude(String flightAltitude) {
        this.flightAltitude = flightAltitude;
    }

    public String getFlightAltitude() {
        return flightAltitude;
    }

    @Override
    public String toString() {
        return super.toString() + "\n" +
                "Высота полета = "+ flightAltitude;
    }


}
