/**
 */
package fr.istic.m2miage.idm.uimm;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Option</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link fr.istic.m2miage.idm.uimm.Option#getType <em>Type</em>}</li>
 *   <li>{@link fr.istic.m2miage.idm.uimm.Option#getValue <em>Value</em>}</li>
 * </ul>
 * </p>
 *
 * @see fr.istic.m2miage.idm.uimm.UimmPackage#getOption()
 * @model
 * @generated
 */
public interface Option extends Element {
	/**
	 * Returns the value of the '<em><b>Type</b></em>' attribute.
	 * The literals are from the enumeration {@link fr.istic.m2miage.idm.uimm.OptionType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Type</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Type</em>' attribute.
	 * @see fr.istic.m2miage.idm.uimm.OptionType
	 * @see #setType(OptionType)
	 * @see fr.istic.m2miage.idm.uimm.UimmPackage#getOption_Type()
	 * @model
	 * @generated
	 */
	OptionType getType();

	/**
	 * Sets the value of the '{@link fr.istic.m2miage.idm.uimm.Option#getType <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type</em>' attribute.
	 * @see fr.istic.m2miage.idm.uimm.OptionType
	 * @see #getType()
	 * @generated
	 */
	void setType(OptionType value);

	/**
	 * Returns the value of the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Value</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Value</em>' attribute.
	 * @see #setValue(String)
	 * @see fr.istic.m2miage.idm.uimm.UimmPackage#getOption_Value()
	 * @model
	 * @generated
	 */
	String getValue();

	/**
	 * Sets the value of the '{@link fr.istic.m2miage.idm.uimm.Option#getValue <em>Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Value</em>' attribute.
	 * @see #getValue()
	 * @generated
	 */
	void setValue(String value);

} // Option
