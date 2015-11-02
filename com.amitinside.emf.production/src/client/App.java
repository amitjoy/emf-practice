package client;

import java.util.Iterator;
import java.util.Objects;
import observer.Observer1;
import observer.Observer2;
import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.EcorePackage;
import org.eclipse.emf.ecore.util.EcoreUtil;
import production.MyWeb;
import production.ProductionFactory;
import production.ProductionPackage;
import production.Webpage;
import emfswitch.Switch;

public class App {

	public static void main(String[] args) {

		final String nsURI = "http://www.example.org/production";
//		System.out.println(createEObject(nsURI, "Article"));

		MyWeb web = ProductionFactory.eINSTANCE.createMyWeb();
		web.setName("Mera Web");
		web.eAdapters().add(new Observer1());
		web.eAdapters().add(new Observer2());
		printAttributeValues(web);
		setStructuralFeatureValueReflectively(web,
				ProductionPackage.Literals.MY_WEB__NAME.getName());
		printAttributeValues(web);
		getStructuralFeature(web,
				ProductionPackage.Literals.MY_WEB__NAME.getName());
		listAllContainedValues(web);
		Webpage page = ProductionFactory.eINSTANCE.createWebpage();
		EStructuralFeature feature = page.eClass().getEStructuralFeature(ProductionPackage.Literals.WEBPAGE__NAME.getName());
		System.out.println(feature);
		System.out.println(page);
		EClass eClass = ProductionPackage.Literals.WEBPAGE;
		System.out.println(EcoreUtil.create(eClass));
		System.out.println(page.eGet(feature));
		new Switch().doSwitch(web);
	}

	public static EObject createEObject(String nsURI, String name) {
		EPackage ePackage = EPackage.Registry.INSTANCE.getEPackage(nsURI);
		EClass eClass = (EClass) ePackage.getEClassifier(name);
		return EcoreUtil.create(eClass);
	}

	public static void printAttributeValues(EObject eObject) {
		EClass eClass = eObject.eClass();
		Iterator<EAttribute> iterator = eClass.getEAllAttributes().iterator();

		while (iterator.hasNext()) {
			EAttribute attribute = iterator.next();
			if (eObject.eIsSet(attribute))
				System.out.println(eObject.eGet(attribute));
		}
	}

	public static void setStructuralFeatureValueReflectively(EObject eObject,
			String featureName) {
		EStructuralFeature feature = eObject.eClass().getEStructuralFeature(
				featureName);
		Objects.nonNull(featureName);
		if (feature.getEType() == EcorePackage.Literals.ESTRING) {
			eObject.eSet(feature, "Bamboo");
		}
	}

	public static void getStructuralFeature(EObject eObject, String featureName) {
		EStructuralFeature feature = eObject.eClass().getEStructuralFeature(
				featureName);
		System.out.println(eObject.eGet(feature));
	}

	public static void findObectContainer(EObject eObject) {
		Iterator<EReference> iterator = eObject.eClass().getEAllReferences()
				.iterator();

		while (iterator.hasNext()) {
			EReference reference = iterator.next();
			Objects.nonNull(reference);

			if (reference.isContainer()) {
				System.out.println(eObject.eGet(reference));
			}
		}
	}

	public static void listAllContainedValues(EObject eObject) {
		Iterator<?> containmentIterator = eObject.eContents().iterator();
		while (containmentIterator.hasNext()) {
			EObject feature = (EObject) containmentIterator.next();
			System.out.println(feature);
		}
	}

}
