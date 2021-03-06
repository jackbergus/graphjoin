/*
 * INeigh.java
 * This file is part of databaseMappings
 *
 * Copyright (C) 2016 - Giacomo Bergami
 *
 * databaseMappings is free software; you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation; either version 3 of the License, or
 * (at your option) any later version.
 *
 * databaseMappings is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with databaseMappings. If not, see <http://www.gnu.org/licenses/>.
 */


package Neo4J.general;

import java.util.Iterator;

/**
 * Created by vasistas on 18/04/16.
 */
public interface INeigh extends Iterable<INeighVertex> {
    boolean addNeighbour(INeighVertex av);
    boolean removeNeighbour(INeighVertex dst);
    boolean hasNeighbour(INeighVertex dst);
    boolean hasIncoming(INeighVertex src);
    @Deprecated void addBackEdge(INeighVertex originalMaster);
    int sizeIngoing();
    Iterator<INeighVertex> iteratorIngoing();
    int sizeOutgoing();
    Iterator<INeighVertex> iteratorOutgoing();
    @Deprecated void deleteBackEdge(INeighVertex master);
    int getSize();
    boolean isEmpty();



}
