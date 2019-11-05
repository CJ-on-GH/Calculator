package Structure;
/**
 * This interface represent the scientific operations our calculator.
 * @author Oleksii Baienko
 */
public interface ScientificOperations {
	
	static final float e = 2.71828f;
	static final float pi = 3.14159f;
	
	/**
	 * NOTICE:
	 * -------
	 * For all functions sin, cos, tan, sinh,
	 * cosh, tanh and their inverse forms applies
	 * ================================================================
	 * | @param a         | A parameter of this function              |
	 * ---------------------------------------------------------------|
	 * | @param isInverse | True if this function is inverse          |
	 * ---------------------------------------------------------------|
	 * | @param mode      | A possible values of this parameter       |
	 * |                  | are 'D'/'R'/'G' as Degrees, Radians, Grads|
	 * ---------------------------------------------------------------|
	 * | @return          | Result of function                        |
	 * ================================================================
	 */
	
	double sin(double a, boolean isInverse, char mode);
	double cos(double a, boolean isInverse, char mode);
	double tan(double a, boolean isInverse, char mode);
	double sinh(double a, boolean isInverse, char mode);
	double cosh(double a, boolean isInverse, char mode);
	double tanh(double a, boolean isInverse, char mode);
	
	//==================== Logarithms =========================
	
	double log(double a, double b); // logarithm a with base b
	double lg(double a); // logarithm a with base 10
	double ln(double a); // logarithm a with base e
	
	//============== Other functions ==========================
	
	double pow(double a, double exp); // power function: base a, exponent exp
	//double powe(double a); // power function: base a, exponent e (euler's number)
	//double powten(double a); // power function: base a, exponent 10
	
}
