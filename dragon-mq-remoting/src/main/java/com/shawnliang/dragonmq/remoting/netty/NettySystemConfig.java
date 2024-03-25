/*
 * Licensed to the Apache Software Foundation (ASF) under one or more
 * contributor license agreements.  See the NOTICE file distributed with
 * this work for additional information regarding copyright ownership.
 * The ASF licenses this file to You under the Apache License, Version 2.0
 * (the "License"); you may not use this file except in compliance with
 * the License.  You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.shawnliang.dragonmq.remoting.netty;

public class NettySystemConfig {
    public static final String COM_ROCKETMQ_REMOTING_NETTY_POOLED_BYTE_BUF_ALLOCATOR_ENABLE =
        "dragon.remoting.nettyPooledByteBufAllocatorEnable";
    public static final String COM_ROCKETMQ_REMOTING_SOCKET_SNDBUF_SIZE =
        "dragon.remoting.socket.sndbuf.size";
    public static final String COM_ROCKETMQ_REMOTING_SOCKET_RCVBUF_SIZE =
        "dragon.remoting.socket.rcvbuf.size";
    public static final String COM_ROCKETMQ_REMOTING_SOCKET_BACKLOG =
        "dragon.remoting.socket.backlog";
    public static final String COM_ROCKETMQ_REMOTING_CLIENT_ASYNC_SEMAPHORE_VALUE =
        "dragon.remoting.clientAsyncSemaphoreValue";
    public static final String COM_ROCKETMQ_REMOTING_CLIENT_ONEWAY_SEMAPHORE_VALUE =
        "dragon.remoting.clientOnewaySemaphoreValue";
    public static final String COM_ROCKETMQ_REMOTING_CLIENT_WORKER_SIZE =
        "dragon.remoting.client.worker.size";
    public static final String COM_ROCKETMQ_REMOTING_CLIENT_CONNECT_TIMEOUT =
        "dragon.remoting.client.connect.timeout";
    public static final String COM_ROCKETMQ_REMOTING_CLIENT_CHANNEL_MAX_IDLE_SECONDS =
        "dragon.remoting.client.channel.maxIdleTimeSeconds";
    public static final String COM_ROCKETMQ_REMOTING_CLIENT_CLOSE_SOCKET_IF_TIMEOUT =
        "dragon.remoting.client.closeSocketIfTimeout";
    public static final String COM_ROCKETMQ_REMOTING_WRITE_BUFFER_HIGH_WATER_MARK_VALUE =
        "dragon.remoting.write.buffer.high.water.mark";
    public static final String COM_ROCKETMQ_REMOTING_WRITE_BUFFER_LOW_WATER_MARK =
        "dragon.remoting.write.buffer.low.water.mark";

    public static final boolean NETTY_POOLED_BYTE_BUF_ALLOCATOR_ENABLE = //
        Boolean.parseBoolean(System.getProperty(COM_ROCKETMQ_REMOTING_NETTY_POOLED_BYTE_BUF_ALLOCATOR_ENABLE, "false"));
    public static final int CLIENT_ASYNC_SEMAPHORE_VALUE = //
        Integer.parseInt(System.getProperty(COM_ROCKETMQ_REMOTING_CLIENT_ASYNC_SEMAPHORE_VALUE, "65535"));
    public static final int CLIENT_ONEWAY_SEMAPHORE_VALUE =
        Integer.parseInt(System.getProperty(COM_ROCKETMQ_REMOTING_CLIENT_ONEWAY_SEMAPHORE_VALUE, "65535"));
    public static int socketSndbufSize =
        Integer.parseInt(System.getProperty(COM_ROCKETMQ_REMOTING_SOCKET_SNDBUF_SIZE, "0"));
    public static int socketRcvbufSize =
        Integer.parseInt(System.getProperty(COM_ROCKETMQ_REMOTING_SOCKET_RCVBUF_SIZE, "0"));
    public static int socketBacklog =
        Integer.parseInt(System.getProperty(COM_ROCKETMQ_REMOTING_SOCKET_BACKLOG, "1024"));
    public static int clientWorkerSize =
        Integer.parseInt(System.getProperty(COM_ROCKETMQ_REMOTING_CLIENT_WORKER_SIZE, "4"));
    public static int connectTimeoutMillis =
        Integer.parseInt(System.getProperty(COM_ROCKETMQ_REMOTING_CLIENT_CONNECT_TIMEOUT, "3000"));
    public static int clientChannelMaxIdleTimeSeconds =
        Integer.parseInt(System.getProperty(COM_ROCKETMQ_REMOTING_CLIENT_CHANNEL_MAX_IDLE_SECONDS, "120"));
    public static boolean clientCloseSocketIfTimeout =
        Boolean.parseBoolean(System.getProperty(COM_ROCKETMQ_REMOTING_CLIENT_CLOSE_SOCKET_IF_TIMEOUT, "true"));
    public static int writeBufferHighWaterMark =
        Integer.parseInt(System.getProperty(COM_ROCKETMQ_REMOTING_WRITE_BUFFER_HIGH_WATER_MARK_VALUE, "0"));
    public static int writeBufferLowWaterMark =
        Integer.parseInt(System.getProperty(COM_ROCKETMQ_REMOTING_WRITE_BUFFER_LOW_WATER_MARK, "0"));

}
