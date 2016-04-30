/**
 *
 * $Id$
 */
package fr.istic.m2miage.idm.uimm.validation;

import fr.istic.m2miage.idm.uimm.OptionType;

/**
 * A sample validator interface for {@link fr.istic.m2miage.idm.uimm.Option}.
 * This doesn't really do anything, and it's not a real EMF artifact.
 * It was generated by the org.eclipse.emf.examples.generator.validator plug-in to illustrate how EMF's code generator can be extended.
 * This can be disabled with -vmargs -Dorg.eclipse.emf.examples.generator.validator=false.
 */
public interface OptionValidator {
	boolean validate();

	boolean validateType(OptionType value);
	boolean validateValue(String value);
}
