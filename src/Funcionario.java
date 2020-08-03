
public class Funcionario {

	int funcional;
	String nome;
	String cargo;
	double salario;
	
	
	public Funcionario(int funcional, String nome, String cargo, double salario) {
		super();
		this.funcional = funcional;
		this.nome = nome;
		this.cargo = cargo;
		this.salario = salario;
	}



	public int getFuncional() {
		return funcional;
	}



	public void setFuncional(int funcional) {
		this.funcional = funcional;
	}



	public String getNome() {
		return nome;
	}



	public void setNome(String nome) {
		this.nome = nome;
	}



	public String getCargo() {
		return cargo;
	}



	public void setCargo(String cargo) {
		this.cargo = cargo;
	}



	public double getSalario() {
		return salario;
	}



	public void setSalario(double salario) {
		this.salario = salario;
	}


	
public double calcularImposto()
{
	if (this.salario<=1000) return salario * 0.15;
	else if (this.salario<=2000) return salario * 0.25;
	else if (this.salario<=4500) return salario*0.45;
	else return 2250;
}
}


