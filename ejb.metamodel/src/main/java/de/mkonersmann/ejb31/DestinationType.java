/**
 */
package de.mkonersmann.ejb31;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc --> A representation of the literals of the enumeration
 * '<em><b>Destination Type</b></em>', and utility methods for working with
 * them. <!-- end-user-doc -->
 * 
 * @see de.mkonersmann.ejb31.Ejb31Package#getDestinationType()
 * @model
 * @generated
 */
public enum DestinationType implements Enumerator {
	/**
	 * The '<em><b>NON DURABLE TOPIC</b></em>' literal object. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see #NON_DURABLE_TOPIC_VALUE
	 * @generated
	 * @ordered
	 */
	NON_DURABLE_TOPIC(0, "NON_DURABLE_TOPIC", "NON_DURABLE_TOPIC"),

	/**
	 * The '<em><b>QUEUE</b></em>' literal object. <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * 
	 * @see #QUEUE_VALUE
	 * @generated
	 * @ordered
	 */
	QUEUE(1, "QUEUE", "QUEUE"),

	/**
	 * The '<em><b>DURABLE TOPIC</b></em>' literal object. <!-- begin-user-doc
	 * --> <!-- end-user-doc -->
	 * 
	 * @see #DURABLE_TOPIC_VALUE
	 * @generated
	 * @ordered
	 */
	DURABLE_TOPIC(2, "DURABLE_TOPIC", "DURABLE_TOPIC");

	/**
	 * The '<em><b>NON DURABLE TOPIC</b></em>' literal value. <!--
	 * begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>NON DURABLE TOPIC</b></em>' literal object
	 * isn't clear, there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * 
	 * @see #NON_DURABLE_TOPIC
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int NON_DURABLE_TOPIC_VALUE = 0;

	/**
	 * The '<em><b>QUEUE</b></em>' literal value. <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>QUEUE</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * 
	 * @see #QUEUE
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int QUEUE_VALUE = 1;

	/**
	 * The '<em><b>DURABLE TOPIC</b></em>' literal value. <!-- begin-user-doc
	 * -->
	 * <p>
	 * If the meaning of '<em><b>DURABLE TOPIC</b></em>' literal object isn't
	 * clear, there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * 
	 * @see #DURABLE_TOPIC
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int DURABLE_TOPIC_VALUE = 2;

	/**
	 * An array of all the '<em><b>Destination Type</b></em>' enumerators. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	private static final DestinationType[] VALUES_ARRAY = new DestinationType[] { NON_DURABLE_TOPIC, QUEUE,
			DURABLE_TOPIC, };

	/**
	 * A public read-only list of all the '<em><b>Destination Type</b></em>'
	 * enumerators. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public static final List<DestinationType> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Destination Type</b></em>' literal with the specified
	 * literal value. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @param literal
	 *            the literal.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static DestinationType get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			DestinationType result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Destination Type</b></em>' literal with the specified
	 * name. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @param name
	 *            the name.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static DestinationType getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			DestinationType result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Destination Type</b></em>' literal with the specified
	 * integer value. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @param value
	 *            the integer value.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static DestinationType get(int value) {
		switch (value) {
		case NON_DURABLE_TOPIC_VALUE:
			return NON_DURABLE_TOPIC;
		case QUEUE_VALUE:
			return QUEUE;
		case DURABLE_TOPIC_VALUE:
			return DURABLE_TOPIC;
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
	private DestinationType(int value, String name, String literal) {
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

} // DestinationType
