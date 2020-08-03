
public class Folha {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Funcionario  lista[];
		lista = new Funcionario[10];
		
		lista[0] = new Funcionario(1234,"isidro","prof",1500);
		lista[1] = new Funcionario(1235,"dede","gerente",2200);
		lista[2] = new Funcionario(1236,"didi","vendedor",1850);
		lista[3] = new Funcionario(1237,"dudu","costureira",2120);
		lista[4] = new Funcionario(1238,"dada","admin",2000);
		lista[5] = new Funcionario(1239,"caca","diretor",5000);
		lista[6] = new Funcionario(1230,"cici","prof",3210);
		lista[7] = new Funcionario(1231,"dri","contadora",2550);
		lista[8] = new Funcionario(1232,"edu","medico",3820);
		lista[9] = new Funcionario(1233,"duda","motorista",2200);
		
		System.out.println (lista[0].getFuncional() +" " + lista[0].getNome()+ " " +
		                    lista[0].getCargo() + " R$ " + lista[0].getSalario() + " R$ " + lista[0].calcularImposto());
		
		for (int i=0;i<10;i++) {
			System.out.println (lista[i].getFuncional() +" " + lista[i].getNome()+ " " +
                    lista[i].getCargo() + " R$ " + lista[i].getSalario() + " R$ " + lista[i].calcularImposto());
	
		}
	}

}
