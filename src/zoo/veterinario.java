package zoo;

public abstract class veterinario extends animais{
	public veterinario(String tipo) {
		super(tipo);
	}
	public void ExaminarCachorro() {
		System.out.println("O cachorro fez barulho");
	}
	public void ExaminarCavalo() {
		System.out.println("O cavalo fez barulho");
	}
	public void ExaminarPreguica() {
		System.out.println("A preguiça fez barulho");
	}
}
