package zoo;

public abstract class Preguica extends animais  {
	public Preguica(String preguica) {
		super("preguiça");
	}
	public void temNome() {
		System.out.println("A preguiça tem nome");
	}
	
	public void fazBarulho() {
		System.out.println("A preguiça emite som");
	}
	public void temIdade() {
		System.out.println("A preguiça tem 2 anos");
	}
	public void modoLocomocao() {
		System.out.println("A preguiça sobe em arvores");
	}
}


