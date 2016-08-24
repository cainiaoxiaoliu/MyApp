package com.lyg;

import io.netty.bootstrap.ServerBootstrap;
import io.netty.channel.ChannelOption;
import io.netty.channel.EventLoopGroup;
import io.netty.channel.nio.NioEventLoopGroup;
import io.netty.channel.socket.nio.NioServerSocketChannel;

/**
 * Created by lyg on 2016/8/22.
 */
public class NIOServer {
    public void bind(int port) throws Exception{
        EventLoopGroup bossGroup =new NioEventLoopGroup();
        EventLoopGroup wokerGroup =new NioEventLoopGroup();

           /* ServerBootstrap b=new ServerBootstrap();
            b.group(bossGroup,wokerGroup).channel(NioServerSocketChannel.class)
                    .option(ChannelOption.SO_BACKLOG,1024)
                    .childHandler(new Child);*/

    }
}
