package week3;

class EasyLevelItemFactory implements GameItemFactory {
    @Override
    public Weapon createWeapon() {
        return new Sword();
    }

    @Override
    public PowerUp createPowerUp() {
        return new HealthBoost();
    }
}
