class App
{
public static void main(String args[]){
	int a[][] = new int[3][3];
	a[0][0]=55;
	a[0][1]=77;
	a[1][0]=66;
	a[1][1]=78;
	a[2][0]=55;
	a[2][1]=77;
	a[1][2]=66;
	a[0][2]=78;
	a[2][2]=55;

	for(int r=0;r<2;r++){
		for(int c=0;c<2;c++){
		System.out.println(a[r][c]+"\t");
	} System.out.println("\n");
}
}
