package Structure;
/**
 * This interface represent the standard operations our calculator.
 * @author Oleksii Baienko
 */
public interface StandardOperations {
	Double add(Double a, Double b); // +
	Double substract(Double a, Double b); // -
	Double multiply(Double a, Double b); // *
	Double devide(Double a, Double b); // /
	Double invert(Double a); // ±
	Double root(Double a, Double base); // √
	Double percent(Double a, Double percent); // %
	void memoryClear(); // MC
	Double memoryReturn(); // MR
	void memorySave(); // MS
	void memoryAdd(); // M+
	void memorySubstract(); // M-
	void clear(); // C
	void clearEntry(); // CE
}
