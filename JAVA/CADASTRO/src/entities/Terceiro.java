package entities;

public class Terceiro extends funcionario{
	private String codEmpresa;
	private double diferencialSalario;
	public Terceiro(String cpf, String nome, int anoNascimento, String matricula, String funcao, double valorHora,
			int horasTrabalhadas, String codEmpresa, double diferencialSalario) {
		super(cpf, nome, anoNascimento, matricula, funcao, valorHora, horasTrabalhadas);
		this.codEmpresa = codEmpresa;
		this.diferencialSalario = diferencialSalario;
	}
	public Terceiro(String matricula, String nome, String codEmpresa, double diferencialSalario) {
		super(matricula, nome);
		this.codEmpresa = codEmpresa;
		this.diferencialSalario = diferencialSalario;
	}
	public Terceiro() {
		
	}
	public String getNomeEmpresaTerceiro() {
		return codEmpresa;
	}
	public void setNomeEmpresaTerceiro(String codEmpresa) {
		this.codEmpresa = codEmpresa;
	}
	public double getDiferencialSalario() {
		return diferencialSalario;
	}
	public void setDiferencialSalario(double diferencialSalario) {
		this.diferencialSalario = diferencialSalario;
	}
	
	
}
