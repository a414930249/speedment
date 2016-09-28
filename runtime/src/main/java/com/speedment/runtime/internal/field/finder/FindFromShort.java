package com.speedment.runtime.internal.field.finder;

import com.speedment.runtime.exception.SpeedmentException;
import com.speedment.runtime.field.ShortField;
import com.speedment.runtime.field.ShortForeignKeyField;
import com.speedment.runtime.manager.Manager;
import javax.annotation.Generated;

/**
 * @param <ENTITY>    entity type
 * @param <FK_ENTITY> foreign entity type
 * 
 * @author Emil Forslund
 * @since  3.0.0
 */
@Generated(value = "Speedment")
public final class FindFromShort<ENTITY, FK_ENTITY> extends AbstractFindFrom<ENTITY, FK_ENTITY, Short, ShortForeignKeyField<ENTITY, ?, FK_ENTITY>, ShortField<FK_ENTITY, ?>> {
    
    public FindFromShort(ShortForeignKeyField<ENTITY, ?, FK_ENTITY> source, ShortField<FK_ENTITY, ?> target, Manager<FK_ENTITY> manager) {
        super(source, target, manager);
    }
    
    @Override
    public FK_ENTITY apply(ENTITY entity) {
        final short value = getSourceField().getter().applyAsShort(entity);
        return getTargetManager().stream()
            .filter(getTargetField().equal(value))
            .findAny()
            .orElseThrow(() -> new SpeedmentException(
                "Error! Could not find any " + 
                getTargetManager().getEntityClass().getSimpleName() + 
                " with '" + getTargetField().identifier().columnName() + 
                "' = '" + value + "'."
            ));
    }
}