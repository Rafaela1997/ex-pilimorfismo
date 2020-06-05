package zoo;

public abstract class animais {

	private String tipo;
	abstract public void temNome (String nome);
	abstract public void fazBarulho (String som);
	abstract public void temIdade (String idade);
	abstract public void modoLocomocao (String anda);
	
	public animais (String tipo) {
	this.tipo = tipo;

	}

}
