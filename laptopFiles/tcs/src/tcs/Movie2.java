package tcs;
import java.util.*;


 class  Main {
private int id;
private String title;
private double rating ;
private int availablecopies;
private int noofgenrs;
List<String> geners;
public Main(int id, String title, double rating, int availablecopies, int noofgenrs, List<String> genres) {
	
	this.id = id;
	this.title = title;
	this.rating = rating;
	this.availablecopies = availablecopies;
	this.noofgenrs = noofgenrs;
	this.geners = genres;
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
public List<String> getGeners() {
	return geners;
}
public void setGeners(List<String> geners) {
	this.geners = geners;
}



}
 
 public class Movie2{
	 
	public static  List<Main> searchbygenre(List<Main> Mlist1, String searcgenre) {
		boolean found=false;
		List<Main> arr=new ArrayList<>();
		
		for(Main l :Mlist1 ) {
			for(String s: l.getGeners()) {
				if(s.contentEquals(searcgenre)) {
					arr.add(l);
					found=true;
				}
			}
		}
		if(!found) {
			System.out.println("not found");
		}
		return arr;
		
		
	}
	public static List<Double> addbonus(List<Main> Mlist, int ratingg){
		List<Double> Mlist2=new ArrayList<>();
		if(ratingg<0) {
			System.out.println("no negative bonus");
			return Mlist2;
		}
	
		for(Main l: Mlist ) {
			Mlist2.add(l.getRating()+ ratingg);
		}
		return Mlist2;
	}
	 
	
	 
	 
	 
	 
public static void main(String[] args) {
		List<Main> Mlist=new ArrayList<>();
		Scanner sc= new Scanner(System.in);
		int n=sc.nextInt();
		sc.nextLine();
		for(int i=0;i<n;i++) {
			int id=sc.nextInt();
			sc.nextLine();
			String title=sc.nextLine();
			double rating =sc.nextDouble();
			int availablecopies=sc.nextInt();
			int noofgeners=sc.nextInt();
			sc.nextLine();
			List<String> genres=new ArrayList<>();
			for(int j=0;j<noofgeners;j++) {
				String gen=sc.nextLine();
				genres.add(gen);
				
			}
			
			Mlist.add(new Main( id,  title,  rating,  availablecopies,  noofgeners,  genres));
			
		}
		String searcgenre=sc.nextLine();
		int ratingg= sc.nextInt();
		List<Main> paa=searchbygenre(Mlist,searcgenre);
		for(Main ae:paa) {
		
			System.out.println(ae.getId());
			System.out.println(ae.getTitle());
			System.out.println(ae.getRating());
			System.out.println(ae.getAvailablecopies());
			System.out.println(ae.getGeners());
			
		}
		
		List<Double> bon=addbonus(Mlist,ratingg);
		
		for(Double d: bon) {
			System.out.println(d);
		}
		
		sc.close();
		
		
	}

}
