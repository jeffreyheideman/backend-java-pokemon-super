public class FirePokemon extends Pokemon{

    private boolean hasExternalFire;

    private int firePower;


    public FirePokemon(String name, int level, String sound, int firePower, boolean hasExternalFire) {
        super(name, level, sound);
        this.firePower = firePower;
        this.hasExternalFire = hasExternalFire;
    }

    @Override
    public void eats() {
        System.out.println(getName() + " eats fire berries.");
    }

    public void flameThrower() {
        System.out.println(getName() + " has ability to attack with flame thrower.");
    }

    public void fireBlast() {
        System.out.println(getName() + " has ability to attack with fire blast.");
    }

    public boolean isHasExternalFire() {
        return hasExternalFire;
    }

    public void setHasExternalFire(boolean hasExternalFire) {
        this.hasExternalFire = hasExternalFire;
    }

    public int getFirePower() {
        return firePower;
    }

    public void setFirePower(int firePower) {
        this.firePower = firePower;
    }
}
