package com.maveric.deliveryms;

import org.apache.kafka.common.serialization.Serializer;

import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;

public class DeliveryMessageSerializer implements Serializer<DeliveryMessage> {
//    @Override
//    public byte[] serialize(String s, DeliveryMessage deliveryMessage) {
//        return new byte[0];
//    }
    @Override
    public byte[] serialize(String topic, DeliveryMessage data) {
        String text=data.getOrderID()+"-"+data.getStatus().name();
        return text.getBytes(StandardCharsets.UTF_8);
    }
}
