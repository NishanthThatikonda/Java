package tcs;
import java.util.*;
public class pra {
	private int id;
	private String title;
	private double rating;
	private int availablecopies;
	private int noofgernes;
	private List<String>genres;
	
	public void Pra(int id, String title, double rating, int availablecopies, int noofgenres ) {
		this.id=id;
		this.title=title;
		this.rating=rating;
		this.availablecopies=availablecopies;
		this.noofgernes=noofgenres;
		
		
	}
	public int getid() {
		return id;
	}
	public void setId(int id) {
		this.id= id;
	}
	public List<String> getGenres(){
		return genres;
	}
	public void setGenres(List<String> Genres) {
		this.genres=genres;
	}
	
	public static void main(String []args) {
		
	}

}
