package projPOO01.GestionAchat;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.Instant;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Date;

public class Achat {
	private ZonedDateTime date;
	private String intitule;
	private int quantite;
	private String pattern = "dd-MM-yyyy";
	private SimpleDateFormat sd = new SimpleDateFormat(pattern);

	public Achat(String i, int q, ZonedDateTime date) {
		// TODO Auto-generated constructor stub
		this.date = date;

		this.intitule = i;
		this.quantite = q;
	}

	@Override
	public String toString() {
		return intitule + "[date=" + date.format(DateTimeFormatter.ISO_LOCAL_DATE_TIME) + ", quantite=" + quantite
				+ "]";

	}

}
