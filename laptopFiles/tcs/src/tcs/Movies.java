package tcs;
import java.util.*;
 class Cenima{
	private int id;
	private String title;
	private double rating;
	private int availablecopies;
	private int  noofgenrs;
	List<String> genres;
	

	
	public Cenima(int id, String title, double rating, int availablecopies, int noofgenrs, List<String> genres) {
		super();
		this.id = id;
		this.title = title;
		this.rating = rating;
		this.availablecopies = availablecopies;
		this.noofgenrs = noofgenrs;
		this.genres = genres;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public double getRating() {
		return rating;
	}
	public void setRating(double rating) {
		this.rating = rating;
	}
	public int getAvailablecopies() {
		return availablecopies;
	}
	public void setAvailablecopies(int availablecopies) {
		this.availablecopies = availablecopies;
	}
	public int getNoofgenrs() {
		return noofgenrs;
	}
	public void setNoofgenrs(int noofgenrs) {
		this.noofgenrs = noofgenrs;
	}
	public List<String> getGenres() {
		return genres;
	}
	public void setGenres(List<String> genres) {
		this.genres = genres;
	}
}
public class Movies {
		public static List<Cenima> searchbygen(List<Cenima> Mlist1, String searchgen) {
	
		List<Cenima> re=new ArrayList<>();
		for(Cenima l :Mlist1 ) {
			for(String s: l.getGenres()) {
				if(s.contentEquals(searchgen)) {
					re.add(l);
							
			}
		}	
	}
		return re;
		}	
	public static List<Double> addbonus(List<Cenima> Mlist2, int bonus ){
		
		List<Double> db=new ArrayList<>();
		if(bonus<0) {
			System.out.println("bonus rating cannot be negativebonus rating cannot negative");
			return db;
		}
			for(Cenima m:Mlist2) {
				db.add(m.getRating() + bonus);
			}
			return db;
			
		
		
		
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		List<Cenima> Mlist=new ArrayList<>();
		Scanner sc= new Scanner(System.in);
		
		int n=sc.nextInt();
		sc.nextLine();
		for(int i=0; i<n;i++) {
		int id=sc.nextInt();
		sc.nextLine();
		String title =sc.nextLine();
		double rating=sc.nextDouble();
		int avcopies=sc.nextInt();
		int noofgeners=sc.nextInt();
		sc.nextLine();
		List<String>genrs=new ArrayList<>();
		for(int j=0;j<noofgeners; j++) {
			
			String geners=sc.nextLine();
			genrs.add(geners);
		}
		
		Mlist.add(new Cenima( id,  title,  rating,  avcopies,  noofgeners, genrs));
	
		}
		String searchgen=sc.nextLine();
		List<Cenima> rra=searchbygen(Mlist,searchgen);
		
		int bonus=sc.nextInt();
		List<Double> bb=addbonus(Mlist,bonus );
		if(!rra.isEmpty()) {
		for(Cenima c:rra) {
			System.out.println(c.getId());
			System.out.println(c.getTitle());
			System.out.println(c.getRating());
			System.out.println(c.getAvailablecopies());
			System.out.println(c.getNoofgenrs());
			System.out.println(c.getGenres());

		}
		}
		else {
			System.out.println("no gerner found ");
		}
		
		for(Double d:bb) {
			System.out.println(d);
		}
		
		
		
		
	}



	



	

}
