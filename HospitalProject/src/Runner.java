import Staff.Doctor;

public class Runner {

	public static void main(String[] args) {
		
		
		Patient p1 = new Patient ("Tim ",21,"Male","Ear Infection");
        Patient p2 = new Patient ("Nial",12,"Female","Heart Pain");
        Patient p3 = new Patient ("Sarah ",23,"Female","Broken Foot");
        Patient p4 = new Patient ("Ashley",40,"Male","Nose Bleed");
        
        Doctor d1 = new Doctor("Jack","Anesthesiology");
        Doctor d2 = new Doctor("Ryan","Family Medicine");
	}

}
