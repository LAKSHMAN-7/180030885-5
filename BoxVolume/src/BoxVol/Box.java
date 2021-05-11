package BoxVol;
import java.util.Scanner;
public class Box {
	double h,w,d;
	
	public Box(double width,double height,double depth)
	{
		h=height;
		w=width;
		d=depth;
	}
	double vol()
	{
		double v;
		v=h*w*d;
		return v;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		double a=sc.nextDouble();
		double b=sc.nextDouble();
		double c=sc.nextDouble();
		Box bx=new Box(a,b,c);
		System.out.println(bx.vol());

	}

}
