package testRepository;

public class Personne {
private String nom;
private String prenom;
private int age;
private String formation;

public Personne(String nom, String prenom, int age){
	this.setAge(age);
	this.setPrenom(prenom);
	this.setNom(nom);
}

public void inscriptionFact(String filiere){
	this.setFormation(filiere) ;
	
	
}

/**
 * @return the nom
 */
public String getNom() {
	return nom;
}

/**
 * @param nom the nom to set
 */
public void setNom(String nom) {
	this.nom = nom;
}

/**
 * @return the prenom
 */
public String getPrenom() {
	return prenom;
}

/**
 * @param prenom the prenom to set
 */
public void setPrenom(String prenom) {
	this.prenom = prenom;
}

/**
 * @return the age
 */
public int getAge() {
	return age;
}

/**
 * @param age the age to set
 */
public void setAge(int age) {
	this.age = age;
}

/**
 * @return the formation
 */
public String getFormation() {
	return formation;
}

/**
 * @param formation the formation to set
 */
public void setFormation(String formation) {
	this.formation = formation;
}










}
