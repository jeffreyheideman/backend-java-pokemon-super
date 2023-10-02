public class WaterPokemon extends Pokemon{

    private String rainDance;

    private boolean isBlue;
    public WaterPokemon(String name, int level, String sound, String rainDance, boolean isBlue) {
        super(name, level, sound);
        this.isBlue = isBlue;
        this.rainDance = rainDance;

    }

    @Override
    public void eats() {
        System.out.println(getName() + " eats water berries.");

    }

    public void attacksWithWaterBlast() {
        System.out.println(getName() + " has ability to attack with water blast.");
    }

    public void attacksWithHydroPump() {
        System.out.println(getName() + " has ability to attack with hydro pump.");
    }


    public boolean isBlue() {
        return isBlue;
    }

    public void setBlue(boolean blue) {
        isBlue = blue;
    }

    public String getRainDance() {
        return rainDance;
    }

    public void setRainDance(String rainDance) {
        this.rainDance = rainDance;
    }
}
