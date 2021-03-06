package yukihane.dq10remote.communication;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import retrofit.RetrofitError;
import retrofit.http.Path;
import yukihane.dq10remote.communication.dto.CharaSelectDto;
import yukihane.dq10remote.communication.dto.bazaar.ItemCountDto;
import yukihane.dq10remote.communication.dto.bazaar.LargeCategoryDto;
import yukihane.dq10remote.communication.dto.bazaar.SmallCategoryDto;
import yukihane.dq10remote.communication.dto.farm.FarmLoginDto;
import yukihane.dq10remote.communication.dto.profile.StorageDto;
import yukihane.dq10remote.communication.dto.profile.StoredItemDto;
import yukihane.dq10remote.communication.dto.tobatsu.TobatsuDto;
import yukihane.dq10remote.exception.HappyServiceException;

/**
 * Created by yuki on 15/07/22.
 */
public class HappyServiceWrapper implements HappyService {

    private static final Logger LOGGER = LoggerFactory.getLogger(HappyServiceWrapper.class);

    private final HappyService service;

    HappyServiceWrapper(HappyService service) {
        this.service = service;
    }

    @Override
    public CharaSelectDto characterSelect(@Path("webPcNo") long webPcNo) throws HappyServiceException {
        try {
            LOGGER.info("HappyService characterSelect webPcNo: {}", webPcNo);
            CharaSelectDto res = service.characterSelect(webPcNo);
            if (res.getResultCode() != 0) {
                LOGGER.error("HappyService characterSelect error webPcNo: {}, resultCode: {}",
                    webPcNo, res.getResultCode());
                throw new HappyServiceException(res.getResultCode());
            }
            return res;
        } catch (RetrofitError e) {
            throw new HappyServiceException("characterSelect error webPcNo: " + webPcNo, e);
        }
    }

    @Override
    public TobatsuDto getTobatsuList() throws HappyServiceException {
        try {
            LOGGER.info("HappyService getTobatsuList");
            TobatsuDto res = service.getTobatsuList();
            if (res.getResultCode() != 0) {
                LOGGER.error("HappyService getTobatsuList error resultCode: {}",
                    res.getResultCode());
                throw new HappyServiceException(res.getResultCode());
            }
            return res;
        } catch (RetrofitError e) {
            throw new HappyServiceException("getTobatsuList error", e);
        }
    }

    @Override
    public StorageDto getStorageList2() throws HappyServiceException {
        try {
            LOGGER.info("HappyService getStorageList2");
            StorageDto res = service.getStorageList2();
            if (res.getResultCode() != 0) {
                LOGGER.error("HappyService getStorageList2 error resultCode: {}",
                    res.getResultCode());
                throw new HappyServiceException(res.getResultCode());
            }
            return res;
        } catch (RetrofitError e) {
            throw new HappyServiceException("getTobatsuList error", e);
        }
    }

    @Override
    public StoredItemDto getStoredItemList(
        @Path("storageId") int storageId, @Path("storageIndex") int storageIndex)
        throws HappyServiceException {
        try {
            LOGGER.info("HappyService getStoredItemList id: {}, index: {}", storageId, storageIndex);
            StoredItemDto res = service.getStoredItemList(storageId, storageIndex);
            if (res.getResultCode() != 0) {
                LOGGER.error("HappyService getStoredItemList error resultCode: {}",
                    res.getResultCode());
                throw new HappyServiceException(res.getResultCode());
            }
            return res;
        } catch (RetrofitError e) {
            throw new HappyServiceException("getTobatsuList error", e);
        }
    }

    @Override
    public LargeCategoryDto getLargeCategory() throws HappyServiceException {
        try {
            LOGGER.info("HappyService getLargeCategory");
            LargeCategoryDto res = service.getLargeCategory();
            if (res.getResultCode() != 0) {
                LOGGER.error("HappyService getLargeCategory error resultCode: {}",
                    res.getResultCode());
                throw new HappyServiceException(res.getResultCode());
            }
            return res;
        } catch (RetrofitError e) {
            throw new HappyServiceException("getLargeCategory error", e);
        }
    }

    @Override
    public SmallCategoryDto getSmallCategory(int largeCategoryId) throws HappyServiceException {
        try {
            LOGGER.info("HappyService getSmallCategory");
            SmallCategoryDto res = service.getSmallCategory(largeCategoryId);
            if (res.getResultCode() != 0) {
                LOGGER.error("HappyService getSmallCategory error resultCode: {}",
                    res.getResultCode());
                throw new HappyServiceException(res.getResultCode());
            }
            return res;
        } catch (RetrofitError e) {
            throw new HappyServiceException("getSmallCategory error", e);
        }
    }

    @Override
    public ItemCountDto getItemCount(int largeCategoryId, int smallCategoryId) throws HappyServiceException {
        try {
            LOGGER.info("HappyService getItemCount");
            ItemCountDto res = service.getItemCount(largeCategoryId, smallCategoryId);
            if (res.getResultCode() != 0) {
                LOGGER.error("HappyService getItemCount error resultCode: {}",
                    res.getResultCode());
                throw new HappyServiceException(res.getResultCode());
            }
            return res;
        } catch (RetrofitError e) {
            throw new HappyServiceException("getItemCount error", e);
        }
    }

    @Override
    public FarmLoginDto farmLogin() throws HappyServiceException {
        try {
            LOGGER.info("HappyService farmLogin");
            FarmLoginDto res = service.farmLogin();
            if (res.getResultCode() != 0) {
                LOGGER.error("HappyService farmLogin error resultCode: {}", res.getResultCode());
                throw new HappyServiceException(res.getResultCode());
            }
            return res;
        } catch (RetrofitError e) {
            throw new HappyServiceException("farmLogin error", e);
        }
    }
}
