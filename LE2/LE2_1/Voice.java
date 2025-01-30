class Voice {
    private Animal[] animals = new Animal[6];

    public void prepareVoice() {
        animals[0] = new Cow();
        animals[1] = new Dog();
        animals[2] = new Pig();
        animals[3] = new Goat();
        animals[4] = new Lion();
        animals[5] = new Animal();
    }

    public void hear() {
        for (Animal animal : animals) {
            animal.makeVoice();
        }
    }
}