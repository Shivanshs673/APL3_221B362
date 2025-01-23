public class LE1_2
{
	public static void main(String[] args) {
        Mother mother = new Mother();
        mother.show(); 
        Child child = new Child();
        child.show(); 
        Mother ref = new Child();
        ref.show();
    }
}
