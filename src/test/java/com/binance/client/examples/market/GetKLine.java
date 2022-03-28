package com.binance.client.examples.market;

import com.alibaba.fastjson.JSONArray;
import com.binance.client.RequestOptions;
import com.binance.client.SyncRequestClient;
import com.binance.client.examples.constants.PrivateConfig;
import com.binance.client.impl.utils.JsonWrapper;
import com.binance.client.impl.utils.JsonWrapperArray;
import com.binance.client.model.enums.IntervalType;

import java.util.Iterator;
import java.util.List;
import java.util.Map;

/**
 * @author : jingjun.liu@okg.com
 * @since : 2022/03/28 23:09
 */
public class GetKLine {
    public static void main(String[] args) {
        RequestOptions options = new RequestOptions();
        SyncRequestClient syncRequestClient = SyncRequestClient.create(PrivateConfig.API_KEY, PrivateConfig.SECRET_KEY,
                options);
//        System.out.println((System.currentTimeMillis() / 1000 / 60 - 1) * 60 * 1000);
        System.out.println(syncRequestClient.getKlines("BTCUSDT", IntervalType.MINUTE, 1648480320000L, 1648480433000L, 10));

//        String s = "[\n" +
//                "    [\n" +
//                "        1648451100000,\n" +
//                "        \"46980.00000000\",\n" +
//                "        \"46980.00000000\",\n" +
//                "        \"46967.79000000\",\n" +
//                "        \"46977.00000000\",\n" +
//                "        \"17.17738000\",\n" +
//                "        1648451159999,\n" +
//                "        \"806885.52782420\",\n" +
//                "        525,\n" +
//                "        \"13.27026000\",\n" +
//                "        \"623352.43104240\",\n" +
//                "        \"0\"\n" +
//                "    ]]";
//        JSONArray array = JSONArray.parseArray(s);
//        Iterator<Object> iterator = array.iterator();
//        while (iterator.hasNext()) {
//            Object next = iterator.next();
//            JSONArray item = (JSONArray) (next);
//            long startTime = item.getLongValue(0);
//        }
//        JsonWrapper jsonWrapper = JsonWrapper.parseFromString(s);
//        List<Map<String, String>> maps = jsonWrapper.convert2DictList();
    }
}
