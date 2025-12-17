package interview_practice;

public class FindMAXnoInARRAY {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[]= {20,30,10,50};
		int max=a[0];
		for(int i=1;i<a.length;i++){
//			if u find the min no then replace by max<a[i]
			if(a[i]>max) {
				max=a[i];

		}

	}
		System.out.println("the max no:"+max);


	}
}
