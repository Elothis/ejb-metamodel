/**
 */
package de.mkonersmann.ejb31;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc --> A representation of the literals of the enumeration
 * '<em><b>Java Type Reference Multipicity</b></em>', and utility methods for
 * working with them. <!-- end-user-doc -->
 * 
 * @see de.mkonersmann.ejb31.Ejb31Package#getJavaTypeReferenceMultipicity()
 * @model
 * @generated
 */
public enum JavaTypeReferenceMultipicity implements Enumerator {
	/**
	 * The '<em><b>ONE TO ONE</b></em>' literal object. <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @see #ONE_TO_ONE_VALUE
	 * @generated
	 * @ordered
	 */
	ONE_TO_ONE(0, "ONE_TO_ONE", "ONE_TO_ONE"),

	/**
	 * The '<em><b>ONE TO MANY</b></em>' literal object. <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @see #ONE_TO_MANY_VALUE
	 * @generated
	 * @ordered
	 */
	ONE_TO_MANY(1, "ONE_TO_MANY", "ONE_TO_MANY");

	/**
	 * The '<em><b>ONE TO ONE</b></em>' literal value. <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>ONE TO ONE</b></em>' literal object isn't
	 * clear, there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * 
	 * @see #ONE_TO_ONE
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int ONE_TO_ONE_VALUE = 0;

	/**
	 * The '<em><b>ONE TO MANY</b></em>' literal value. <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>ONE TO MANY</b></em>' literal object isn't
	 * clear, there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * 
	 * @see #ONE_TO_MANY
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int ONE_TO_MANY_VALUE = 1;

	/**
	 * An array of all the '<em><b>Java Type Reference Multipicity</b></em>'
	 * enumerators. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	private static final JavaTypeReferenceMultipicity[] VALUES_ARRAY = new JavaTypeReferenceMultipicity[] { ONE_TO_ONE,
			ONE_TO_MANY, };

	/**
	 * A public read-only list of all the '<em><b>Java Type Reference
	 * Multipicity</b></em>' enumerators. <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * 
	 * @generated
	 */
	public static final List<JavaTypeReferenceMultipicity> VALUES = Collections
			.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Java Type Reference Multipicity</b></em>' literal
	 * with the specified literal value. <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * 
	 * @param literal
	 *            the literal.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static JavaTypeReferenceMultipicity get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			JavaTypeReferenceMultipicity result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Java Type Reference Multipicity</b></em>' literal
	 * with the specified name. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @param name
	 *            the name.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static JavaTypeReferenceMultipicity getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			JavaTypeReferenceMultipicity result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Java Type Reference Multipicity</b></em>' literal
	 * with the specified integer value. <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * 
	 * @param value
	 *            the integer value.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static JavaTypeReferenceMultipicity get(int value) {
		switch (value) {
		case ONE_TO_ONE_VALUE:
			return ONE_TO_ONE;
		case ONE_TO_MANY_VALUE:
			return ONE_TO_MANY;
		}
		return null;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	private final int value;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	private final String name;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	private final String literal;

	/**
	 * Only this class can construct instances. <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * 
	 * @generated
	 */
	private JavaTypeReferenceMultipicity(int value, String name, String literal) {
		this.value = value;
		this.name = name;
		this.literal = literal;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public int getValue() {
		return value;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public String getName() {
		return name;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public String getLiteral() {
		return literal;
	}

	/**
	 * Returns the literal value of the enumerator, which is its string
	 * representation. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public String toString() {
		return literal;
	}

} // JavaTypeReferenceMultipicity
