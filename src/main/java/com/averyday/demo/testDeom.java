package com.averyday.demo;

import org.springframework.util.StringUtils;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

/**
 * Description
 * Author ayt  on
 */
public class testDeom {
    public static void main(String[] args) {
        String swith = "100,203";
        Integer riderId = 100;
        boolean isAll = isAllocationOrder(swith, riderId);
        System.out.println(isAll);
    }

    public static boolean isAllocationOrder(String switchValue, Integer riderId) {
        if (StringUtils.isEmpty(switchValue)) {
            return false;
        } else {
            List<Integer> riderIdList = (List) Arrays.stream(switchValue.split(",")).map(Integer::valueOf).collect(Collectors.toList());
            return riderIdList.stream().filter((id) -> {
                return id.equals(riderId);
            }).findFirst().orElse( null) != null;
        }
    }
}
