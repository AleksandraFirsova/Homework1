package core.hw4;

import java.util.ArrayDeque;
import java.util.Queue;

public class ServiceStation {

    private Queue<Transport> transportQueue = new ArrayDeque<>();

    private void addTransport(Transport transport) {
        transportQueue.offer(transport);
    }

    public void addCar(Car car) {
        addTransport(car);
    }

    public void addTruck(Truck truck) {
        addTransport(truck);
    }

    public void service() {
        if (!transportQueue.isEmpty()) {
            Transport transport = transportQueue.poll();
            Boolean result = transport.service();
            if (!result) {
                transport.repair();
            }
        }
    }
}
