package Q_04;

public class Cat extends Pet {
    private String coatColor;

    public String getCoatColor() {
        return coatColor;
    }

    public void setCoatColor(String coatColor) {
        this.coatColor = coatColor;
    }

    @Override
    public String getType() {
        return "Cat";
    }
}
