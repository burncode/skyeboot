package cn.hejinyo.dao;

import cn.hejinyo.annotation.BaseDao;
import cn.hejinyo.model.SysPermission;
import org.apache.ibatis.annotations.Mapper;

import java.util.Set;

/**
 * @author : HejinYo   hejinyo@gmail.com
 * @date : 2017/6/17 16:11
 * @Description :
 */
@Mapper
public interface SysPermissionDao extends BaseDao<SysPermission> {

    /**
     * 查找用户编号对应的权限编码字符串
     *
     * @param userId
     * @return
     */
    Set<String> getUserPermisSet(int userId);
}
