import Operators.Operator;
import Operators.OperatorService;

import java.lang.reflect.Method;
import java.util.*;

public class Menu {

    private static Menu menu;

    public static Menu getInstance() {
        if (Objects.isNull(menu)) {
            menu = new Menu();
        }
        return menu;
    }

    private final Map<String, Method> operators;
    private boolean isGenerated;

    private Menu() {
        this.operators = new HashMap<>();
        this.isGenerated = false;
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        throw new CloneNotSupportedException();
    }

    public void show() {
        if (!Menu.getInstance().isGenerated) {
            this.generate();
        }
        operators.keySet().forEach(System.out::println);
    }

    public Method getOperator(String name) {
        return operators.get(name);
    }

    private void generate() {
        List<Method> operators = Arrays.asList(OperatorService.class.getMethods());
        operators.stream()
                .filter(method -> method.isAnnotationPresent(Operator.class))
                .forEach(method -> this.operators.put(method.getAnnotation(Operator.class).name(), method));
        this.isGenerated = true;
    }
}
