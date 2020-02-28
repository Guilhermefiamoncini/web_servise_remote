package web_server_meg_i9;

import java.util.LinkedList;
import java.util.List;
//import java.util.Random;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebService;
import javax.validation.constraints.NotNull;


@WebService
public class myfirstSOAPWebServise {
	
	@WebMethod
	public String ping(@WebParam(name="nome") @NotNull String nome){
	
		return " pong ! "+nome;
	
	}
	/*
	 * @WebMethod(operationName = "deMinhaIdadePorFavor!!",exclude=true)
	public Integer getAge(){
		return new Random().nextInt();
	}
	*/
	@WebMethod
	public List<String> getMinhaprimeiraLista(){
		List<String> toReturn = new LinkedList<String>();
		toReturn.add("meu item 1");
		toReturn.add("meu item 2");
		toReturn.add("meu item 3");
		toReturn.add("meu item 4");
		toReturn.add("meu item 5");
		toReturn.add("meu item 6");
		return toReturn;
	}
	
	public List<carro> getMeusCarros(){
		List<carro> toReturn = new LinkedList<carro>();
	
	 carro Carro1 = new carro();
	 Carro1.setCortype(CorType.amarelo);
	 Carro1.setMarca("reanut");
	 Carro1.setNome("megano");
	 toReturn.add(Carro1);
	 
	 carro Carro2 = new carro();
	 Carro2.setCortype(CorType.preto);
	 Carro2.setMarca("Fiat");
	 Carro2.setNome("strada");
	 toReturn.add(Carro2);
	 
	  return toReturn; 
	}
}
