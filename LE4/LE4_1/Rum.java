class Rum extends Beverage {
    private final String mixture = "Lime Juice";
    private final int stirTime = 25;
    
    public Rum() {
        super(45);
    }
    
    @Override
    protected void AddMixture() {
        System.out.println("Adding " + mixture + " to rum.");
    }
    
    @Override
    protected void Stir() {
        System.out.println("Stirring for " + stirTime + " seconds.");
    }
}