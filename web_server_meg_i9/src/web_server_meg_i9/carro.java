package web_server_meg_i9;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAnyElement;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;



@XmlRootElement
@XmlAccessorType(XmlAccessType.FIELD)
public class carro implements java.io.Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	@XmlElement
	private String nome;
	@XmlElement
	private String carro;
	@XmlElement
	private String marca;
	@XmlElement
	private CorType Cortype;
	
	
	public carro(){
		
	}
	public String getCarro() {
		return carro;
	}
	public void setCarro(String carro) {
		this.carro = carro;
	}
	public String getMarca() {
		return marca;
	}
	public void setMarca(String marca) {
		this.marca = marca;
	}
	public CorType getCortype() {
		return Cortype;
	}
	public void setCortype(CorType cortype) {
		Cortype = cortype;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	
	
}
