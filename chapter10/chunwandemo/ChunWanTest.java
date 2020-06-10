package chapter10.chunwandemo;

public class ChunWanTest {

	public static void main(String[] args) {
		Director James = new Director();
		Singer LadyGaga = new Singer("LadyGaga");
		Dancer Chris = new Dancer("Chris");
		//Actor actor = new Actor("Jimmy");
		James.action(Chris);
		James.action(LadyGaga);
		//James.action(actor);

	}

}