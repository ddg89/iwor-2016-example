package org.eclipse.epsilon.eol.dom;

import org.eclipse.epsilon.eol.exceptions.EolRuntimeException;
import org.eclipse.epsilon.eol.execute.context.IEolContext;
import org.eclipse.epsilon.eol.types.EolObjectComparator;

public class EqualsOperatorExpression extends EagerOperatorExpression {

	public EqualsOperatorExpression() {}
	
	public EqualsOperatorExpression(Expression firstOperand, Expression secondOperand) {
		super(firstOperand, secondOperand);
	}
	
	@Override
	public Object execute(Object o1, Object o2, IEolContext context) throws EolRuntimeException {
		return EolObjectComparator.equals(o1, o2);
	}
	
}
