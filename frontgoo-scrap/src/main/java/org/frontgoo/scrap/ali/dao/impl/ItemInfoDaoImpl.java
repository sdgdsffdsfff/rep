package org.frontgoo.scrap.ali.dao.impl;

import org.frontgoo.orm.hibernate.base.GenericDaoHibernate;
import org.frontgoo.scrap.ali.dao.ItemInfoDao;
import org.frontgoo.scrap.ali.model.ItemInfo;
import org.springframework.stereotype.Repository;

@Repository("itemInfoDaoImpl")
public class ItemInfoDaoImpl extends GenericDaoHibernate<ItemInfo, String> implements
		ItemInfoDao {
	
	public void saveItemInfo(ItemInfo info) {
//		save(info);
		this.merge(info);
//		this.saveOrUpdate(info);
	}


	
}
