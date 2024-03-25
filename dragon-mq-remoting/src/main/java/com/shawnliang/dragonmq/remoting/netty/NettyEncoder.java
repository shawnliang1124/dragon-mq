package com.shawnliang.dragonmq.remoting.netty;

import com.shawnliang.dragonmq.remoting.protocol.RemotingCommand;
import io.netty.buffer.ByteBuf;
import io.netty.channel.ChannelHandlerContext;
import io.netty.handler.codec.MessageToByteEncoder;

public class NettyEncoder extends MessageToByteEncoder<RemotingCommand> {
    @Override
    protected void encode(ChannelHandlerContext channelHandlerContext, RemotingCommand remotingCommand, ByteBuf byteBuf) throws Exception {

    }
}
