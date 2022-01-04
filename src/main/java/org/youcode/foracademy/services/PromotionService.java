package org.youcode.foracademy.services;


import org.youcode.foracademy.dao.PromotionDao;
import org.youcode.foracademy.dao.PromotionDaoImp;
import org.youcode.foracademy.models.Promotion;

import java.util.List;

public class PromotionService {
    private PromotionDao promotionDao;

    public PromotionService() {
        this.promotionDao= new PromotionDaoImp();
    }

    public PromotionService(PromotionDao promotionDao) {
        this.promotionDao = promotionDao;
    }
    public Promotion findById(long id_promotion){
        return promotionDao.findById(id_promotion);
    }
    public List<Promotion> findAll(){
        return promotionDao.findAll();
    }
    public boolean delete(long id_promotion){
        return promotionDao.delete(id_promotion);
    }
    public Promotion insert(Promotion promotion){
        return promotionDao.insert(promotion);
    }
    public Promotion update(Promotion promotion){
        return promotionDao.update(promotion);
    }


}
