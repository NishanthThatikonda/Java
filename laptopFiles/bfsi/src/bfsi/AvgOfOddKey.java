package bfsi;
import java.util.HashMap;
public class AvgOfOddKey {
public static void main(String[] args) {
	HashMap<Integer, Integer> hash= new HashMap<>();
	hash.put(1,4);
	hash.put(2,7);
	hash.put(3,8);
	hash.put(4,6);
	int sum=0;
	int result=0;
	int value=0;
	for(int i=1; i<=hash.size(); i++) {
		hash.get(i);
		if(i%2!=0) {
			  value =hash.get(i);
			 sum=sum+value;
		}
	}
	result=sum/2;
	System.out.println(result);	

}
}
