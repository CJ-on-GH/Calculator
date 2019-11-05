package Structure;
/**
 * This interface represent the scientific operations our calculator.
 * @author Oleksii Baienko
 */
public interface ScientificOperations {
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
		
	double log(double a, double base);
	double lg(double a);
	double ln(double a);
}
