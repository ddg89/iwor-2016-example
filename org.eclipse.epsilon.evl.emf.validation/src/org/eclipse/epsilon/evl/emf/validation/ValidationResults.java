/*******************************************************************************
 * Copyright (c) 2008-2012 The University of York.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 * 
 * Contributors:
 *     Dimitrios Kolovos - initial API and implementation
 ******************************************************************************/
package org.eclipse.epsilon.evl.emf.validation;

import java.util.Collection;
import java.util.IdentityHashMap;

import org.eclipse.epsilon.evl.execute.UnsatisfiedConstraint;

public class ValidationResults extends IdentityHashMap<Object, Collection<UnsatisfiedConstraint>> {

	private static final long serialVersionUID = -4636840792602473855L;
	
}
