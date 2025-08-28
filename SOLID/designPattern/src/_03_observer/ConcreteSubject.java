package _03_observer;

import java.util.ArrayList;
import java.util.List;

public class ConcreteSubject implements Subject {

	List<Observer> observer = new ArrayList<>();
	
	@Override
	public void registerObserver(Observer o) {
		observer.add(o);
		System.out.println(o + "구독 완료");
	}
	
	
	// 관찰자에서 이벤트 송신	
		@Override
		public void notifyObserver() {
			for(Observer o : observer)
			System.out.println(o + "이벤트 알림이 왔습니다.");
		}
		
	
	// 관찰자에서 이벤트 송신	
	@Override
	public void removeObserver(Observer o) {
		observer.add(o);
		System.out.println(o + "구독 취소");
	}
	
	
}
