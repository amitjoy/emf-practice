package observer;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.util.EContentAdapter;

public class Observer2 extends EContentAdapter {

	private final int k = 34;

	@Override
	public void notifyChanged(Notification notification) {
		System.out.print("Value Changed in Observer 2"
				+ notification.getNotifier());
		System.out.println();
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "Observer2 [target=" + target + ", resolve()=" + resolve()
				+ ", getTarget()=" + getTarget() + ", getClass()=" + getClass()
				+ ", hashCode()=" + hashCode() + ", toString()="
				+ super.toString() + "]";
	}

}
