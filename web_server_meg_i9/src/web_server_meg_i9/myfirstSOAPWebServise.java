package web_server_meg_i9;

import javax.jws.WebMethod;
import javax.jws.WebService;

@WebService

public class myfirstSOAPWebServise {

	
	
	@WebMethod
	public String ping(String nome){
		return "pong"+nome;
	}
}
