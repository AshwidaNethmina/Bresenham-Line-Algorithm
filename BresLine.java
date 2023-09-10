import java.util.Scanner;

class BresLine
{
	public static void main(String args[])
	{
		line();
	}
	
	static void line()
	{
		int x, y, xend;
		Scanner sc = new Scanner(System.in);
		
		//Get user input for coordinates
		System.out.print("Enter the x coordinates of first point: ");
		int x1 = sc.nextInt();
		
		System.out.print("Enter the y coordinates of first point: ");
		int y1 = sc.nextInt();
		
		System.out.println();
		
		System.out.print("Enter the x cordinate of second point: ");
		int x2 = sc.nextInt();
		
		System.out.print("Enter the y cordinate of second point: ");
		int y2 = sc.nextInt();
		
		System.out.println();
				
		//Find delta x(dx) and delta y(dy)
		int dx = x1 - x2;
		//choose in which order does the coordinates should increment
		if(dx<0)
		{
			x = x1;
			y = y1;
			xend = x2;
		}
		else
		{
			x = x2;
			y = y2;
			xend = x1;
		}
		
		//find absolute values of dx and dy
		dx = abs(dx);
		int dy = y1 - y2;
		dy = abs(dy);
				
		int pk = 2*dy -dx;
		
		//plot first point
		plotpixel(x,y);
		
		//loop to find rest of the coordinates
		while(x<xend)
		{
			if(pk<0)
			{
				pk = pk+2*dy;
				x=x+1;
			}	
			else
			{
				pk = pk+2*dy-2*dx;
				x=x+1;
				y=y+1;
			}
			plotpixel(x,y);
		}
				
	}
	
	//function to find absolute values
	static int abs(int d)
	{
		if(d>=0)
			return d;
		else
			return (-1)*d;
	}
	
	
	//function to plot coordinates
	static void plotpixel(int x, int y)
	{
		System.out.println("("+x+", "+y+")");
	}
	
}
