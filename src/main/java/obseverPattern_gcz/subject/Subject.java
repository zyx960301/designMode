package obseverPattern_gcz.subject;

import obseverPattern_gcz.observer.Observer;

//主题
public interface Subject {
    void registerObserver(Observer O);
    void removeObserver(Observer O);
    void notifyObservers();
}
