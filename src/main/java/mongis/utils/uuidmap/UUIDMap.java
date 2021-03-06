/*
    This file is part of ImageJ FX.

    ImageJ FX is free software: you can redistribute it and/or modify
    it under the terms of the GNU General Public License as published by
    the Free Software Foundation, either version 3 of the License, or
    (at your option) any later version.

    ImageJ FX is distributed in the hope that it will be useful,
    but WITHOUT ANY WARRANTY; without even the implied warranty of
    MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
    GNU General Public License for more details.

    You should have received a copy of the GNU General Public License
    along with ImageJ FX.  If not, see <http://www.gnu.org/licenses/>. 
    
     Copyright 2015,2016 Cyril MONGIS, Michael Knop
	
 */
package mongis.utils.uuidmap;

import java.util.UUID;
import java.util.concurrent.Callable;

/**
 *
 * @author Cyril MONGIS
 */
public interface UUIDMap<T> {

    Accessor<T> key(Object... keyComponent);

    UUID getId(Object... keyComponents);
    
    public interface Accessor<T> {

        UUIDMap<T> put(T t);

        boolean has();
        
        public T get();
        
        public T getOrPut(T t);

        public T getOrPutFrom(Callable<T> getter);

        UUID id();

    }

}
