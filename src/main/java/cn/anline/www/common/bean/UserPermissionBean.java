package cn.anline.www.common.bean;

import act.db.morphia.MorphiaModel;
import org.mongodb.morphia.annotations.Entity;

/**
 * 用户权限模型
 */
@Entity("user_permisson")
public class UserPermissionBean extends MorphiaModel<UserPermissionBean> {
}
