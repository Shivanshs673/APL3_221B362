class Whiskey extends Beverage {
    private final String mixture = "CocaCola";
    private final int stirTime = 30;
    
    public Whiskey() {
        super(60);
    }
    
    @Override
    protected void AddMixture() {
        System.out.println("Adding " + mixture + " to whiskey.");
    }
    
    @Override
    protected void Stir() {
        System.out.println("Stirring for " + stirTime + " seconds.");
    }
}