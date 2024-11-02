public abstract class BasePizzaDecorator implements BasePizza {
    public BasePizza basePizza;

    public BasePizzaDecorator(BasePizza basePizza) {
        this.basePizza = basePizza;
    }
}
