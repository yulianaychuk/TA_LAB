public class Cannery extends Colleague {
    public Cannery(Mediator mediator) {
        super(mediator);
    }
    @Override
    public void receive(String msg) {
        String ketchup = msg + " Ketchup";
        System.out.println(this.getClass().getName()+" produced "+ketchup);
        mediator.sendMessage(ketchup, this);
    }
}


