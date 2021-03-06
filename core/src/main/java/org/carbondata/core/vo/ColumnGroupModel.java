/*
 * Licensed to the Apache Software Foundation (ASF) under one
 * or more contributor license agreements.  See the NOTICE file
 * distributed with this work for additional information
 * regarding copyright ownership.  The ASF licenses this file
 * to you under the Apache License, Version 2.0 (the
 * "License"); you may not use this file except in compliance
 * with the License.  You may obtain a copy of the License at
 *
 *    http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing,
 * software distributed under the License is distributed on an
 * "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
 * KIND, either express or implied.  See the License for the
 * specific language governing permissions and limitations
 * under the License.
 */
package org.carbondata.core.vo;

public class ColumnGroupModel {

  /**
   * cardinality all dimension
   */
  private int[] colGroupCardinality;

  /**
   * number of columns in columnar block
   */
  private int[] columnSplit;

  /**
   * total number of columns
   */
  private int noOfColumnsStore;

  /**
   * whether given index is columnar or not
   * true: columnar
   * false: row block
   */
  private boolean[] columnarStore;

  /**
   * column groups
   * e.g
   * {{0,1,2},3,4,{5,6}}
   */
  private int[][] columnGroups;

  /**
   * @return cardinality of column groups
   */
  public int[] getColumnGroupCardinality() {
    return colGroupCardinality;
  }

  /**
   * set columngroup cardinality
   *
   * @param columnGroupCardinality
   */
  public void setColumnGroupCardinality(int[] columnGroupCardinality) {
    this.colGroupCardinality = columnGroupCardinality;
  }

  /**
   * return columnSplit
   *
   * @return
   */
  public int[] getColumnSplit() {
    return columnSplit;
  }

  /**
   * set columnSplit
   *
   * @param split
   */
  public void setColumnSplit(int[] split) {
    this.columnSplit = split;
  }

  /**
   * @return no of columnar block
   */
  public int getNoOfColumnStore() {
    return this.noOfColumnsStore;
  }

  /**
   * set no of columnar block
   *
   * @param noOfColumnsStore
   */
  public void setNoOfColumnStore(int noOfColumnsStore) {
    this.noOfColumnsStore = noOfColumnsStore;
  }

  /**
   * it's an identifier for row block or single column block
   *
   * @param columnarStore
   */
  public void setColumnarStore(boolean[] columnarStore) {
    this.columnarStore = columnarStore;
  }

  /**
   * set column groups
   *
   * @param columnGroups
   */
  public void setColumnGroup(int[][] columnGroups) {
    this.columnGroups = columnGroups;
  }

  /**
   * check if given column group is columnar
   *
   * @param colGroup
   * @return true if given block is columnar
   */
  public boolean isColumnar(int colGroup) {
    return columnarStore[colGroup];
  }

  /**
   * @return columngroups
   */
  public int[][] getColumnGroup() {
    return this.columnGroups;
  }

}
