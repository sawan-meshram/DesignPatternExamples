package observer;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class ObserverPatternTest {

	public static void main(String[] args) throws Exception {
//		Subject channel = new YutubeChannel();
		YutubeChannel channel = new YutubeChannel();

		Observer s1 = new Subscriber("Raj");
		Observer s2 = new Subscriber("Sham");
		
		channel.subscribe(s1);
		channel.subscribe(s2);
		
		channel.newVideoUploaded("Observer pattern video");

		channel.newVideoUploaded("Learn sington pattern video");
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		while(true) {
			System.out.println("\nPress 1. Upload new video");
			System.out.println("Press 2. Create new Subscriber");
			System.out.println("Press 3. Create new Unsubscriber");
			System.out.println("Press 4. Exit");
			System.out.print("Enter your choice :");
			int c = Integer.parseInt(br.readLine());
			if(c == 1) {
				System.out.print("Enter video title :");
				String title = br.readLine();
				channel.newVideoUploaded(title);
				
			}else if (c == 2) {
				System.out.print("Enter subscriber name :");
				String name = br.readLine();
				Observer temp = new Subscriber(name);
				channel.subscribe(temp);
			}else if (c == 3) {
				System.out.print("Enter subscriber name to unsubscibe :");
				String name = br.readLine();
				for(Observer ob : channel.getSubscribers()) {
					if(ob.getName().equalsIgnoreCase(name)) {
						channel.unsubscribe(ob);
						break;
					}
				}
			}
			else if (c == 4) {
				System.out.println("Program terminated.");
				break;
			}else {
				System.out.println("Wrong enter choice..");
			}
				
		}
		br.close();

	}

}
