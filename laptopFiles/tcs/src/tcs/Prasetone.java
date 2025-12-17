package tcs;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
class Praset
{
    int manId;
    String manName;    
    int noOfProd;
    List< String> products;
    List<Integer> price;
    
    public Praset(int manId,String manName,int noOfProd,List<String> products,List<Integer> price)
    {
        this.manId = manId;
        this.manName = manName;
        this.noOfProd=noOfProd;
        this.products = products;
        this.price = price;
    }
    public int getmanId(){
        return manId;
    }
     public String getmanname(){
        return manName;
    }
     public int getnoOfProd(){
        return noOfProd;
    }
     public  List< String> getproducts(){
        return products;
    }
     public  List<Integer> getprice(){
        return price;
    }    
}
public class Prasetone{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
     //   List<Praset> mList = new ArrayList<>();
        int nt=sc.nextInt();
        Praset[] in=new Praset[nt];
        for(int i=0;i<nt;i++)
        {
            int manId = sc.nextInt();
            sc.nextLine();
            String manName =sc.nextLine();    
            int noOfProd= sc.nextInt();
            List<String> prodList = new ArrayList<>();
            List<Integer>priceList = new ArrayList<>();
            for(int j=0;j<noOfProd;j++){
                sc.nextLine();
                String prod =sc.nextLine();
                prodList.add(prod);
                int price = sc.nextInt();
                priceList.add(price);
            }
            in[i] = new Praset(manId, manName, noOfProd, prodList, priceList);
           
        }
        int orderIdInput = sc.nextInt();
        sc.nextLine();
        String productNameInput = sc.nextLine();
        float avg=Avgprice(orderIdInput,in);
        if(avg >0.0)
            System.out.println(avg);
        else    
            System.out.println("Manufacturer Not Found");
        ManfactName(productNameInput,in);
    }
    public static float Avgprice(int manfactId,Praset[] in)
    {
        int count =0; 
        float avg = 0.0f;
        for(int i=0;i<in.length;i++)
        {
            if(Raju.getmanId()==manfactId)
            {
                List<Integer> price = in.length.getprice();
                count = price.size();
                avg = 0.0f;
                for(int j:price)
                {
                    avg = avg+j;
                }
            }
        }
        return avg/count;
    }
    public static void ManfactName( String product1, Praset[] in)
    {
    	String name=null;
        for(int i=0;i<in.length;i++)
        {
           List<String> pName = in.get(i).getproducts();
           for(String j:pName)
           {
        	   if(product1.equalsIgnoreCase(j))
        	   {
        		   name=in.get(i).getmanname();
        		   System.out.println(name);
        	   }
           }
        }
        if(name==null) {
        	System.out.println("not found");
        }
}}