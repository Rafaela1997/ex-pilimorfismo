package zoo;

public abstract class Cavalo extends animais {
	public Cavalo(String cavalo) {
		super("cavalo");
	}
	public void temNome() {
		System.out.println("O cavalo tem nome");
	}
	
	public void fazBarulho() {
		System.out.println("O cavalo emite som");
	}
	public void temIdade() {
		System.out.println("O cavalo tem 2 anos");
	}
	public void modoLocomocao() {
		System.out.println("O cavalo corre");
	}
}


