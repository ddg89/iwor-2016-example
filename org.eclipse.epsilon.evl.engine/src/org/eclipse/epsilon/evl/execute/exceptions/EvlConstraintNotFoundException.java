/*******************************************************************************
 * Copyright (c) 2008 The University of York.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 * 
 * Contributors:
 *     Dimitrios Kolovos - initial API and implementation
 ******************************************************************************/
package org.eclipse.epsilon.evl.execute.exceptions;

import org.eclipse.epsilon.common.parse.AST;
import org.eclipse.epsilon.eol.exceptions.EolRuntimeException;


public class EvlConstraintNotFoundException extends EolRuntimeException {
	
	protected String constraintName;
	
	public EvlConstraintNotFoundException(String constraintName, AST ast) {
		this.setAst(ast);
		this.constraintName = constraintName;
	}
	
	@Override
	public String getReason() {
		return "Constraint " + constraintName + " not found";
	}
	
}
