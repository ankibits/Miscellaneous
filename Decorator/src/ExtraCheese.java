public class ExtraCheese extends BasePizzaDecorator{


    public ExtraCheese(BasePizza basePizzaWithExtraCheese) {
        super(basePizzaWithExtraCheese);
    }

    @Override
    public int cost() {
        return basePizza.cost()+100;
    }
}
