/**
 * 
 * Copyright (c) 2006-2017, Speedment, Inc. All Rights Reserved.
 * 
 * Licensed under the Apache License, Version 2.0 (the "License"); You may not
 * use this file except in compliance with the License. You may obtain a copy of
 * the License at: 
 * 
 * http://www.apache.org/licenses/LICENSE-2.0
 * 
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS, WITHOUT
 * WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the
 * License for the specific language governing permissions and limitations under
 * the License.
 */
package com.speedment.runtime.field.internal.predicate.bytes;

import com.speedment.common.annotation.GeneratedCode;
import com.speedment.common.tuple.Tuple1;
import com.speedment.runtime.field.internal.predicate.AbstractFieldPredicate;
import com.speedment.runtime.field.predicate.PredicateType;
import com.speedment.runtime.field.trait.HasByteValue;

/**
 * @param <ENTITY> entity type
 * @param <D>      database type
 * 
 * @author Emil Forslund
 * @since  3.0.0
 */
@GeneratedCode(value = "Speedment")
public final class ByteEqualPredicate<ENTITY, D> extends AbstractFieldPredicate<ENTITY, Byte, HasByteValue<ENTITY, D>> implements Tuple1<Byte> {
    
    private final byte value;
    
    public ByteEqualPredicate(HasByteValue<ENTITY, D> field, byte value) {
        this(field, value, false);
    }
    
    ByteEqualPredicate(HasByteValue<ENTITY, D> field, byte value, boolean negated) {
        super(PredicateType.EQUAL, field, entity -> field.getAsByte(entity) == value, negated);
        this.value = value;
    }
    
    @Override
    public Byte get0() {
        return value;
    }
    
    @Override
    public ByteEqualPredicate<ENTITY, D> negate() {
        return new ByteEqualPredicate<>(getField(), value, !isNegated());
    }
}