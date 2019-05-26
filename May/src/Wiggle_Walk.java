import java.util.Scanner;

public class Wiggle_Walk {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String ti = scan.nextLine();
		int t = Integer.parseInt(ti);
		for (int i = 0; i < t; i++) {

			String line = scan.nextLine();
			String[] nos = line.trim().split("\\s+");
			int a[] = new int[nos.length];

			for (int j = 0; j < nos.length; j++) {
				a[j] = Integer.parseInt(nos[j]);
			}

			int visited[][] = new int[a[1]][a[2]];
			for (int j = 0; j < a[1]; j++) {
				for (int k = 0; k < a[2]; k++) {
					visited[j][k] = 0;
				}
			}
			
			visited[--a[3]][--a[4]] = 1;
			int x=a[3];
			int y=a[4];
			String instrucline = scan.nextLine();			
			for (int k = 0; k < a[0]; k++) {


//				for (int k = 0; k < instrucline.length(); k++) {
					if (instrucline.charAt(k)=='E') {
						while (visited[x][y+1]!=0) {
							y++;
						}
						visited[x][++y]=1;
					}
					
					if (instrucline.charAt(k)=='W') {
						while (visited[x][y-1]!=0) {
							y--;
						}
						visited[x][--y]=1;
					}
					
					if (instrucline.charAt(k)=='N') {
						while (visited[x-1][y]!=0) {
							x--;
						}
						visited[--x][y]=1;
					}
					
					if (instrucline.charAt(k)=='S') {
						while (visited[x+1][y]!=0) {
							x++;
						}
						visited[++x][y]=1;
					}
//				}
			}
			System.out.println("Case #"+ ++i +": "+ ++x+" "+ ++y);
		}
	
		scan.close();
	}

}
