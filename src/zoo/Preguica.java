package zoo;

public abstract class Preguica extends animais  {
	public Preguica(String preguica) {
		super("pregui�a");
	}
	public void temNome() {
		System.out.println("A pregui�a tem nome");
	}
	
	public void fazBarulho() {
		System.out.println("A pregui�a emite som");
	}
	public void temIdade() {
		System.out.println("A pregui�a tem 2 anos");
	}
	public void modoLocomocao() {
		System.out.println("A pregui�a sobe em arvores");
	}
}


