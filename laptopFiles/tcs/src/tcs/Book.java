package tcs;
import java.util.*;
 class Library {

	private int bookid;
	private String title;
	private List<String>authors; 
	private List<String> genres;

	public Library(int bookid, String title, List<String> authors, List<String> genres) {
		super();
		this.bookid = bookid;
		this.title = title;
		this.authors = authors;
		this.genres = genres;
	}
	public int getBookid() {
		return bookid;
	}
	public void setBookid(int bookid) {
		this.bookid = bookid;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public List<String> getAuthors() {
		return authors;
	}
	public void setAuthors(List<String> authors) {
		this.authors = authors;
	}
	public List<String> getGenres() {
		return genres;
	}
	public void setGenres(List<String> genres) {
		this.genres = genres;
	}
	

	
	@Override
	public String toString() {
		return bookid +title +authors + genres ;
	}
	
 }
public class Book {
	
	public static   String  searchbyauthor(List<Library> Mlist1, String searchbyauthor) {
		boolean found= false;
		for(Library l:Mlist1) {
			for(String s: l.getAuthors()) {
				if(s.contains(searchbyauthor)) {
					System.out.println(l.getTitle());	
					found= true;
				break;
			}
			
			}
			
		}
	
		if(!found) {
		System.out.println("no found");
		//System.out.println("0");
		}
		return null;
		
	}
	
	public static  Library searchbygenre(List<Library> Mlist2, String searchgenre) {
		boolean found=false;
		for(Library m: Mlist2) {
			if(m.getGenres().contains(searchgenre)) {
		System.out.println( m.getTitle());		 
				found=true;
			}
			
		}
		if(!found) {
		System.out.println("no title found");
		}
		return null;
	}
	
	
	
	
	
	public static void main(String [] args) {
		Scanner sc= new Scanner(System.in);
		List<Library> Mlist=new ArrayList<>();
		
		
		int n=sc.nextInt();
		sc.nextLine();
		for(int i=0; i<n; i++) {
			
			int id=sc.nextInt();
			sc.nextLine();
			String title= sc.nextLine();
			
			
			int noauthors=sc.nextInt();
			sc.nextLine();
			List<String> noofauthors= new ArrayList<>();
			for(int j=0; j<noauthors; j++) {
				String authoorss=sc.nextLine();
				noofauthors.add(authoorss);
				
			}
			int nogeners= sc.nextInt();
			sc.nextLine();
			List<String> genres= new ArrayList<>();
			for(int j=0; j<nogeners; j++) {
				String genresss=sc.nextLine();
				genres.add(genresss);
				
			}
			
			Mlist.add(new Library( id,  title, noofauthors,  genres) );
			
		}
		
		
		String searchname= sc.nextLine();
		searchbyauthor(Mlist,searchname);
		
		String searchgenre= sc.nextLine();
		
		searchbygenre(Mlist,searchgenre);
		sc.close();
	}
}
