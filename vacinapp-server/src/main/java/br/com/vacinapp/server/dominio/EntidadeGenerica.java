package br.com.vacinapp.server.dominio;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.MappedSuperclass;

@MappedSuperclass
public class EntidadeGenerica {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}
	
	public Boolean isIdEqual(Long id){
		return this.id == id;
	}
	
	public Boolean isNewEntity(){
		return (this.id == null) || (this.id == 0);
	}
}
