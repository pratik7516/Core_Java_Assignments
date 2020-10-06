class MathOpe{
	static void mult(int i,int j){
		int k = i*j;
		System.out.println(k);
	}
    
    
    static void mult(float i,float j,float h){
		float k = i*j*h;
		System.out.println(k);
	}
	static void mult(double i,int j){
		double k = i + j;
		System.out.println(k);
	}
static void arrr(){
    int a[]={2,3,4};
    int d=a[0]*a[1]*a[2];
    System.out.println("mult is "+d);
}

}
class OverloadingDemo2{
	public static void main(String args[]){
		
		MathOpe.mult(12,13);
		MathOpe.mult(12.2f,13.2f,12.2f);
        MathOpe.mult(12.13d,11);
        MathOpe.arrr();

	}
}