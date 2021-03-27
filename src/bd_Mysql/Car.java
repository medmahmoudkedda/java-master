package bd_Mysql;

public class Car {
	private int num;
	private String type;
	private String modele;
	private int IDPerson;
	public Car() {}
	public Car(int num, String type, String modele,int id) {
		this.num = num;
		this.type = type;
		this.modele = modele;
		this.IDPerson = id;
	}
	public int getNum() {
		return num;
	}
	public void setNum(int num) {
		this.num = num;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public String getModele() {
		return modele;
	}
	public void setModele(String modele) {
		this.modele = modele;
	}
	public int getIDPerson() {
		return IDPerson;
	}
	public void setIDPerson(int iDPerson) {
		IDPerson = iDPerson;
	}
	
	
}
