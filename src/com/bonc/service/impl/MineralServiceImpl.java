package com.bonc.service.impl;

import com.bonc.pojo.Mineral;
import com.bonc.pojo.Player;
import com.bonc.service.MineraService;

import java.util.Random;
import java.util.stream.IntStream;

public class MineralServiceImpl implements MineraService {
    /**
     * 挖掘金矿
     * @param player 玩家
     * @return
     */
    @Override
    public Mineral digGold(Player player) {
        Mineral mineral = new Mineral();
        mineral.setType("金矿");
        mineral.setAmount((int) (Math.random() * 6 + 1));
        System.out.println("玩家["+player.getName()+"]挖掘到"+mineral.getType()+mineral.getAmount()+"块");
        return mineral;
    }
}
