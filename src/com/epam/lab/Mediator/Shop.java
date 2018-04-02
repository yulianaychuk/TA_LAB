public class Shop extends Colleague {
    public Shop(Mediator mediator) {
        super(mediator);
    }
    @Override
    public void receive(String msg) {
        System.out.println(this.getClass().getName()+" sold "+ msg);
    }
}
