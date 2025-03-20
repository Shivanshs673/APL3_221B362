class Beer extends Beverage {
    public Beer() {
        super(500);
    }
    
    @Override
    protected void AddMixture() {
        System.out.println("Beer is served as is, no mixture needed.");
    }
}