/*******************************************************************************
 *    ___                  _   ____  ____
 *   / _ \ _   _  ___  ___| |_|  _ \| __ )
 *  | | | | | | |/ _ \/ __| __| | | |  _ \
 *  | |_| | |_| |  __/\__ \ |_| |_| | |_) |
 *   \__\_\\__,_|\___||___/\__|____/|____/
 *
 * Copyright (C) 2014-2019 Appsicle
 *
 * This program is free software: you can redistribute it and/or  modify
 * it under the terms of the GNU Affero General Public License, version 3,
 * as published by the Free Software Foundation.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU Affero General Public License for more details.
 *
 * You should have received a copy of the GNU Affero General Public License
 * along with this program.  If not, see <http://www.gnu.org/licenses/>.
 *
 ******************************************************************************/

package io.questdb.network;

import io.questdb.std.time.MillisecondClock;

public interface IODispatcherConfiguration {
    int BIAS_READ = 1;
    int BIAS_WRITE = 2;

    int getActiveConnectionLimit();

    int getBindIPv4Address();

    int getBindPort();

    MillisecondClock getClock();

    default String getDispatcherLogName() {
        return "IODispatcher";
    }

    EpollFacade getEpollFacade();

    int getEventCapacity();

    int getIOQueueCapacity();

    long getIdleConnectionTimeout();

    int getInitialBias();

    int getInterestQueueCapacity();

    int getListenBacklog();

    NetworkFacade getNetworkFacade();

    int getRcvBufSize();

    SelectFacade getSelectFacade();

    int getSndBufSize();
}