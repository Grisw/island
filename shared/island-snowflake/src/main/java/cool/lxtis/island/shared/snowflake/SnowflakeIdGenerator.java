package cool.lxtis.island.shared.snowflake;

import cn.hutool.core.util.IdUtil;
import org.hibernate.MappingException;
import org.hibernate.engine.spi.SharedSessionContractImplementor;
import org.hibernate.id.IdentityGenerator;

import java.io.Serializable;

public class SnowflakeIdGenerator extends IdentityGenerator {

    public static final String CLASS_NAME = SnowflakeIdGenerator.class.getName();

    @Override
    public Serializable generate(SharedSessionContractImplementor session, Object object) throws MappingException {
        return IdUtil.getSnowflake().nextId();
    }
}
