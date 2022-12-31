package INTEPRETOR_pattern.testStatePattern;

class CoffeeShop{
    private String state;

    public CoffeeShop(String state) {
        this.state = state;
    }

    public void doAction(){
        if (state.equalsIgnoreCase("CLOSED"))
            System.out.println("closing...");
        else if (state.equalsIgnoreCase("OPENED"))
            System.out.println("opening...");
    }

    public void setState(String state) {
        this.state = state;
    }
}

class Context{
    private final State state;

    Context(State state) {
        this.state = state;
    }

    public void doAction(){
        this.state.doAction();
    }
}

interface State{
    void doAction();
}

class ClosingState implements State{

    public ClosingState() {
    }

    @Override
    public void doAction() {
        System.out.println("closing...");
    }
}

class OpeningState implements State{

    public OpeningState() {
    }

    @Override
    public void doAction() {
        System.out.println("opening...");
    }
}

public class ENTRY_DEMO {


    public static void main(String[] args) {
        Context context = new Context(new ClosingState());
        context.doAction();


    }
}
