package zoo;

public abstract class Cachorro extends animais {

	public Cachorro(String cachorro) {
		super("cachorro");
	}
	public void temNome() {
		System.out.println("O cachorro tem nome");
	}
	
	public void fazBarulho() {
		System.out.println("O cachorro faz auau");
	}
	public void temIdade() {
		System.out.println("O cachorro tem 2 anos");
	}
	public void modoLocomocao() {
		System.out.println("O cachorro corre");
	}
}
