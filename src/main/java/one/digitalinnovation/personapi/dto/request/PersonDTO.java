package one.digitalinnovation.personapi.dto.request;

import java.util.List;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.Valid;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Size;

import org.hibernate.validator.constraints.br.CPF;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class PersonDTO {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long id;
	
	@NotEmpty
	@Size(min = 2, max = 100)
	private String firstName;
	
	@NotEmpty
	@Size(min = 2, max = 100)
	private String lastName;
	
	@NotEmpty
	@CPF
	private String cpf;
	
	private String birthDate;
	
	@NotEmpty
	@Valid
	private List<PhoneDTO> phones;
/*
	public PersonDTO(Long id, String firstName,
			String lastName, String cpf, String birthDate,
			List<PhoneDTO> phones) {
		super();
		this.id = id;
		this.firstName = firstName;
		this.lastName = lastName;
		this.cpf = cpf;
		this.birthDate = birthDate;
		this.phones = phones;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public String getBirthDate() {
		return birthDate;
	}

	public void setBirthDate(String birthDate) {
		this.birthDate = birthDate;
	}

	public List<PhoneDTO> getPhones() {
		return phones;
	}

	public void setPhones(List<PhoneDTO> phones) {
		this.phones = phones;
	}
*/
	
}
