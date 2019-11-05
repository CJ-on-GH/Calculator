package Structure;
/**
 * This interface represent the standard operations our calculator.
 * @author Oleksii Baienko
 */
public interface StandardOperations {
	double add(double a, double b); // +
	double substract(double a, double b); // -
	double multiply(double a, double b); // *
	double devide(double a, double b); // /
	double invert(double a); // ±
	double root(double a, double base); // √
	double percent(double a, double percent); // %
	void memoryClear(); // MC
	double memoryReturn(); // MR
	void memorySave(); // MS
	void memoryAdd(); // M+
	void memorySubstract(); // M-
	void clear(); // C
	void clearEntry(); // CE
	void clearAll(); // CA
}
