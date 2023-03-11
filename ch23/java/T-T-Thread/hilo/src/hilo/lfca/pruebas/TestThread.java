package hilo.lfca.pruebas;

public class TestThread {
	public static void main(String[] args) {
		Thread h = new Hilo1("Tadeo");
		h.start();
		Thread h0 = new Hilo1 ("Maria");
		h0.start();
		Thread h1 = new Hilo1("Raul");
		h1.start();
		try {
			Thread.sleep(10);
		} catch (Exception e) {
			e.printStackTrace(); //TERMINATED
		}
		System.out.println(h.getState());
	}
}
