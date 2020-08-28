package com.navercorp

import java.io.Serializable

package object graph {
  //节点的属性，邻居节点，以及路径，比如   [1,2.5],[2,3.8]
  //1,2,3,4,14
  case class NodeAttr(var neighbors: Array[(Long, Double)] = Array.empty[(Long, Double)],
                      var path: Array[Long] = Array.empty[Long]) extends Serializable
  //边的属性：1.邻居边的路径长度 weight，J，Q
  case class EdgeAttr(var dstNeighbors: Array[Long] = Array.empty[Long],
                      var J: Array[Int] = Array.empty[Int],
                      var q: Array[Double] = Array.empty[Double]) extends Serializable
}
