abstract class Beverage {
    protected int quantity;
    
    public Beverage(int quantity) {
        this.quantity = quantity;
    }
    
    public final void prepareBeverage() {
        Pour();
        AddMixture();
        Stir();
        Serve();
    }
    
    private void Pour() {
        System.out.println("Pouring " + quantity + "ml of beverage.");
    }
    
    private void Serve() {
        System.out.println("Serving the beverage.");
    }
    
    protected abstract void AddMixture();
    
    protected void Stir() {}
}