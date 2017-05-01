package hospital;

public class Allergy 
{
    private String allergyName;
	private AllergySeverity severity;
	private String symptoms;
	
	public Allergy(String allergyName,AllergySeverity severity,String symptoms)
	{
		this.allergyName = allergyName;
		this.severity = severity;
		this.symptoms = symptoms;
		
	}

	public void setAllergyName(String allergyName) {
		this.allergyName = allergyName;
	}
	
	public String getAllergyName() {
		return allergyName;
	}

	public void setSeverity(AllergySeverity severity) {
		this.severity = severity;
	}

	public AllergySeverity getSeverity() {
		return severity;
	}

	public void setSymptoms(String symptoms) {
		this.symptoms = symptoms;
	}
	
	public String getSymptoms() {
		return symptoms;
	}
}