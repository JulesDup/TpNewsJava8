package projPOO01.GestionPersonnes;

import java.util.List;

import projPOO01.GestionAchat.Achat;

public interface IClient {
	public void achete(List<Achat> listachat);
	default public boolean paie() {
		return false;
	}
	default public boolean isClient() {
		return false;
	}
}
