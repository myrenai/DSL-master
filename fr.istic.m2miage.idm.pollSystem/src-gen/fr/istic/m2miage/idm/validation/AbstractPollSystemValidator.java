/*
 * generated by Xtext
 */
package fr.istic.m2miage.idm.validation;

import java.util.ArrayList;
import java.util.List;
import org.eclipse.emf.ecore.EPackage;

public class AbstractPollSystemValidator extends org.eclipse.xtext.validation.AbstractDeclarativeValidator {

	@Override
	protected List<EPackage> getEPackages() {
	    List<EPackage> result = new ArrayList<EPackage>();
	    result.add(fr.istic.m2miage.idm.pollSystem.PollSystemPackage.eINSTANCE);
		return result;
	}
}
