package at.jku.se.prse.example.calculator.factory;

/**
 * Calculation Operation interface.<br>
 * Each Operation provided by the {@link OperationFactory} has to implement this
 * interface.
 *
 */
public interface ICalculationOperation {

	String caclulate(String input);

}
