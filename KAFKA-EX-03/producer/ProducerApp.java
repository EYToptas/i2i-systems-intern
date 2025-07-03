package producer;

import java.util.Properties;
import org.apache.kafka.clients.producer.*;
import org.apache.kafka.common.serialization.StringSerializer;

public class ProducerApp {
    public static void main(String[] args) {
        String topic = "student-topic";

        Properties props = new Properties();
        props.put("bootstrap.servers", "localhost:9092");
        props.put("key.serializer", StringSerializer.class.getName());
        props.put("value.serializer", StringSerializer.class.getName());

        KafkaProducer<String, String> producer = new KafkaProducer<>(props);
        String key = "1";
        String value = "1,Emirhan";

        ProducerRecord<String, String> record = new ProducerRecord<>(topic, key, value);
        producer.send(record, (meta, ex) -> {
            if (ex == null) {
                System.out.println("Sent: " + value + " to partition: " + meta.partition());
            } else {
                ex.printStackTrace();
            }
        });
        producer.close();
    }
}
