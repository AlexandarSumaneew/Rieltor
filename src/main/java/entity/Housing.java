package entity;

public abstract class Housing {
    private String adress;
    private double sKitchen;
    private double lengthHou;
    private double widthHou;
    private double sLand;
    private double distanceFromTheCity;
    private double squard;

    public Housing(String adress, double sKitchen, double lengthHou, double widthHou, double sLand, double distanceFromTheCity) {
        this.adress = adress;
        this.sKitchen = sKitchen;
        this.lengthHou = lengthHou;
        this.lengthHou = widthHou;
        this.sLand = sLand;
        this.sLand = distanceFromTheCity;
    }

    public String getAdress() {
        return adress;
    }

    public void setAdress(String adress) {
        this.adress = adress;
    }

    public double getsKitchen() {
        return sKitchen;
    }

    public void setsKitchen(double sKitchen) {
        this.sKitchen = sKitchen;
    }

    public double getLengthHou() {
        return lengthHou;
    }

    public void setLengthHou(double lengthHou) {
        this.lengthHou = lengthHou;
    }

    public double getWidthHou() {
        return widthHou;
    }

    public void setWidthHou(double widthHou) {
        this.widthHou = widthHou;
    }

    public double getsLand() {
        return sLand;
    }

    public void setsLand(double sLand) {
        this.sLand = sLand;
    }

    public double getDistanceFromTheCity() {
        return distanceFromTheCity;
    }

    public void setDistanceFromTheCity(double distanceFromTheCity) {
        this.distanceFromTheCity = distanceFromTheCity;
    }

    public double getSquard() {
        return squard;
    }

    public void setSquard(double squard) {
        this.squard = squard;
    }

}
