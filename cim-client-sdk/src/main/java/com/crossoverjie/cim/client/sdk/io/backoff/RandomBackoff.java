package com.crossoverjie.cim.client.sdk.io.backoff;

import java.util.concurrent.TimeUnit;

/**
 * @author:qjj
 * @create: 2024-09-21 12:22
 * @Description: random backoff strategy
 */

public class RandomBackoff implements BackoffStrategy {

    @Override
    public long nextBackoff() {
        int random = (int) (Math.random() * 7 + 3);
        return random;
    }

}
