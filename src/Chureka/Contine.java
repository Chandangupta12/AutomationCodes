package Chureka;

public class Contine {
	public static void main(String[] args) {
for (int i=2;i<=4;i++) {
	
	for(int j=2;j<=4;j++) {
		if(i==2||j==2) {
			continue;
		}
		System.out.println(i+"  "+j);
	}
	}
}
}