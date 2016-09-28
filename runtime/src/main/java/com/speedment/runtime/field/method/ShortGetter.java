package com.speedment.runtime.field.method;

import com.speedment.runtime.annotation.Api;
import javax.annotation.Generated;

/**
 * A short-cut functional reference to the {@code getXXX(value)} method for a
 * particular field in an entity.
 * <p>
 * A {@code ShortGetter<ENTITY>} has the following signature:
 * {@code
 *     interface ENTITY {
 *         short getXXX();
 *     }
 * }
 * 
 * @param <ENTITY> the entity
 * 
 * @author Emil Forslund
 * @since  3.0.0
 */
@Api(version = "3.0")
@Generated(value = "Speedment")
@FunctionalInterface
public interface ShortGetter<ENTITY> extends Getter<ENTITY> {
    
    /**
     * Returns the member represented by this getter in the specified instance.
     * 
     * @param instance the instance to get from
     * @return         the value
     */
    short applyAsShort(ENTITY instance);
    
    @Override
    default Short apply(ENTITY instance) {
        return applyAsShort(instance);
    }
}