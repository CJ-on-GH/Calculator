package Structure;
/**
 * This interface represent the standard operations our calculator.
 * 
 * @author Oleksii Baienko
 *
 */
public interface StandardOperations {
	Number memory = 0;
	public Number add(Number a, Number b);
	public Number substract(Number a, Number b);
	public Number multiply(Number a, Number b);
	public Number devide(Number a, Number b);
	public Number invert(Number a);
	public Number root(Number a, Number base);
	public Number percent(Number a, Number percent);
	public void memoryClear();
	public Number memoryReturn();
	public void memorySave();
	public void memoryAdd();
	public void memorySubstract();
}
