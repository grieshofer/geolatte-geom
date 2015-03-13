/*
 * This file is part of the GeoLatte project.
 *
 *     GeoLatte is free software: you can redistribute it and/or modify
 *     it under the terms of the GNU Lesser General Public License as published by
 *     the Free Software Foundation, either version 3 of the License, or
 *     (at your option) any later version.
 *
 *     GeoLatte is distributed in the hope that it will be useful,
 *     but WITHOUT ANY WARRANTY; without even the implied warranty of
 *     MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 *     GNU Lesser General Public License for more details.
 *
 *     You should have received a copy of the GNU Lesser General Public License
 *     along with GeoLatte.  If not, see <http://www.gnu.org/licenses/>.
 *
 * Copyright (C) 2010 - 2013 and Ownership of code is shared by:
 * Qmino bvba - Romeinsestraat 18 - 3001 Heverlee  (http://www.qmino.com)
 * Geovise bvba - Generaal Eisenhowerlei 9 - 2140 Antwerpen (http://www.geovise.com)
 */

package org.geolatte.geom.codec.sqlserver;

import org.geolatte.geom.MultiPolygon;
import org.geolatte.geom.Position;

import java.util.List;

import static org.geolatte.geom.Geometries.mkMultiPolygon;

class MultiPolygonDecoder extends AbstractGeometryCollectionDecoder {

	@Override
	protected OpenGisType getOpenGisType() {
		return OpenGisType.MULTIPOLYGON;
	}

    @Override
    protected <P extends Position> MultiPolygon<P> createGeometry(List geometries, SqlServerGeometry<P> nativeGeom) {
        return mkMultiPolygon( geometries );
    }


}
