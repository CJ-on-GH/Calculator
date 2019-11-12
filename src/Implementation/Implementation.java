package Implementation;
import Structure.*;
public class Implementation implements ScientificOperations, StandardOperations

{
	private double memory=0;
	
	
	@Override
	public double add(double a, double b) 
	{
		double sum;
		sum=a+b;
		return sum;
	}

	@Override
	public double substract(double a, double b)
	{
		double c;
		c=a-b;
		return c;
	}

	@Override
	public double multiply(double a, double b) 
	{
		double c;
		c=a*b;
		return c;
	}

	@Override
	public double devide(double a, double b) 
	{
	    double c;
	    c=a/b;
		return c;
	}

	@Override
	
	public double root(double a, double base) 
	{
		double c;
	    c=a*a;
		return c;
	}

	@Override
	public double percent(double a, double percent) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public void memorySave(double a) {
		// TODO Auto-generated method stub
		this.memory=a;
	}

	@Override
	public void memoryAdd(double a) {
		// TODO Auto-generated method stub
		this.memory=this.memory+a;
	}

	@Override
	public void memorySubstract(double a) {
		// TODO Auto-generated method stub
		
	}
	
	@Override
	public void memoryClear() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public double memoryReturn() 
	{
    	
		return 0;
	}

	@Override
	public void clear() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void clearEntry() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void clearAll() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public double sin(double a, boolean isInverse, char mode) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public double cos(double a, boolean isInverse, char mode) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public double tan(double a, boolean isInverse, char mode) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public double sinh(double a, boolean isInverse, char mode) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public double cosh(double a, boolean isInverse, char mode) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public double tanh(double a, boolean isInverse, char mode) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public double log(double a, double b) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public double lg(double a) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public double ln(double a) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public double pow(double a, double exp) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public double invert(double a) {
		// TODO Auto-generated method stub
		return 0;
	}

	
	
}
