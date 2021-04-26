package observer;

public interface Subject {
	
	  void subscribe(Observer observer);
	  void notifyObservers();
	  String getUpdate();
}
