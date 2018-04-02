public class StartClass {
    public  void startMethod(){
        ConcreteMediator mediator = new ConcreteMediator();
        Colleague farmer = new Farmer(mediator);
        Colleague shop = new Shop(mediator);
        Colleague cannery = new Cannery(mediator);

        mediator.addColleague(farmer);
        mediator.addColleague(shop);
        mediator.addColleague(cannery);
        farmer.receive("seed");
    }
}
