/**
 *
 * $Id$
 */
package fr.istic.m2miage.idm.uimm.validation;

import fr.istic.m2miage.idm.uimm.Element;

import org.eclipse.emf.common.util.EList;

/**
 * A sample validator interface for {@link fr.istic.m2miage.idm.uimm.ListComponent}.
 * This doesn't really do anything, and it's not a real EMF artifact.
 * It was generated by the org.eclipse.emf.examples.generator.validator plug-in to illustrate how EMF's code generator can be extended.
 * This can be disabled with -vmargs -Dorg.eclipse.emf.examples.generator.validator=false.
 */
public interface ListComponentValidator {
	boolean validate();

	boolean validateElements(EList<Element> value);
}
