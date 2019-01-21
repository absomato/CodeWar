package kyu5;

public class Weight_for_weight {
	public static void main(String args[]) {
		String q="2000 103 123 4444 99";
		int n[]=new int[10];
		int cnt=0;
	    String[] k=q.split("\\s");
	    for(String g : k){
	     n[cnt++]=Integer.parseInt(g);
	    }
	    for(int i=0;i<n.length;i++)
	    System.out.print(n[i]+" ");
	}
}
