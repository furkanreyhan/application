public enum Ingredient {
    HOT_WATER("Sıcak su"),
    STEAMED_MILK("Buğulanmış Süt"),
    MILK_FOAM("Süt Köpüğü"),
    HOT_CHOCOLATE("Sıcak Çikolata"),
    ESPRESSO("Espresso");

    private final String label;
    Ingredient(String label) {
        this.label = label;
    }

    @Override
    public String toString() {
        return this.label;
    }
}