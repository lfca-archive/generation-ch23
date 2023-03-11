package hilo.lfca.formathread;

public class Hilo2 implements Runnable {
	private String nombre;	
	
	public Hilo2(String nombre) {
		this.nombre = nombre;
	}

	public String getNombre() {
		return nombre;
	}

	@Override
	public void run() {
		System.out.println("Inicio de el Thread " + this.getNombre());
		
		for (int i = 0; i < 10; i++) {
			System.out.println(i + " " + nombre);
			
		try {
			Thread.sleep(1000);
		} catch (Exception e) {
			e.printStackTrace();
		}
		}
	}
}
