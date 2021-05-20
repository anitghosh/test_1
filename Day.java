public class Day
{
    public static void main(String[] args) 
    {
        Cuboid c1=new Cuboid();
        Cuboid c2=new Cuboid();
	Cuboid c3=new Cuboid();
        Cuboid c4=new Cuboid();
        
        System.out.println("A1: "+c1.surface_area());
        
	System.out.println("A2: "+c2.surface_area());
        
	System.out.println("V1: "+c1.volume());
    
        System.out.println("V2: "+c2.volume());
	
	System.out.println("A3: "+c1.surface_area());
        
	System.out.println("A4: "+c2.surface_area());
        
	System.out.println("V3: "+c1.volume());
    
        System.out.println("V4: "+c2.volume());
        
    }
    
}

class Cuboid
{
     private int l;
     private int b;
     private int h;
    
    	public int volume()
    	{
		int v;
		v=l*b*h;
        	return v;
	}
    
	public int surface_area()
	{
		int s;
		s=(2*((l*b)+(b*h)+(h*l)));
        	return s;
    	}
}