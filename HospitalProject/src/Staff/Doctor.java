package Staff;


public class Doctor {
	
    private String  doctorName;
	private String  doctorSpeciality;
	
	public Doctor(String doctorName, String doctorSpeciality) {
	this.setDoctorName(doctorName);
	this.setDoctorSpeciality(doctorSpeciality);
	
	}

	public String getDoctorName() {
		return doctorName;
	}

	public void setDoctorName(String doctorName) {
		this.doctorName = doctorName;
	}

	public String getDoctorSpeciality() {
		return doctorSpeciality;
	}

	public void setDoctorSpeciality(String doctorSpeciality) {
		this.doctorSpeciality = doctorSpeciality;
	}
	
	

}
