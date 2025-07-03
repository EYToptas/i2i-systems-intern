import com.hazelcast.client.HazelcastClient;
import com.hazelcast.core.HazelcastInstance;
import com.hazelcast.map.IMap;

public class HazelcastClientApp {
    public static void main(String[] args) {
        HazelcastInstance client = HazelcastClient.newHazelcastClient();
        IMap<Integer, Person> peopleMap = client.getMap("people");

        // 10.000 adet Person nesnesi ekle
        for (int i = 1; i <= 10000; i++) {
            peopleMap.put(i, new Person("Person-" + i));
        }

        // İlk ve son 5 nesneyi yazdır
        for (int i = 1; i <= 5; i++) {
            System.out.println(peopleMap.get(i));
        }
        for (int i = 9996; i <= 10000; i++) {
            System.out.println(peopleMap.get(i));
        }

        client.shutdown();
    }
}
