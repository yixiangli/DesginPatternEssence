package SingleTon;

/**
 * @User: liyixiang
 * @Date: 2017/11/28
 * @TODO:
 *      单例模型-枚举法
 */
public enum SingleTon4Enum {
    INSTANCE;

    // 不添加该方法则会出现反序列化时出现多个实例的问题
    public Object readResolve() {
        return INSTANCE;
    }
}

