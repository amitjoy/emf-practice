/**
 */
package production;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Content Genre</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see production.ProductionPackage#getContentGenre()
 * @model
 * @generated
 */
public enum ContentGenre implements Enumerator {
	/**
	 * The '<em><b>POLITICS</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #POLITICS_VALUE
	 * @generated
	 * @ordered
	 */
	POLITICS(1, "POLITICS", "POLITICS"),

	/**
	 * The '<em><b>PAGE3</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #PAGE3_VALUE
	 * @generated
	 * @ordered
	 */
	PAGE3(2, "PAGE3", "PAGE3"),

	/**
	 * The '<em><b>SPORTS</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #SPORTS_VALUE
	 * @generated
	 * @ordered
	 */
	SPORTS(3, "SPORTS", "SPORTS"),

	/**
	 * The '<em><b>MOVIES</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #MOVIES_VALUE
	 * @generated
	 * @ordered
	 */
	MOVIES(4, "MOVIES", "MOVIES");

	/**
	 * The '<em><b>POLITICS</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>POLITICS</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #POLITICS
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int POLITICS_VALUE = 1;

	/**
	 * The '<em><b>PAGE3</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>PAGE3</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #PAGE3
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int PAGE3_VALUE = 2;

	/**
	 * The '<em><b>SPORTS</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>SPORTS</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #SPORTS
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int SPORTS_VALUE = 3;

	/**
	 * The '<em><b>MOVIES</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>MOVIES</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #MOVIES
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int MOVIES_VALUE = 4;

	/**
	 * An array of all the '<em><b>Content Genre</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final ContentGenre[] VALUES_ARRAY =
		new ContentGenre[] {
			POLITICS,
			PAGE3,
			SPORTS,
			MOVIES,
		};

	/**
	 * A public read-only list of all the '<em><b>Content Genre</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<ContentGenre> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Content Genre</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static ContentGenre get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			ContentGenre result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Content Genre</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static ContentGenre getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			ContentGenre result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Content Genre</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static ContentGenre get(int value) {
		switch (value) {
			case POLITICS_VALUE: return POLITICS;
			case PAGE3_VALUE: return PAGE3;
			case SPORTS_VALUE: return SPORTS;
			case MOVIES_VALUE: return MOVIES;
		}
		return null;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private final int value;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private final String name;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private final String literal;

	/**
	 * Only this class can construct instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private ContentGenre(int value, String name, String literal) {
		this.value = value;
		this.name = name;
		this.literal = literal;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getValue() {
	  return value;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getName() {
	  return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getLiteral() {
	  return literal;
	}

	/**
	 * Returns the literal value of the enumerator, which is its string representation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		return literal;
	}
	
} //ContentGenre
