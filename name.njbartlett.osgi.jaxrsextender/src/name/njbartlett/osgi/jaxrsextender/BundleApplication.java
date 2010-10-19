/*******************************************************************************
 * Copyright (c) 2010 Neil Bartlett.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 * 
 * Contributors:
 *     Neil Bartlett - initial API and implementation
 ******************************************************************************/
package name.njbartlett.osgi.jaxrsextender;

import java.util.Set;

import javax.ws.rs.core.Application;

import org.osgi.framework.Bundle;

public class BundleApplication extends Application {
	private final Set<Class<?>> classes;

	public BundleApplication(Bundle bundle, Set<Class<?>> classes) {
		this.classes = classes;
	}
	
	@Override
	public Set<Class<?>> getClasses() {
		return this.classes;
	}
}
