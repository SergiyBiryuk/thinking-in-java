package task_13;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class Controller {
    private List<Event> eventList = new LinkedList<Event>();
    public void addEvent(Event c) { eventList.add(c); }
    public void run() {
        while(eventList.size() > 0) {
            Iterator<Event> it = new LinkedList<Event>(eventList).iterator();
            while(it.hasNext()) {
                Event e = it.next();
                if (e.ready()) {
                    System.out.println(e);
                    e.action();
                    eventList.remove(e);
                }
            }
        }
    }
}
