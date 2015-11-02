package observer;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.util.EContentAdapter;

public class Observer1 extends EContentAdapter {
	@Override
	public void notifyChanged(Notification notification) {
		System.out.println("Value Changed in Observer 1");
	}
}
