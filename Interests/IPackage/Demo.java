package IPackage;

public class Demo {
	public int sim(int p,int t,int r) {
        return (p*t*r)/100;
	}
	public int com(int p,int t,int r) {
        return (int)(p* (Math.pow((1 + r / 100), t))); 
	}
}
