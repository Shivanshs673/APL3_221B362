class Vodka extends Beverage {
    private final String mixture = "Orange Juice";
    private final int stirTime = 20;
    
    public Vodka() {
        super(50);
    }
    
    @Override
    protected void AddMixture() {
        System.out.println("Adding " + mixture + " to vodka.");
    }
    
    @Override
    protected void Stir() {
        System.out.println("Stirring for " + stirTime + " seconds.");
    }
}