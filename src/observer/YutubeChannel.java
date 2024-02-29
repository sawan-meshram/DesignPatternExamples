package observer;

import java.util.ArrayList;
import java.util.List;

public class YutubeChannel implements Subject{
	private List<Observer> subscribers = new ArrayList<>();

	public List<Observer> getSubscribers() {
		return subscribers;
	}

	@Override
	public void subscribe(Observer ob) {
		this.subscribers.add(ob);
		
	}

	@Override
	public void unsubscribe(Observer ob) {
		this.subscribers.remove(ob);
	}

	@Override
	public void newVideoUploaded(String title) {
		for(Observer ob : subscribers) {
			ob.notified(title);
		}
	}
}
