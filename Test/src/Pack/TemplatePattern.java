package Pack;

/**
 * Created by Sveta on 05.03.2018.
 */
public class TemplatePattern {
    public static void main(String[] args) {
        //DrinkMaker latte = new LatteMaker();
        //latte.makeDrink();
       // DrinkMaker tea = new TeaMaker();
       // tea.makeDrink();
        new TeaMaker().makeDrink();
        new LatteMaker().makeDrink();

    }

}
