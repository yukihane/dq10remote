package yukihane.dq10remote.communication;

import retrofit.http.GET;
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
 * Created by yuki on 15/07/07.
 */
public interface HappyService {

    /**
     * アカウント内のどのキャラクタに対して操作を行うか決定します. ログイン後この操作を行わないと他の操作は正常に終了しません.
     */
    @GET("/login/characterselect/{webPcNo}/")
    CharaSelectDto characterSelect(@Path("webPcNo") long webPcNo) throws HappyServiceException;

    /**
     * 討伐依頼のリストを取得します.
     */
    @GET("/tobatsu/tobatsulist/")
    TobatsuDto getTobatsuList() throws HappyServiceException;

    /**
     * 持ち物の場所一覧を取得します.
     */
    @GET("/profile/storagelist2/")
    StorageDto getStorageList2() throws HappyServiceException;

    /**
     * {@link #getStorageList2()} で得られた持ち物の場所に入っている持ち物一覧を取得します.
     * (おそらく)storageIdが100以上のものはこのAPIではエラーとなります.
     */
    @GET("/profile/itemlist/{storageId}/{storageIndex}/")
    StoredItemDto getStoredItemList(@Path("storageId") int storageId,
        @Path("storageIndex") int storageIndex)
        throws HappyServiceException;

    // storageIdが100のものはdoll
//    @GET("/profile/doll/{dollNo}/")
    // storageIdが101のものは送った手紙
//    @GET("/profile/postoffice/sendmailhist/")
    /**
     * @return バザー検索「種類」
     */
    @GET("/bazaar/largecategory/99/")
    LargeCategoryDto getLargeCategory() throws HappyServiceException;

    /**
     * @return バザー検索「種類2」
     */
    @GET("/bazaar/smallcategory/99/{largeCategory}/")
    SmallCategoryDto getSmallCategory(@Path("largeCategory") int largeCategoryId)
        throws HappyServiceException;

    /**
     * @return バザー検索
     */
    @GET("/bazaar/itemcount/99/{largeCategory}/{smallCategory}/")
    ItemCountDto getItemCount(
        @Path("largeCategory") int largeCategoryId,
        @Path("smallCategory") int smallCategoryId)
        throws HappyServiceException;

    @GET("/farm/login")
    FarmLoginDto farmLogin() throws HappyServiceException;

}
