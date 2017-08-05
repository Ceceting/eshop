package cn.e3mall.service;

import cn.e3mall.pojo.TbItem;

/**
 * 根据商品id查询商品信息
 * @author lqtdc
 *
 */
public interface ItemService {
	TbItem getItemById(Long id);
}
