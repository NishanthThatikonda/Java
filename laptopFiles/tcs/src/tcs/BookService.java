package tcs;
import java.util.*;

class Bookmanagement{
	private int id;
	private String title;
	private String  author;
	private double price;
	private int availablecopies;
	List<String> geners;
	
	
	public Bookmanagement( int id,String title,String  author,double price,int availablecopies,List<String> geners) {
		
		this.id=id;
		this.title=title;
		this.author=author;
		this.price=price;
		this.availablecopies=availablecopies;
		this.geners=geners;

	}
	
	public List<String> getGeners(){
		return geners;
		
	}
	public void setGeners(List<String> geners ) {
		
		this.geners=geners;
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

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public int getAvailablecopies() {
		return availablecopies;
	}

	public void setAvailablecopies(int availablecopies) {
		this.availablecopies = availablecopies;
	}
	
	
}

public class BookService {
	
	public static List<Bookmanagement> searchbyauthor(List<Bookmanagement> Mlist1, String searchauthor){
		List<Bookmanagement> author=new ArrayList<>();
		for(Bookmanagement l:Mlist1) {
			if(l.getAuthor().equalsIgnoreCase(searchauthor)) {
				author.add(l);
			}
		}
		
		return author;
	}
	
	
	public static  List<Double> searchbybonus(List<Bookmanagement> Mlist2, int adding_bonus){
		List<Double> bonus=new ArrayList<>();
		if(adding_bonus<0 || adding_bonus>100) {
			System.out.println("Invalid Discount Value");
			return bonus;
		}
		else {
			for(Bookmanagement l:Mlist2) {
				double discoutedprice= l.getPrice()*(1+adding_bonus/100.0);
				l.setPrice(discoutedprice);
				bonus.add(discoutedprice);
			}
		}
		
		
		return bonus;
		
		
	}

	public static void main(String[] args) {
		List<Bookmanagement> Mlist=new ArrayList<>();
		Scanner sc= new Scanner(System.in);
		int n=sc.nextInt();
		for(int i=0; i<n;i++) {
			int id=sc.nextInt();
			sc.nextLine();
			String title=sc.nextLine();
			String author=sc.nextLine();
			double price=sc.nextDouble();
			int availablecopies=sc.nextInt();
			int noofgeners=sc.nextInt();
			sc.nextLine();
			List<String> genres=new ArrayList<>();
			for(int j=0; j<noofgeners; j++) {
				String gen=sc.nextLine();
				genres.add(gen);
				
			}
			Mlist.add(new Bookmanagement(  id, title,  author, price, availablecopies, genres));
			
		}
		String searchauthor=sc.nextLine();
	List<Bookmanagement> bok=	searchbyauthor(Mlist,searchauthor);
 int	adding_bonus=sc.nextInt();
 List<Double> bon=searchbybonus(Mlist, adding_bonus);
	
	if(!bok.isEmpty()) {
	for(Bookmanagement s:bok) {
		System.out.println(s.getId());
		System.out.println(s.getTitle());
		System.out.println(s.getAuthor());
		System.out.println(s.getPrice());
		System.out.println(s.getGeners());
	}
	
		
	}
	else {
		System.out.println("No Books Found");
	}

	for(Double d:bon) {
		System.out.println(d);
	}

}}
