package Structure;
/**
 * This interface represent the standard operations our calculator.
 * @author Oleksii Baienko
 */
public interface StandardOperations {
	Number add(Number a, Number b); // +
	Number substract(Number a, Number b); // -
	Number multiply(Number a, Number b); // *
	Number devide(Number a, Number b); // /
	Number invert(Number a); // ±
	Number root(Number a, Number base); // √
	Number percent(Number a, Number percent); // %
	void memoryClear(); // MC
	Number memoryReturn(); // MR
	void memorySave(); // MS
	void memoryAdd(); // M+
	void memorySubstract(); // M-
	void clear(); // C
	void clearEntry(); // CE
}
