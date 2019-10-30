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
	 * | @param isInverse | Show if function is inverse               |
	 * ---------------------------------------------------------------|
	 * | @param mode      | A possible values of this parameter       |
	 * |                  | are 'D'/'R'/'G' as Degrees, Radians, Grads|
	 * ---------------------------------------------------------------|
	 * | @return          | Result of function                        |
	 * ================================================================
	 */
	
	Number sin(Number a, boolean isInverse, char mode);
	
}
