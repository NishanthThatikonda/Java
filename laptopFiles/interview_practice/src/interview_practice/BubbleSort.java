package interview_practice;
import java.util.Arrays;
public class BubbleSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[]= {20,1,4,30,22};
		int n=a.length;
		for(int i=0;i<n-1;i++) {
			for(int j=0;j<n-1;j++) {
				if(a[j]>a[j+1]) {
					int tem=a[j];
					a[j]=a[j+1];
					a[j+1]=tem;
				}
				
			}
		}
System.out.println("sorted arry is;"+Arrays.toString(a));
	}

}
