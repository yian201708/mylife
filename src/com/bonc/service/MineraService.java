package com.bonc.service;

import com.bonc.pojo.Mineral;
import com.bonc.pojo.Player;

public interface MineraService {
    /**
     * 玩家随机挖掘1-6块金矿
     * @param player
     * @return
     */
    Mineral digGold(Player player);
}
