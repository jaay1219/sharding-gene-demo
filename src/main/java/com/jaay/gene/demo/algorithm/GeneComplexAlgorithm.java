package com.jaay.gene.demo.algorithm;

import groovyjarjarantlr4.v4.runtime.misc.NotNull;
import org.apache.shardingsphere.sharding.api.sharding.complex.ComplexKeysShardingAlgorithm;
import org.apache.shardingsphere.sharding.api.sharding.complex.ComplexKeysShardingValue;

import java.util.*;

/**
 * @author jaay1219
 * @date 20230416
 */
public class GeneComplexAlgorithm implements ComplexKeysShardingAlgorithm<Long> {

    private static volatile long id;
    private static volatile long _id;

    @Override
    public Collection<String> doSharding(Collection<String> availableTargetNames, ComplexKeysShardingValue<Long> shardingValue) {

        List<String> resultList = new ArrayList<>();
        Map<String, Collection<Long>> shardingMap = shardingValue.getColumnNameAndShardingValuesMap();
        shardingMap.forEach((key, value) -> {
            if ("id".equals(key)) {

                value.stream().forEach(v -> {
                    id = v;
                });

            } else if (key.endsWith("_id")) {

                value.stream().forEach(v -> {

                    _id = v;
                });
            }
        });

        resultList.add((String) availableTargetNames.toArray()[mod(geneGenerator(id, _id), availableTargetNames.size())]);

        return resultList;
    }

    @Override
    public Properties getProps() {
        return null;
    }

    @Override
    public void init(Properties properties) {

    }

    private static int mod(long id, int size) {

        return (int) (id & size) == size ? size - 1 : (int) (id & size);
    }

    private static synchronized Long geneGenerator(@NotNull Long id, @NotNull Long parentId) {

        long newId = (id << 3) + (parentId & ((2 << 2) - 1));

        return newId;
    }

}
