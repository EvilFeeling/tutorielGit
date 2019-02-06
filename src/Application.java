import java.awt.Frame;

public class Application extends Frame {

	public static void main(String[] args) {
		new Application();
	}
	
	// Gwen Love sur toi mec...

	
	public Application() {
		super();
		
		Modele modl = new Modele();
		Controleur ctrl = new Controleur(modl); 
		Vue vue = new Vue();
		modl.addObserver(vue);
		vue.addActionListener(ctrl);

		this.setTitle("Vive l'argent !................... Connard");

		this.add(vue);
		this.pack();
		this.setVisible(true);
	}

}
