/*
 * generated by Xtext 2.21.0
 */
package edu.upb.lp.isc.validation;

import java.util.ArrayList;
import java.util.List;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.xtext.validation.AbstractDeclarativeValidator;

public abstract class AbstractPerronixValidator extends AbstractDeclarativeValidator {
	
	@Override
	protected List<EPackage> getEPackages() {
		List<EPackage> result = new ArrayList<EPackage>();
		result.add(edu.upb.lp.isc.perronix.PerronixPackage.eINSTANCE);
		return result;
	}
}